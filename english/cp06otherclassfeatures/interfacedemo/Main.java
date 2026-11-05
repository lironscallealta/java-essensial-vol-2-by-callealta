package english.cp06otherclassfeatures.interfacedemo;


interface Rechargeable {
    void recharge();
}

class Phone implements Rechargeable {
    @Override
    public void recharge() {
        System.out.println("Charging phone");
    }
}

class Battery implements Rechargeable {
    @Override
    public void recharge() {
        System.out.println("Charging battery");
    }
}

public class Main {

    static void charge(Rechargeable device) {
        device.recharge();
    }

    public static void main(String[] args) {
        Phone myPhone = new Phone();
        Battery myBattery = new Battery();

        charge(myPhone);
        charge(myBattery);
    }
}