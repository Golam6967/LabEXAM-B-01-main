import java.util.Scanner;

public class ChocolateFudge implements IFlavours{
    static final double price = 3;

    @Override
    public double calculateFlavourprice() {

        Scanner sc = new Scanner(System.in);
        return price*sc.nextDouble();
    }
}
