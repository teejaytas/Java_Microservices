package Brands;

abstract class commonFeatures {
    abstract void simCard();
    abstract void camera();

    public void phoneDialer(){
        System.out.println("\n - phone call dialer");
    }

    public void sms(){
        System.out.println(" - SMS/MMS available.");
    }

    public void battery(){
        System.out.println(" - Long-lasting Battery");
    }

    public void calculator(){
        System.out.println(" - Calculator");
    }
    

//    public abstract void sim_card();
//
//    public abstract void phone_dialer();
//
//    public abstract void itunes_store();
}
