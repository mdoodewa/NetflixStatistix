package GUI;

import javax.swing.*;
import java.awt.*;


public class UserInterface implements Runnable{

    private JFrame frame;

    public UserInterface(){
    }

    @Override
    public void run(){
        //Give a title for to the window
        frame = new JFrame("Netflix Statistix");

        //Initialising the window size
        frame.setPreferredSize(new Dimension(1000,1000));

        //Making sure the window actually closes when pressing the cross
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Filling the ui with components
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    public void createComponents(Container container){
        container.add(new viewPanel());
        container.add(new tabsPanel(), BorderLayout.NORTH);
        container.add(new footerPanel(), BorderLayout.SOUTH);
    }

    public JFrame getFrame(){
        return frame;
    }
}
