package LabOOAP;

/**
 * Created by Bohdan on 03.11.2015.
 */
public class UkraineTelephonFactory implements Ifactory {
    @Override
    public Nokia getNokia() {
        return new UaTeNo();
    }

    @Override
    public Samsung getSamsung() {
        return new UaTeSa();
    }
}
