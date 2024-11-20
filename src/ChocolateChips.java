import java.util.Scanner;

public class ChocolateChips implements IToppings{

    static final double price = 0.70;
    @Override
    public double calculateToppingsPrice() {
        Scanner sc = new Scanner(System.in);
        return price*sc.nextDouble();

    }
}
