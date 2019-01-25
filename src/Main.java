import Database.SqlConnection;
import GUI.UserInterface;

import javax.swing.*;

public class Main {

    public static void main(String[] args){

        SqlConnection connection = new SqlConnection();
        String url = "jdbc:sqlserver://localhost\\MSSQLSERVER;databaseName=NetflixStatistix;integratedSecurity=true;";
        connection.connectDatabase(url);

        UserInterface ui = new UserInterface();
        SwingUtilities.invokeLater(ui);


    }
}
