package com.stomichal;

import java.util.ArrayList;

public class ListsOfProduct extends Colour{

    private String listName;
    private ArrayList<Colour> product;

    private ArrayList<String> listsName;

    public ListsOfProduct(String mainKind, String company, String name, String listName) {
        super(mainKind, company, name);
        this.listName = listName;

    //    listsName.add(listName);
    }

    public ListsOfProduct(String mainKind, String company, String name) {
        super(mainKind, company, name);
        this.product = product;
        this.listName="NoName";
    }

    public  boolean dodanie(Colour colour){

        product.add(colour);
        this.listName="NoName";
        return true;
}

    public ArrayList<String> getListsName(){
        return listsName;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public ArrayList<Colour> getProduct() {
        return product;
    }

    public void setProduct(ArrayList<Colour> product) {
        this.product = product;
    }


}
