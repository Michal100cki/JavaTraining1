package com.stomichal;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Customer> customerArrayList;
    private static Scanner scanner = new Scanner(System.in);
    private static Branch oddzial = new Branch("Pierwszy");

    public static void main(String[] args) {

        boolean quit = false;
        printAction();
        while (!quit) {
            System.out.println("Witaj, co robimy ");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("koniec");
                    quit = true;
                    break;
                case 1:
                    dodanieKlienta();
                    break;
                case 2:
                    wyswietlListe();
                    break;
                case 3:
                    operacje();
                    break;
            }
        }
    }

    public static void printAction() {
        System.out.println("Wybierz działanie: \n" +
                "0. quit\n" +
                "1. dodaj klienta\n" +
                "2. wyswietl liste klientow\n" +
                "3. wykonanie transakcji\n");
    }


    public static void dodanieKlienta() {

        System.out.println("Imie Klienta");
        String name = scanner.nextLine();
        System.out.println("wpłata");
        Double wplata = Double.valueOf(scanner.nextLine());
        System.out.println(name + " " + wplata);
        Customer newCustomer = Customer.createCustomer(name, wplata);
        oddzial.addCustomer(newCustomer);
    }

    public static void wyswietlListe() {
        oddzial.printCustomersList();
    }

    public static Double wplataKasy() {
        System.out.println("Podaj wartość wpłaty: ");
        Double wartosc = Double.valueOf(scanner.nextLine());
        return wartosc;
    }

    public static void operacje() {
        System.out.println("Rodzaj transakcji:\n" +
                "1. Wpłata\n" +
                "2. Wypłata ");
        int rodzaj = scanner.nextInt();
        scanner.nextLine();
        switch (rodzaj) {
            case 1:
                operacjaWplay();
                break;
            case 2:
                operacjaWyplaty();
                break;
            case 3:
            default:
                printAction();
                break;
        }

    }

    public static void operacjaWplay() {
        System.out.println("Imie Klienta");
        String name = scanner.nextLine();

        System.out.println("Wartość wpłaty");
        double wplata = 0;
        wplata = Double.valueOf(scanner.nextLine());
        if (wplata <= 0) {
            System.out.println("Kwota wpłaty musi być wprowadzona jako wartość dodatnia");
        } else {
            System.out.println(name + " " + wplata);

            if (oddzial.findCustomer(name) >= 0) {
                double staraKwota = oddzial.getListaKlientow().get(oddzial.findCustomer(name)).getWplaty();
                System.out.println("Stara Kwota " + staraKwota);
                double newKwota = staraKwota + wplata;
                System.out.println("Stan po wplacie " + newKwota);
                Customer oldCustomer = new Customer(name, staraKwota);
                Customer customer = new Customer(name, newKwota);
                oddzial.addCash(oldCustomer, customer);
            } else {
                System.out.println("Nie mamy Klienta o nazwisku " + name);
            }
        }

    }

    public static void operacjaWyplaty() {
        System.out.println("Imie Klienta");
        String name = scanner.nextLine();

        System.out.println("Wartość wyplaty");
        double wyplata = 0;
        wyplata = Double.valueOf(scanner.nextLine());
        if (wyplata <= 0) {
            System.out.println("Wprowadzona wartość wypłaty musi być wartością dodatnią");
        } else {
            if (oddzial.findCustomer(name) >= 0) {
                double staraKwota = oddzial.getListaKlientow().get(oddzial.findCustomer(name)).getWplaty();
                System.out.println("Stara Kwota " + staraKwota);
                double newKwota = staraKwota - wyplata;
                System.out.println("Stan po wyplacie: " + newKwota);
                Customer oldCustomer = new Customer(name, staraKwota);
                Customer customer = new Customer(name, newKwota);
                oddzial.addCash(oldCustomer, customer);
            } else {
                System.out.println("Nie mamy Klienta o nazwisku " + name);
            }
        }
    }

}
