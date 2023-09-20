import java.util.Scanner;
public class Bill_generator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double TotalNoDiscount = 0;

        System.out.print("Enter the number of items ordered: ");
        int OrderedItem = input.nextInt();

        for (int i = 1; i <= OrderedItem; i++) {
            System.out.print("Name of item ordered: ");
            String ItemName = input.next();

            System.out.print("Quantity of item ordered " + ItemName + ": ");
            int quantity = input.nextInt();

            System.out.print("Price of item ordered " + ItemName + ": ");
            float rate = input.nextFloat();

            double total = rate * quantity;
            TotalNoDiscount = TotalNoDiscount + total;

            System.out.println("  ");
            System.out.println("XYZ BILL:");
            System.out.println("Item\tQty\tRate\tAmt");
            System.out.println(ItemName + "\t" + quantity + "\t" + rate + "\t" + total);
        }

        System.out.print("Do you have a memebership?: ");
        String membership = input.next();

        if(membership.equals("Yes")||membership.equals("yes")){
            double discount = TotalNoDiscount*0.1;
            double TotalDiscount = TotalNoDiscount-discount;
            System.out.println("Discount is = "+discount);
            System.out.println("Final Price = "+TotalDiscount);
        }
        else{
            System.out.println("Final Price = "+TotalNoDiscount);
        }

    }
}