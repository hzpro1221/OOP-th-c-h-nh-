package tiDo.Test;

import tiDo.DigitalVideoDisc.DigitalVideoDisc;

public class TestPassingParameter {
    public static void main(String[] args){
    	System.out.println("Number of DVD before add jungleDVD : " + DigitalVideoDisc.getNbDigitalVideoDiscs());
    	DigitalVideoDisc jungleDVD = new DigitalVideoDisc("absxc1", "Jungle", "Advanture", 100000);
    	System.out.println("Number of DVD before after jungleDVD : " + DigitalVideoDisc.getNbDigitalVideoDiscs());
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("absxc2", "Cinderella", "Advanture", 100000);
        System.out.println("Number of DVD after add cinderellaDVD : " + DigitalVideoDisc.getNbDigitalVideoDiscs());
        swap(jungleDVD, cinderellaDVD);

        System.out.println("Jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("Cinderella dvd title: " + cinderellaDVD.getTitle());

        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("Jungle dvd title: " + jungleDVD.getTitle());
    }

    // ---------------------------------------------------------------------
    // Please write a swap() method that can correctly swap the two objects.
    public static void swap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        DigitalVideoDisc tmp = new DigitalVideoDisc(dvd1.getId(), dvd1.getTitle(), dvd1.getCategory(), dvd1.getPrice());

        dvd1.setId(dvd2.getId());
        dvd1.setTitle(dvd2.getTitle());
        dvd1.setCategory(dvd2.getCategory());
        dvd1.setPrice(dvd2.getPrice());

        dvd2.setId(tmp.getId());
        dvd2.setTitle(tmp.getTitle());
        dvd2.setCategory(tmp.getCategory());
        dvd2.setPrice(tmp.getPrice());
    }
    // ---------------------------------------------------------------------
    
    public static void changeTitle(DigitalVideoDisc dvd, String title){
        dvd.setTitle(title);
    }
    
}
