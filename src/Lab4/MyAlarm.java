package Lab4;


public class MyAlarm implements AlarmCImpl {

    private boolean b ;
    private boolean isPlaying;
    @Override
    public void start() {
        isPlaying = true;
    }

    @Override
    public void stop() {
        isPlaying = false;
    }

    @Override
    public void toWake() {
        if(!isPlaying)
            return ;
        if(b=!b)
            ring();else
            _notify();
    }

    @Override
    public void ring() {
        java.awt.Toolkit.getDefaultToolkit().beep();

    }

    @Override
    public void _notify() {
        System.out.println("notify");
    }

}
