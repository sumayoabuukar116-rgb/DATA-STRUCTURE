public class AbstractAccountDemo {
    public static void main(String[] args) {
        // BankAccount x = new BankAccount("BAS-1", 100);   // ✗ cannot be instantiated

        BankAccount acc1 = new SavingsAccount("SAV-1", 200);
        BankAccount acc2 = new CurrentAccount("CUR-1", 200);
        BankAccount acc3 = new StudentAccount("STU-1", 200);

        acc1.deposit(50);  acc1.withdraw(300);  acc1.show();
        acc2.deposit(50);  acc2.withdraw(300);  acc2.show();
        acc3.deposit(50);  acc3.withdraw(300);  acc3.show();
    }
}
