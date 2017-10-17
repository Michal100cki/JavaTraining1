package com.stomichal;

import java.util.ArrayList;

public class Branch {
    private String branchName;
    private ArrayList<Customer> listaKlientow;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.listaKlientow = new ArrayList<Customer>();
    }



    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getListaKlientow() {
        return listaKlientow;
    }


    public void addCustomer(Customer customer) {
if(findCustomer(customer.getName())>=0){
    System.out.println("Klient o podanej nazwie istnieje już w bazie");
}else{
    listaKlientow.add(customer);
}

    }


    public void printCustomersList() {
        for (int i = 0; i < listaKlientow.size(); i++) {
            System.out.println(listaKlientow.get(i).getName() + " --> " + listaKlientow.get(i).getWplaty());
        }
    }


    public void addCash(Customer oldCustomer, Customer newCustomer) {
        System.out.println("Nowa Kwota "+newCustomer.getWplaty());
listaKlientow.set(findCustomer(oldCustomer.getName()),newCustomer);

    }


    public int findCustomer(String nameCustomer) {
        for (int i = 0; i < this.listaKlientow.size(); i++) {
            if (this.listaKlientow.get(i).getName().equals(nameCustomer)) {
                return i;
            }
        }
        return -1;
    }


}
