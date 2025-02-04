import java.util.Scanner;

public class SalesTaxCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String temp = scan.nextLine(); //Alaska 100
        String stateName = temp.substring(0, temp.indexOf(" ")); //Alaska
        String rest = temp.substring(temp.indexOf(" ") + 1); //100
        double saleAmount = Double.parseDouble(rest);

        if (stateName.equalsIgnoreCase("Indiana")) {
            State in = new Indiana(); //make a new state
            in.showTax(saleAmount); //calculate tax amount

        } else if (stateName.equalsIgnoreCase("Alaska")) {
            State al = new Alaska();
            al.showTax(saleAmount);
        } else if (stateName.equalsIgnoreCase("Hawaii")) {
            State ha = new Hawaii();
            ha.showTax(saleAmount);

            //When running the app two command lines will be passed: the state name and the sale amount
        }
    }
}
