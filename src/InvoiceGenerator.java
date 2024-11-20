public class InvoiceGenerator {
    IToppings toppings;
    IFlavours flavours;
    WrapperType wrapperType;
    public InvoiceGenerator(IToppings toppings, IFlavours flavours, WrapperType wrapperType) {
        this.toppings = toppings;
        this.flavours = flavours;
        this.wrapperType = wrapperType;
    }
    public void generateinvoice() {
        System.out.println("Ice Cream Shop Service");



    }
}
