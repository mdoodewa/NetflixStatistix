package GUI;

import javax.swing.*;
import java.awt.*;

public class footerPanel extends JPanel {

    public footerPanel(){
        super(new GridLayout(1,2));
        createComponents();
    }

    public void createComponents(){
        add(new JTextField("Netflix Statistix"));
        add(new JTextField("Informatica, jaar 1, 23IVT1A1, Martijn Doodewaard 2145895"));
    }
}
