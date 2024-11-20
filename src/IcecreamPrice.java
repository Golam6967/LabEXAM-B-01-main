public class IcecreamPrice {
    IFlavours flavour;
    IToppings topping;
    WrapperType wrapperType;
    static final double tax = 8/100;
    public IcecreamPrice(IFlavours flavour, IToppings topping, WrapperType wrapperType) {
        this.flavour = flavour;
        this.topping = topping;
        this.wrapperType = wrapperType;
    }
    public void calculatePrice() {

    }
}
