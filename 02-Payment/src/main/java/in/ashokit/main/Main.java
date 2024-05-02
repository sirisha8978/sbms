package in.ashokit.main;

import in.ashokit.bean.CreditCardPayment;
import in.ashokit.beans.PaymentProcessor;


public class Main {
    public static void main(String[] args) {
        PaymentProcessor pro = new PaymentProcessor();
        
        // Create an instance of a class that implements ICardPayment
        CreditCardPayment cardPayment = new CreditCardPayment(); // Assuming CreditCardPayment implements ICardPayment
        
        // Setter Injection
        pro.setCardPayment(cardPayment);
        
        // Call the doPayment method with the correct parameter
        boolean paymentStatus = pro.doPayment(1345.00); // Assuming doPayment method accepts a double parameter
        if (paymentStatus) {
            System.out.println("Payment processed successfully.....");
        } else {
            System.out.println("Failed to process payment...");
        }
    }
}
