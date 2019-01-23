package GUI;

import javax.swing.*;
import java.awt.*;

public class viewPanel extends JPanel {

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

        String [] choices = {"Selecteer film of serie","Bird box", "Suits", "Homeland", "YOU", "Peaky Blinders", "The revenant", "Black mirror", "Sex education", "Luther", "Frontier", "Gotham", "Friends"};
        JComboBox<String> films = new JComboBox<String>(choices);
        films.setFont(SansSerif);
        films.setBounds(500,100,300,50);
        films.setBackground(Color.white);
        films.setEditable(false);
        add(films);

        JTextField account = new JTextField("Selecteer account");
        account.setFont(SansSerif);
        account.setBackground(Color.lightGray);
        account.setBorder(null);
        account.setEditable(false);
        account.setBounds(200,200,250,50);
        add(account);

        String [] accounts = {"Pawel Trajdos", "Martijn Doodewaard", "Stan Begthel", "Mark Rutte"};
        JComboBox<String> accountlijst = new JComboBox<String>(accounts);
        accountlijst.setFont(SansSerif);
        accountlijst.setBounds(500, 200, 300, 50);
        accountlijst.setBackground(Color.white);
        accountlijst.setEditable(false);
        add(accountlijst);

        JTextField resultField = new JTextField();
        resultField.setBackground(Color.white);
        resultField.setEditable(false);
        resultField.setBounds(100,300,750,580);
        add(resultField);
    }
}
