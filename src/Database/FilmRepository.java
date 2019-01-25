package Database;

import Models.Film;

import java.sql.ResultSet;
import java.util.ArrayList;

public class FilmRepository {

    private SqlConnection connection = null;

    public FilmRepository(SqlConnection sqlConnection) {
        this.connection = sqlConnection;

    }

    public ArrayList<Film> getMovies() {
        ResultSet set = connection.executeSql("SELECT * FROM Film");

        ArrayList<Film> movies = new ArrayList<>();
        try {
            while (set.next()) {
                movies.add(new Film(
                        set.getInt("Id"),
                        set.getString("Titel"),
                        set.getString("Leeftijdsindicatie"),
                        set.getString("Taal"),
                        set.getString("Tijdsduur"),
                        set.getString("Genre")));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return movies;
    }
}
