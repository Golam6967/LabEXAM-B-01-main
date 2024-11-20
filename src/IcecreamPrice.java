public class IcecreamPrice {
    IFlavours flavour;
    IToppings topping;
    WrapperType wrapperType;
    double totalprice ;
    double Subtotal;
    static final double tax = 8/100;
    public IcecreamPrice(IFlavours flavour, IToppings topping, WrapperType wrapperType) {
        this.flavour = flavour;
        this.topping = topping;
        this.wrapperType = wrapperType;
        this.totalprice = 0.44;
        this.Subtotal = 0.0;
    }
    public void calculatePrice() {
        this.totalprice =  flavour.calculateFlavourprice()+topping.calculateToppingsPrice()+wrapperType.WrapperPrice();
        totalprice *=tax;
    }
}
