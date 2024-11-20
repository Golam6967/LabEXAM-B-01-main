public class Sprinkles implements IToppings{
    static final double price = 0.30;

    @Override
    public  double  calculateToppingsPrice() {
        return price;
    }
}
