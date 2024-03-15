import java.awt.*;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;


public class Main
{

    static Boolean Running;
    static int ScreenWidth = 800;
    static int ScreenHeight = 450;


    static GraphicsHandler GH = new GraphicsHandler(ScreenWidth, ScreenHeight);

    public static void main(String[] args)
    {
        AppStart();
        AppLoop();
    }

    public static void AppStart()
    {
        GH.Setup();
        Running = true;
    }

    public static void AppLoop()
    {
        while (Running)
        {
            Input();
            LogicUpdate();
            ScreenUpdate();
        }
    }

    public static void Input()
    {
        /*PointerInfo a = MouseInfo.getPointerInfo();
        Point b = a.getLocation();
        GH.MouseX = (int) b.getX();
        GH.MouseY = (int) b.getY();*/
    }

    public static void LogicUpdate()
    {
        if (GH.clicked && GH.MouseX > 0 && GH.MouseX < ScreenWidth/2 && GH.MouseY > (ScreenHeight - 40) && GH.MouseY < ScreenHeight)
        {

            GH.Repaint(GH.frame.getGraphics());
        }
        if (GH.clicked && GH.MouseX > ScreenWidth/2 && GH.MouseX < ScreenWidth && GH.MouseY > (ScreenHeight - 40) && GH.MouseY < ScreenHeight)
        {

            GH.Repaint(GH.frame.getGraphics());
        }
        if (GH.clicked && GH.MouseX > 0 && GH.MouseX < ScreenWidth/2 && GH.MouseY > (ScreenHeight - 80) && GH.MouseY < (ScreenHeight - 40))
        {

            GH.Repaint(GH.frame.getGraphics());
        }
        if (GH.clicked && GH.MouseX > ScreenWidth/2 && GH.MouseX < ScreenWidth && GH.MouseY > (ScreenHeight - 80) && GH.MouseY < (ScreenHeight - 40))
        {

            GH.Repaint(GH.frame.getGraphics());
        }
        if (GH.clicked && GH.MouseX > 0 && GH.MouseX < ScreenWidth/2 && GH.MouseY > (ScreenHeight - 120) && GH.MouseY < (ScreenHeight - 80) )
        {

            GH.Repaint(GH.frame.getGraphics());
        }
        if (GH.clicked && GH.MouseX > ScreenWidth/2 && GH.MouseX < ScreenWidth && GH.MouseY > (ScreenHeight - 120) && GH.MouseY < (ScreenHeight - 80))
        {

            GH.Repaint(GH.frame.getGraphics());
        }
    }

    public static void ScreenUpdate()
    {
        GH.Paint(GH.frame.getGraphics());
    }
}