package LabOOAP;

/**
 * Created by Bohdan on 03.11.2015.
 */
public class Main {
    public static void main(String[] args) {
        Ifactory factory = new AmericanTelephonFactory();
        String s;
        Nokia nokia = factory.getNokia();
        Samsung samsung = factory.getSamsung();

        System.out.println("Ціна нокії з америки:   " + nokia.getPrice()+"$     " + "Час доставки нокії з америки:   " + nokia.getTime());
        System.out.println("Ціна самсунгу з америки:    " + samsung.getPrice()+"$   " + "Час доставки самсунгу з америки:  " + samsung.getTime());



        Ifactory factory1 = new UkraineTelephonFactory();

        Nokia nokia1 = factory1.getNokia();
        Samsung samsung1 = factory1.getSamsung();
        System.out.println("Ціна нокії з америки:   " + nokia1.getPrice()+"$    " + "Час доставки нокії з америки:  " + nokia1.getTime());
        System.out.println("Ціна самсунгу з америки:    " + samsung1.getPrice()+"$      " + "Час доставки самсунгу з америки: " + samsung1.getTime());


    }
}
