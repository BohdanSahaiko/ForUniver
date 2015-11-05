package Kpplab;//Приклад створення віконного меню
import java.awt.*;
import java.awt.event.*;
public class MenuWindow extends Frame implements WindowListener, ActionListener, ItemListener
{
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
    //Ініціалізація змінних
    String message, itemMessage;
    //Ініціалізація пунктів меню "Довідка"
    MenuItem h1,h2,h3;
    //Блок прослуховування події вибору пункту меню
//Метод вибору пункту (команди) меню
    public void actionPerformed(ActionEvent e)
    {
        if (message.length()>70) message="Команди меню:";
        String actionStr=(String) e.getActionCommand();
        if (actionStr.equals("Microsoft Word")) message+="->Microsoft Word";
        else if (actionStr.equals("Microsoft Excel")) message+="->Microsoft Excel";
        else if (actionStr.equals("Microsoft Access")) message+="->Microsoft Access";
        else if (actionStr.equals("Microsoft PowerPoint")) message+="->Microsoft PowerPoint";
        else if (actionStr.equals("Блокнот")) message+="->Блокнот";
        else if (actionStr.equals("Провідник")) message+="->Провідник";
        else if (actionStr.equals("Калькулятор")) message+="->Калькулятор";
        else if (actionStr.equals("Виклик довідки")) message+="->Виклик довідки";
        else if (actionStr.equals("Про програму")) message+="->Про програму";
        else if (actionStr.equals("Деактивізація"))
        {
            message+="->Деактивізація";
            h1.setEnabled(false);
            h2.setEnabled(false);
            h3.setLabel("Активізація");
        }
        else if (actionStr.equals("Активізація"))
        {
            message+="->Активізація";
            h1.setEnabled(true);
            h2.setEnabled(true);
            h3.setLabel("Деактивізація");
        }
        repaint();
    }
    //Блок прослуховування події вибору пункту меню з міткою("прапорцем")
    public void itemStateChanged(ItemEvent e)
    {
        if (e.getStateChange()==ItemEvent.SELECTED) itemMessage="Рядок стану: ТАК";
        else itemMessage="Рядок стану: НІ";
        repaint();
    }
    //Метод малювання графічних(текстових) обєктів у вікні
    public void paint(Graphics g)
    {
        g.drawString(message,10,300);
        g.drawString(itemMessage,10,320);
    }
    //Метод створення меню
    void makeMenu()
    {
//Створення рядка меню
        MenuBar myMenuBar=new MenuBar();
        setMenuBar(myMenuBar);
//Створення елемента меню "Програми"
        Menu programs=new Menu("Файл");
//Створення пунктів елемента меню "Програми"
     /*   MenuItem p1,p2,p3,p4;
        p1=new MenuItem("Microsoft Word");
        p1.addActionListener(this);
        programs.add(p1);
        p2=new MenuItem("Microsoft Excel");
        p2.addActionListener(this);
        programs.add(p2);
        p3=new MenuItem("Microsoft Access");
        p3.addActionListener(this);
        programs.add(p3);
        p4=new MenuItem("Microsoft PowerPoint");
        p4.addActionListener(this);
        programs.add(p4);*/
//Створення підменю "Стандартні"
        Menu standart=new Menu("Надіслати");
//Створення пунктів підменю "Стандартні"
        MenuItem s1,s2,s3;
        s1=new MenuItem("Факс");
        s1.addActionListener(this);
        standart.add(s1);
        s2=new MenuItem("Інтернет");
        s2.addActionListener(this);
        standart.add(s2);
     /*   s3=new MenuItem("Калькулятор");
        s3.addActionListener(this);
        standart.add(s3);*/
        programs.add(standart);
     //   programs.add(new MenuItem("-"));
//Створення пункту "Рядок стану" елемента меню "Програми"
      /*  CheckboxMenuItem p5=new CheckboxMenuItem("Рядок стану");
        p5.addItemListener(this);
        programs.add(p5);*/
//Додавання у рядок меню myMenuBar елемента меню "Програми"
        myMenuBar.add(programs);
//Створення елемента меню "Довідка"
        Menu help=new Menu("Вигляд");
//Створення пунктів елемента меню "Довідка"
        h1=new MenuItem("Панель");
        h1.addActionListener(this);
        help.add(h1);
        CheckboxMenuItem p5=new CheckboxMenuItem("Лінійка");

        p5.addItemListener(this);
        help.add(p5);
    /*    help.add(new MenuItem("-"));
        h3=new MenuItem("Деактивізація");
        h3.addActionListener(this);
        help.add(h3);*/
//Додавання у рядок меню myMenuBar елемента меню "Довідка"
        myMenuBar.add(help);
    }
    //Конструктор класу
    MenuWindow()
    {
        super("Вікно з рядком меню");
        makeMenu();
     //   message="Команди меню:";
    //    itemMessage="Рядок стану: ТАК";
        addWindowListener(this);
        setSize(250,250);
        setVisible(true);
    }
    public static void main(String arg[])
    {
        MenuWindow myWindow=new MenuWindow();
    }
}
