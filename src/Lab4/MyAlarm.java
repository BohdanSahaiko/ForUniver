package Lab4;


public class MyAlarm implements AlarmCImpl {

    private boolean b ;
    private boolean isPlaying;
    public void start() {
        isPlaying = true;
    }
    public void stop() {
        isPlaying = false;
    }
    public void toWake() {
        if(!isPlaying)
            return ;
        if(b=!b)
            ring();else
            _notify();
    }
    public void ring() {
        java.awt.Toolkit.getDefaultToolkit().beep();
    }
    public void _notify() {
        System.out.println("notify");
    }
}
