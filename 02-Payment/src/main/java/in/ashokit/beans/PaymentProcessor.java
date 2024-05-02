package in.ashokit.beans;

public class PaymentProcessor<T extends ICardPayment, ICardPayment> {
    private T cardPayment;

    public boolean setCardPayment(T cardPayment) {
        this.cardPayment = cardPayment;
        return true; // Assuming the payment is always successful for demonstration
    }

    // Setter Injection
    public void setCardPayment1(T cardPayment) {
        this.cardPayment = cardPayment;
    }

    public boolean doPayment(double billAmt) {
    	return false;
        }
    }

