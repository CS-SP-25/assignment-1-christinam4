public class FourFivePercent implements SalesTaxBehavior {
    public double compute(Double value) {
        return value * 0.045; //4.5% state tax
    }

}
