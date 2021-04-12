package temeSDA;

public class PaymentMethod {
    private String type;
    public PaymentMethod()
    {
        this.type = "Cash";
    }
    public PaymentMethod(String metoda)
    {
        this.type = metoda;
    }
    public String getPaymentMethod()
    {
        return type;
    }
    public String toString() {
        return getPaymentMethod();
    }
}
