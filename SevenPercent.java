public class SevenPercent implements SalesTaxBehavior {
    public double compute(Double value) {
        return value * 0.07; //7% state tax
    }
}
