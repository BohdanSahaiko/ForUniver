package Kpplab;//Обробка подій миші з допомогою інтерфейсу
import java.awt.*;
import java.awt.event.*;
class PaintWindow extends Frame implements WindowListener, MouseListener, MouseMotionListener
{
    Point p1;
    //Блок прослуховування подій вікна
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
    //Блок прослуховування подій миші
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
        if (e.getModifiers()==MouseEvent.BUTTON3_MASK) repaint();
    }
    public void mouseDragged(MouseEvent e)
    {
        Point p2=e.getPoint();
        Graphics g=getGraphics();
        g.drawLine(p1.x,p1.y,p2.x,p2.y);
        p1=p2;
    }
    //Конструктор основного класу
    public PaintWindow()
    {
        super("Малювання курсором миші");
        addWindowListener(this);
        addMouseListener(this);
        addMouseMotionListener(this);
        setSize(900,600);
        setVisible(true);
    }
    public static void main(String arg[])
    {
        PaintWindow myWindow=new PaintWindow();
    }
}
     