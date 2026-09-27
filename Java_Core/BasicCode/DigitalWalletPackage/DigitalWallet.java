package Java_Core.BasicCode.DigitalWalletPackage;

public class DigitalWallet {
    private String walletId;
    private String ownerName;
    private double balance;

    public DigitalWallet(String walletId, String ownerName, double initialBalance){
        this.walletId = walletId;
        this.ownerName = ownerName;
        this.balance = initialBalance<0.0 ? 0.0 : initialBalance;

    }

    public DigitalWallet(String walletId, String ownerName){
        this(walletId,ownerName,0.0); //Calls 3 argument constructor and forwards the arguments
    }

    public boolean deposit(double amount){
        if(amount>0.0){
            this.balance+=amount;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean withdraw(double amount){
        if(amount>0 && amount<=this.balance){
            this.balance-=amount;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean transfer(DigitalWallet recipientWallet, double amount){
if(recipientWallet==null){
    return false;
}
if(this.withdraw(amount)){
    recipientWallet.deposit(amount);
    return true;
}
return false;
    }

    public double getBalance(){
        return this.balance;
    }
    public String getOwnerName(){
        return this.ownerName;
    }
    public String getWalletId(){
        return this.walletId;
    }

}
