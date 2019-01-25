package GUI;

import Database.FilmRepository;
import Database.ProfileRepository;
import Database.SerieRepository;
import Database.SqlConnection;
import Models.Film;
import Models.Profile;
import Models.Serie;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

public class viewPanel extends JPanel {

    private SqlConnection connection = new SqlConnection();
    private String url = "jdbc:sqlserver://localhost\\MSSQLSERVER;databaseName=NetflixStatistix;integratedSecurity=true;";

    public viewPanel(){
        createComponents();
    }

    public void createComponents(){
        setLayout(null);
        JTextField select = new JTextField("Selecteer film of serie");
        Font SansSerif = new Font("SansSerif", Font.PLAIN, 20);
        select.setFont(SansSerif);
        select.setBackground(Color.lightGray);
        select.setBorder(null);
        select.setEditable(false);
        select.setBounds(200,100,250,50);
        add(select);

        connection.connectDatabase(url);
        FilmRepository FilmTitles = new FilmRepository(connection);
        ArrayList<Film> films = FilmTitles.getMovies();
        ArrayList<String> choices = new ArrayList<>();
        for(Film film : films){
            choices.add(film.getTitle());
        }

        SerieRepository SerieTitles = new SerieRepository(connection);
        ArrayList<Serie> series = SerieTitles.getSeries();
        for(Serie serie : series){
            choices.add(serie.getSerie());
        }

        String [] AllChoices = choices.toArray(new String[choices.size()]);
        Arrays.sort(AllChoices);

        JComboBox<String> films1 = new JComboBox<String>(AllChoices);
        films1.setFont(SansSerif);
        films1.setBounds(500,100,300,50);
        films1.setBackground(Color.white);
        films1.setEditable(false);
        add(films1);

        JTextField account = new JTextField("Selecteer profiel");
        account.setFont(SansSerif);
        account.setBackground(Color.lightGray);
        account.setBorder(null);
        account.setEditable(false);
        account.setBounds(200,200,250,50);
        add(account);


        ProfileRepository profilenames = new ProfileRepository(connection);
        ArrayList<Profile> profiles = profilenames.getProfile();
        ArrayList<String> profilename = new ArrayList<>();
        for(Profile p : profiles){
            profilename.add(p.getName());
        }
        String [] accounts = profilename.toArray(new String[profilename.size()]);
        Arrays.sort(accounts);

        JComboBox<String> accountlijst = new JComboBox<String>(accounts);
        accountlijst.setFont(SansSerif);
        accountlijst.setBounds(500, 200, 300, 50);
        accountlijst.setBackground(Color.white);
        accountlijst.setEditable(false);
        add(accountlijst);

        JButton okbutton = new JButton("ok");
        okbutton.setBounds(700,260,100,50);
        okbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        add(okbutton);

        JTextField resultField = new JTextField();
        resultField.setBackground(Color.white);
        resultField.setEditable(false);
        resultField.setBounds(100,315,750,580);
        add(resultField);


    }


}
