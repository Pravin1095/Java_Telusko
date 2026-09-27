package Java_Core.BasicCode.DigitalWalletPackage;

public class Main {
    public static void main(String[] args) {
        DigitalWallet walletA = new DigitalWallet("W101", "Alice", 500.0);
        DigitalWallet walletB = new DigitalWallet("W102", "Bob"); // Starts with 0.0

        walletA.deposit(200.0); // Alice balance: 700.0
        walletA.withdraw(50.0); // Alice balance: 650.0

        boolean success = walletA.transfer(walletB, 300.0);

        System.out.println("Transfer Success: " + success); // true
        System.out.printf("Alice Balance: $%.2f%n", walletA.getBalance()); // $350.00
        System.out.printf("Bob Balance: $%.2f%n", walletB.getBalance());   // $300.00
    }
}
