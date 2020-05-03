package com.company;

public class Main {

    public static void main(String[] args) {
	Iphone10 i = new Iphone10("aslk","saopkd");
        System.out.println(i.getMemory()+ " " + i.getApplication());
        i.person();
        System.out.println(i.info() + i);

        Iphone11pro i2 = new Iphone11pro(332,34,"chistyi");
        System.out.println(i2.getPhoto() + " " + i2.getVideo() + " " + i2.getScreen());

        Model m = new Model("2018 year","Iphone x10");
        System.out.println(m.getYearProducing() + " " + m.getModelIphone());
    }
}
