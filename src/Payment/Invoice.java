package Payment;

public class Invoice {
    public double amount;
    public double tax;

    public Invoice(double amount) {
        this.amount = amount;
        this.tax = getTax(amount);
    }

    private double getTax(double amount) {
        return 0.18 * amount;
    }

    public void printInvoice() {
        System.out.println("Invoice generated => amount : "+amount +" Tax(GST):"+tax);
    }
}
