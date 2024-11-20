import java.util.Scanner;

public class CrushedOreo implements IToppings{
    static final double price = 0.85;



    @Override
    public double calculateToppingsPrice() {
        Scanner sc = new Scanner(System.in);


        return price*sc.nextDouble();
    }
}
