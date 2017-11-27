package com.stomichal;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    static ArrayList<Colour> listaKolorow = new ArrayList<>();
    static ArrayList<Colour> listaKolorow2 = new ArrayList<>();
    static ArrayList<String> listaKolor = new ArrayList<>();
    static int index;
    static ArrayList<Integer> listaIndex=new ArrayList<>();

    public static void main(String[] args) {
        // write your code here
        listaKolorow.add(new Colour("żółty", "Melur", "sloneczny"));
        listaKolorow.add(new Colour("róż", "Dulux", "letniRoz"));
        listaKolorow.add(new Colour("żółty", "Melur", "sloneczny"));
        listaKolorow.add(new Colour("róż", "Bondo", "Roz"));
        listaKolorow.add(new Colour("żółty", "Melur", "sloneczny"));
        listaKolorow.add(new Colour("żółty", "Melur", "sloneczny"));
        listaKolorow.add(new Colour("żółty", "Melur", "sloneczny"));
        listaKolorow.add(new Colour("żółty", "Melur", "sloneczny"));
        listaKolorow.add(new Colour("żółty", "Melur", "sloneczny"));
        listaKolorow.add(new Colour("żółty", "Melur", "sloneczny"));
        listaKolorow.add(new Colour("czerwony", "Burbu", "krwisty"));
        listaKolorow.add(new Colour("zielony", "Wotso", "lesny"));
//        //     wyswietl();


        listaKolorow2.add(new Colour("bialy", "White", "letniRoz"));
        listaKolorow2.add(new Colour("bialy", "Whiteee", "Roz"));
        listaKolorow2.add(new Colour("niebieski", "Blue", "sloneczny"));
        listaKolorow2.add(new Colour("niebieski", "Blauee", "krwisty"));

        listaKolor.add("Bialy");
        listaKolor.add("Żółty");
        listaKolor.add("Czerwony");
        listaKolor.add("Czarny");
        // System.out.println(listaKolor);

//        Iterator<Colour> iterator = listaKolorow.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next().getCompany());
//            System.out.println("******************");
//        }
        //       listaKolorow.add(0, new Colour("biały", "BLABLA", "śnieżny"));
        addAtTheFirstPlace(3, "biały", "BLABLUU", "snieżny");
//
        for (Colour e : listaKolorow) {

            System.out.println(e.getMainKind() + "/ " + e.getCompany() + "/ " + e.getName());
        }

        zamień2("żółty", "Melur", "sloneczny", "szary", "AAA", "wilk");

        for (Colour e : listaKolorow) {

            System.out.println(e.getMainKind() + "/ " + e.getCompany() + "/ " + e.getName());
        }
    }


    public static void wyswietl() {
        for (int i = 0; i < listaKolorow.size(); i++) {
            System.out.println(listaKolorow.get(i).getMainKind() + " / " + listaKolorow.get(i).getCompany());
        }
    }


    public static void addAtTheFirstPlace(int miejsce, String colourKind, String companyName, String productName) {
        if (listaKolorow.size() < miejsce - 1) {
            System.out.println("w tabeli jest " + listaKolorow.size() + " elementów");
        } else {
            listaKolorow.add(miejsce - 1, new Colour(colourKind, companyName, productName));
        }
    }

    public static void zamień(String kolorSzukany, String firmaSzukana, String nazwaSzukana, String kolorZam, String firmaZam, String nazwaZam) {
        if (seekAndChange(kolorSzukany, firmaSzukana, nazwaSzukana)) {
            Iterator<Colour> iterator = listaKolorow.iterator();
            Colour test = new Colour(kolorSzukany, firmaSzukana, nazwaSzukana);
            Colour zamiana = new Colour(kolorZam, firmaZam, nazwaZam);
            boolean zmienna = false;
            while (!zmienna && iterator.hasNext()) {
                int j = listaKolorow.indexOf(iterator.next()) + 1;
                System.out.println("j= " + j);
                if (iterator.next().getMainKind().equals(test.getMainKind())) {


                    listaKolorow.set(j, zamiana);


                    zmienna = true;
                }
            }
        } else {
            System.out.println("Dubel");
        }
    }


    public static boolean seekAndChange(String kolor, String firma, String nazwa) {
        Iterator<Colour> iterator = listaKolorow.iterator();
        Colour test = new Colour(kolor, firma, nazwa);

        boolean zmienna = false;
        while (iterator.hasNext()) {
            int h = listaKolorow.indexOf(iterator.next());
            if ((listaKolorow.get(h).getMainKind().equals(test.getMainKind())) &&
                    (listaKolorow.get(h).getCompany().equals(test.getCompany()))&&
                    (listaKolorow.get(h).getName().equals(test.getName()))) {
//                System.out.println("Mam Cię");
                listaIndex.add(h);
                System.out.println("True " + h);

                zmienna = true;
            } else {
                System.out.println("False " + h);
            }


        }
        return zmienna;
    }

    public static void zamień2(String kolorSzukany, String firmaSzukana, String nazwaSzukana, String kolorZam, String firmaZam, String nazwaZam) {
        if (seekAndChange(kolorSzukany, firmaSzukana, nazwaSzukana)) {

            Colour zamiana = new Colour(kolorZam, firmaZam, nazwaZam);

            for(int i=0;i<listaIndex.size();i++){
                listaKolorow.set(listaIndex.get(i).intValue(),zamiana);
            }

        }

    }
}
