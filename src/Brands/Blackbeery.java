package Brands;

public class Blackbeery extends commonFeatures {
    public void mi_store(){
        System.out.println(" - It have Blackberry Store");
    }

    public void mi_remote(){
        System.out.println(" - It has a Tv Control remote");
    }

    public void memory_card(){
        System.out.println(" - It have External Memory card slot.");
    }



    @Override
    public void simCard() {
        System.out.println(" - Double sim card slots");
    }

    public void camera(){
        System.out.println(" - 48MP primary + 12MP secondary camera");
    }
}
