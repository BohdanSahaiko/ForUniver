package Lab4;
/*
 Написати програму БУДИЛЬНИК з використанням шаблону BRIDGE. Нехай інтерфейс будильника
 AlarmC(інтерфейс абстракції), вміє запускатися (start),зупинятися (stop), та будити (toWake).
 Інтерфейс реалізації (AlarmCImpl)описує два методи, а саме ring тобто дзвонити та notify-повідомити.
 Воочевидь метод toWake буде по черзі викликати ці методи.
 */
public class FckLb4 extends Exception {
    public static void main(String[] args) {
        AlarmCImpl alrm = new MyAlarm();
        alrm.start();
        for(int i = 0 ; i<3000000;i++) {
            if(Math.random()>0.98)
                alrm.stop();
            alrm.toWake();
        }}}
