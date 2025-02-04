public abstract class State { //abstract class, similar to the Duck example in class
    SalesTaxBehavior taxBehavior; //define changing behavior
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTaxBehavior(SalesTaxBehavior taxBehavior) {
        this.taxBehavior = taxBehavior;
    }


    public void showTax(Double value) {
        double tax = taxBehavior.compute(value);
        String result = String.format("The sales tax on $%.2f in %s is $%.2f.", value, getName(), tax);
        System.out.println(result);
    }
}
