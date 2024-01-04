package Module;

import java.util.Arrays;

public class TShirts { //basic data type and variable names
    String name;
    int product_code;
    int price;
    String brand;
    String Description;
    String[] sizes;

    public TShirts(String name, int product_code, int price, String brand, String description, String[] sizes) {//gives or helps in construction of the values for variables...
        this.name = name;
        this.product_code = product_code;
        this.price = price;
        this.brand = brand;
        this.Description = description;
        this.sizes = sizes;
    }

    //getter and setter are used to get and set the value of the tshirt variables.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProduct_code() {
        return product_code;
    }

    public void setProduct_code(int product_code) {
        this.product_code = product_code;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        this.Description = description;
    }

    public String[] getSizes() {
        return sizes;
    }

    public void setSizes(String[] sizes) {
        this.sizes = sizes;
    }

    public void describeTShirt() {
        System.out.println();
        System.out.println("Product Description:");
        System.out.println("The mythical product:" + name + "(:" + product_code + ")\n is now available for a whooping Rs." + price + "\nfrom our very own '" + brand + "'. Get your official \n'" + Description + "' now.\nThe available sizes:" + Arrays.toString(sizes));
    }

}

