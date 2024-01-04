package Module;

import java.util.Arrays;

public class Order {
    //basic data types and variable names
        String name;
        String phone;
        int[]items;
        int[]price;

    public Order(String name, String phone, int[] items, int[] price) {
        //gives or helps in construction of the values for variables...
        this.name = name;
        this.phone = phone;
        this.items = items;
        this.price = price;
    }

    //getter and setter are used to get and set the value of the orders.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int[] getItems() {
        return items;
    }

    public void setItems(int[] items) {
        this.items = items;
    }

    public int[] getPrice() {
        return price;
    }

    public void setPrice(int[] price) {
        this.price = price;
    }


    public void printBillWithVAT() { //gives the billing details of the product from the customer.
        double totalPrice = 0;
        for (double price : price) {
            totalPrice += price;
        }

        double vat = totalPrice * (13/100);
        System.out.println();
        System.out.println("PRICING DETAILS:");
        System.out.println("Name: " + name);
        System.out.println("Phone number: " + phone);
        System.out.println("Items: " + Arrays.toString(items));
        System.out.println("Prices: " + Arrays.toString(price));
        System.out.println("Total price: " + totalPrice);
        System.out.println("Total price with VAT(13%): " + (totalPrice + vat));
    }
}

