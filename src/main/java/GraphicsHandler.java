import java.awt.*;
import javax.swing.*;
import javax.swing.JPanel;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GraphicsHandler extends JFrame implements MouseListener
{
    JFrame frame = new JFrame("H.A.M.S");

    int SW;
    int SH;

    int MouseX = 0;
    int MouseY = 0;
    boolean clicked = false;


    public GraphicsHandler(int ScreenWidth, int ScreenHeight)
    {
        SW = ScreenWidth;
        SH = ScreenHeight;
    }

    public void Setup()
    {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(SW, SH);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.addMouseListener(this);




    }

    public void Paint(Graphics g)
    {
        Graphics2D g2D = (Graphics2D) g;
    }

    public void Repaint(Graphics g)
    {
        Graphics2D g2D = (Graphics2D) g;
        repaint();
    }

    public void mouseClicked(MouseEvent e)
    {
        System.out.println("Clicked");
        MouseY = e.getY();
        MouseX = e.getX();
    }
    public void mouseEntered(MouseEvent e)
    {
        System.out.println("Entered");
    }
    public void mouseExited(MouseEvent e)
    {
        //System.out.println("Exited");
    }
    public void mousePressed(MouseEvent e)
    {
        //System.out.println("Pressed");
        clicked = true;
    }
    public void mouseReleased(MouseEvent e)
    {
        //System.out.println("Released");
        clicked = false;
    }
}