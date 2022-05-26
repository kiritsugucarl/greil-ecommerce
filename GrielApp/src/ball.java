import java.awt.*;

import javax.swing.*;

public class ball extends JFrame{

    mypanel panel;

    ball(){

        panel = new mypanel();

        this.setTitle("Ball Animation");
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }

    public static void main(String[] args)
    {
        ball myApp = new ball();
    }
}