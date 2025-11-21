package session9.b_slides_observer_pattern;

public class Demo {

    public static void main(String[] args) {
        BankStatistics bankStatistics = new BankStatistics();
        SkatMonitor skatMonitor = new SkatMonitor();
        CustomerSatisfactionDepartment customerSatisfactionDepartment = new CustomerSatisfactionDepartment();

        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.addListener(bankStatistics);
        bankAccount1.addListener(skatMonitor);
        bankAccount1.addListener(customerSatisfactionDepartment);

        BankAccount bankAccount2 = new BankAccount();
        bankAccount2.addListener(bankStatistics);
        bankAccount2.addListener(skatMonitor);



        System.out.println("Total Bank Balance: "+bankStatistics.getTotalBankBalance());

        bankAccount1.deposit(1000);
        bankAccount2.deposit(3_000_000);

        System.out.println("Total Bank Balance: "+bankStatistics.getTotalBankBalance());

    }
}
