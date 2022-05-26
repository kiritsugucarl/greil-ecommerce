import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class mypanel extends JPanel implements ActionListener{

    final int PANEL_WIDTH = 600;
    final int PANEL_HEIGHT = 400;
    Image object;
    Image backgroundImage;
    Timer timer;
    int xVelocity = 2;
    int yVelocity = 1;
    int x = 0;
    int y = 0;

    mypanel(){
        try{
            this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
            this.setBackground(Color.black);
            object = new ImageIcon("D:\\Documents\\College Files\\Second Year College Files\\Second Sem\\Activities\\Computer Graphics\\GrielApp\\src\\Assets\\Images\\object.png").getImage();
            backgroundImage = new ImageIcon("D:\\Documents\\College Files\\Second Year College Files\\Second Sem\\Activities\\Computer Graphics\\GrielApp\\src\\Assets\\Images\\bg.jpg").getImage();
            timer = new Timer(10, this);
            timer.start();
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }

    public void paint(Graphics g) {

        super.paint(g); // paint background

        Graphics2D g2D = (Graphics2D) g;

        g2D.drawImage(backgroundImage, 0, 0, null);
        g2D.drawImage(object, x, y, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(x>=PANEL_WIDTH-object.getWidth(null) || x<0) {
            xVelocity = xVelocity * -1;
        }
        x = x + xVelocity;

        if(y>=PANEL_HEIGHT-object.getHeight(null) || y<0) {
            yVelocity = yVelocity * -1;
        }
        y = y + yVelocity;
        repaint();
    }
    
    
}

