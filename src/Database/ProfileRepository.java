package Database;


import Models.Profile;

import java.sql.ResultSet;
import java.util.ArrayList;

public class ProfileRepository {
    private SqlConnection connection = null;

    public ProfileRepository(SqlConnection sqlConnection) {
        this.connection = sqlConnection;
    }
    public ArrayList<Profile> getProfile(){
        ResultSet set = connection.executeSql("SELECT * FROM Profiel");

        ArrayList<Profile> profiles = new ArrayList<>();
        try {
            while (set.next()) {
                profiles.add(new Profile(
                        set.getInt("Abonneenummer"),
                        set.getString("Profielnaam"),
                        set.getString("Geboortedatum")));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return profiles;
    }
}
