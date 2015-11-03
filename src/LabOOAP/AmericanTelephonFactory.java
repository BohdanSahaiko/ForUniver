package LabOOAP;


public class AmericanTelephonFactory implements Ifactory {

    @Override
    public Nokia getNokia() {
        return new AmTeNo();
    }

    @Override
    public Samsung getSamsung() {
        return new AmTeSa();
    }
}
