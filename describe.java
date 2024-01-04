import Module.TShirts;
import Module.Order;

public class describe {
    public static void main(String[]args){
        String[]Sizes={"XL","Medium","Large"};
        //used in a similar format of scanner sc...
        TShirts tshirts1 = new TShirts("Gorkhali Batman",572,1235,"Karuna","You either die a hero or live long enough to see yourself be a villain",Sizes);
        TShirts tshirts2 = new TShirts("JJJ",681,1780,"Karuna","Turn On The TV. Go Online. Pick Up A Newspaper.",Sizes);

        int[]item1 ={576,681};
        int[]price1 ={1235,1780};
        Order order1 = new Order("Gopal Sharma","0486756465",item1,price1);
        Order order2 = new Order("Manjulika Bengali","12347594393",item1,price1);

        tshirts1.describeTShirt(); //gives the description of tshirt.1
        tshirts2.describeTShirt();
        order1.printBillWithVAT();//gives the bill of order1.
        order2.printBillWithVAT();

    }

}
