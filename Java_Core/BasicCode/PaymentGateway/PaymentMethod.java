package Java_Core.BasicCode.PaymentGateway;

public abstract class PaymentMethod {
    protected String transactionId;
    protected String accountHolderName;

    public PaymentMethod(String transactionId, String accountHolderName) {
        this.transactionId = transactionId;
        this.accountHolderName = accountHolderName;
    }

        public abstract boolean processPayment(double amount);

        public void printReceipt(double amount, boolean isSuccess){
            System.out.println("[RECEIPT] ID:"+this.transactionId+" | User:"+this.accountHolderName+" | Amount:"+amount+" | Status:"+isSuccess);
        }
    }

     class CreditCardPayment extends PaymentMethod{
        private String cardNumber;

        private double creditLimit;
        public CreditCardPayment(String transactionId, String accountHolderName, String cardNumber, double creditLimit){
            super(transactionId, accountHolderName);
            this.cardNumber = cardNumber;
            this.creditLimit = creditLimit;
        }

        @Override
    public boolean processPayment(double amount){
            if(amount>0 && amount<=this.creditLimit){
                this.creditLimit-=amount;
                return true;
            }

        return false;
    }
    }

    class UpiPayment extends PaymentMethod{
    private String upiId;
    private double bankBalance;

    public UpiPayment(String transactionId, String accountHolderName, String upiId, double bankBalance) {
        super(transactionId, accountHolderName);
        this.upiId = upiId;
        this.bankBalance = bankBalance;
    }

    @Override
        public boolean processPayment(double amount){
if(amount>=0 && amount<=bankBalance){
    this.bankBalance-=amount;
    return true;
        }
return false;


    }
    }

    class CheckoutService{

    public void checkout(PaymentMethod payMethod, double amount){
        boolean result = payMethod.processPayment(amount);
        payMethod.printReceipt(amount, result);
    }
}
