package Kpplab;//Програма створення контекстного меню
import java.awt.*;
import java.awt.event.*;
public class ColorMenuContextWindow extends Frame implements WindowListener, ActionListener, ItemListener, MouseListener, MouseMotionListener
{
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
    Point p1;
    PopupMenu myPop;
    CheckboxMenuItem c1,c2,c3,c4;
    Color curColor=Color.BLUE;
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
        if (e.getModifiers()==MouseEvent.BUTTON3_MASK) myPop.show(this,p1.x,p1.y);
    }
    public void mouseDragged(MouseEvent e)
    {
        Point p2=e.getPoint();
        Graphics g=getGraphics();
        g.setColor(curColor);
        g.drawLine(p1.x,p1.y,p2.x,p2.y);
        p1=p2;
    }
    public void actionPerformed(ActionEvent e)
    {
        repaint();
    }
    public void itemStateChanged(ItemEvent e)
    {
        if (e.getItemSelectable()==c1)
        {
            c1.setState(true);
            c2.setState(false);
            c3.setState(false);
            c4.setState(false);
            curColor=Color.black;
        }
        else if (e.getItemSelectable()==c2)
        {
            c1.setState(false);
            c2.setState(true);
            c3.setState(false);
            c4.setState(false);
            curColor=Color.red;
        }
        else if (e.getItemSelectable()==c3)
        {
            c1.setState(false);
            c2.setState(false);
            c3.setState(true);
            c4.setState(false);
            curColor=Color.blue;
        }
        else if (e.getItemSelectable()==c4)
        {
            c1.setState(false);
            c2.setState(false);
            c3.setState(false);
            c4.setState(true);
            curColor=Color.yellow;
        }
    }
    void makeMenu()
    {
        myPop=new PopupMenu();
        c1=new CheckboxMenuItem("Чорний",false);
        c1.addItemListener(this);
        c2=new CheckboxMenuItem("Червоний",false);
        c2.addItemListener(this);
        c3=new CheckboxMenuItem("Синій",true);
        c3.addItemListener(this);
        c4=new CheckboxMenuItem("Жовтий",false);
        c4.addItemListener(this);
        myPop.add(c1);
        myPop.add(c2);
        myPop.add(c3);
        myPop.add(c4);
        myPop.add(new MenuItem("-"));
        MenuItem c5=new MenuItem("Очистити");
        c5.addActionListener(this);
        myPop.add(c5);
        this.add(myPop);
    }
    ColorMenuContextWindow()
    {
        super("Малювання з підтримкою кольорів");
        makeMenu();
        addWindowListener(this);
        addMouseListener(this);
        addMouseMotionListener(this);
        setSize(900,600);
        setVisible(true);
    }
    public static void main(String arg[])
    {
        ColorMenuContextWindow myWindow=new ColorMenuContextWindow();
    }
}    
