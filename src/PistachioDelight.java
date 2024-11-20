import java.util.Scanner;

public class PistachioDelight implements  IFlavours{
    static final double price = 3.25;
    @Override
    public double calculateFlavourprice() {
        Scanner sc = new Scanner(System.in);
        return price*sc.nextDouble();
    }
}
