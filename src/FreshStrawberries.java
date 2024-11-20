public class FreshStrawberries implements IToppings{
    static final double price = 1.00;

    @Override
    public double calculateToppingsPrice() {
        return price;
    }
}
