package Kpplab;

import java.awt.*;
import java.awt.event.*;
class ColorPaintWindow extends Frame implements WindowListener, MouseListener, MouseMotionListener,KeyListener
{
    Point p1;
    int curColorIndex=1;
    Color curColor=Color.GREEN;
    public void windowOpened(WindowEvent e)
    {
    }
    public void windowClosed(WindowEvent e)
    {
    }
    public void windowActivated(WindowEvent e)
    {
    }
    public void windowDeactivated(WindowEvent e)
    {
    }
    public void windowIconified(WindowEvent e)
    {
    }
    public void windowDeiconified(WindowEvent e)
    {
    }
    public void windowClosing(WindowEvent e)
    {
        dispose();
        System.exit(0);
    }
    public void mouseClicked(MouseEvent e)
    {
    }
    public void mouseReleased(MouseEvent e)
    {
    }
    public void mouseEntered(MouseEvent e)
    {
    }
    public void mouseExited(MouseEvent e)
    {
    }
    public void mouseMoved(MouseEvent e)
    {
    }
    public void mousePressed(MouseEvent e)
    {
        p1=e.getPoint();
    }
    public void mouseDragged(MouseEvent e)
    {
        Point p2=e.getPoint();
        Graphics g=getGraphics();
        g.setColor(curColor);
        g.drawLine(p1.x,p1.y,p2.x,p2.y);
        p1=p2;
    }
    public void keyReleased(KeyEvent e)
    {
    }
    public void keyTyped(KeyEvent e)
    {
    }
    public void keyPressed(KeyEvent e)
    {
        int key=e.getKeyCode();
        switch (key)
        {
            case KeyEvent.VK_LEFT:
                curColorIndex-=1;
                break;
            case KeyEvent.VK_RIGHT:
                curColorIndex+=1;
                break;
            case KeyEvent.VK_UP:
                curColorIndex+=1;
                break;
            case KeyEvent.VK_DOWN:
                curColorIndex-=1;
                break;
            case KeyEvent.VK_DELETE:
                repaint();
        }
        if (curColorIndex==0) curColorIndex=13;
        if (curColorIndex==14) curColorIndex=1;
        switch (curColorIndex)
        {
            case 1:
                curColor=Color.BLACK;
                break;
            case 2:
                curColor=Color.BLUE;
                break;
            case 3:
                curColor=Color.CYAN;
                break;
            case 4:
                curColor=Color.DARK_GRAY;
                break;
            case 5:
                curColor=Color.GRAY;
                break;
            case 6:
                curColor=Color.GREEN;
                break;
            case 7:
                curColor=Color.LIGHT_GRAY;
                break;
            case 8:
                curColor=Color.MAGENTA;
                break;
            case 9:
                curColor=Color.ORANGE;
                break;
            case 10:
                curColor=Color.PINK;
                break;
            case 11:
                curColor=Color.RED;
                break;
            case 12:
                curColor=Color.WHITE;
                break;
            case 13:
                curColor=Color.YELLOW;
                break;
        }
        Graphics g=getGraphics();
        g.setColor(curColor);
        g.fillRect(110,30,50,12);
        g.setColor(Color.BLACK);
        g.drawRect(110,30,50,12);
        g.drawString("Поточний колір:",10,40);
    }
    public ColorPaintWindow()
    {
        super("Малювання курсором миші з використанням стандартних кольорів");
        addWindowListener(this);
        addMouseListener(this);
        addMouseMotionListener(this);
        addKeyListener(this);
        setSize(900,600);
        setVisible(true);
    }
    public static void main(String arg[])
    {
        ColorPaintWindow myWindow=new ColorPaintWindow();

    }

}      
