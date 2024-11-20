import java.util.Scanner;

public class FreshStrawberries implements IToppings{
    static final double price = 1.00;

    @Override
    public double calculateToppingsPrice() {
        Scanner sc = new Scanner(System.in);
        return price*sc.nextDouble();
    }
}
