package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker, Transactable {
    private BankAccount bankAccount = new BankAccount();
    Double hourlyWage = 35.0;
    Double hoursWorked = 0.0;


    public Employee() {
    }

    public Employee(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        bankAccount.setBalance(bankAccount.getBalance() + amountToIncreaseBy);

    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        bankAccount.setBalance(bankAccount.getBalance() - amountToDecreaseBy);
    }

    @Override
    public Double getBalance() {
        return bankAccount.getBalance();
    }

    @Override
    public void increaseHoursWorked(Double numberOfHours) {
        hoursWorked = hoursWorked + numberOfHours;
    }

    @Override
    public Double getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public Double getHourlyWage() {
        return hourlyWage;
    }

    @Override
    public Double getMoneyEarned() {
        return hourlyWage*hoursWorked;
    }
}
