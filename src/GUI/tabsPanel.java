package GUI;

import com.sun.crypto.provider.JceKeyStore;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class tabsPanel extends JPanel {

    private TextField text = new TextField(20);
    private JFrame test = new JFrame();

    public tabsPanel(){
        super(new FlowLayout(FlowLayout.LEFT));
        createComponents();
        setBackground(Color.red);
    }

    private void createComponents(){
        JButton Overzicht1 = new JButton("Overzicht1");
        Overzicht1.setPreferredSize(new Dimension(100,40));
        JButton Overzicht2 = new JButton("Overzicht2");
        Overzicht2.setPreferredSize(new Dimension(100,40));
        JButton Overzicht3 = new JButton("Overzicht3");
        Overzicht3.setPreferredSize(new Dimension(100,40));
        JButton Overzicht4 = new JButton("Overzicht4");
        Overzicht4.setPreferredSize(new Dimension(100,40));

        //Overzicht1.addActionListener(this);
        JComponent overzicht1 = makeNewPanel();
        add(Overzicht1,overzicht1);
        add(Overzicht2);
        add(Overzicht3);
        add(Overzicht4);
    }

    //@Override
    //public void actionPerformed(ActionEvent e) {
    //    makeNewPanel();
    //}

    private JComponent makeNewPanel(){
        JPanel newPanel = new JPanel();
        newPanel.add(new JTextField("test"));
        return newPanel;
    }
}
