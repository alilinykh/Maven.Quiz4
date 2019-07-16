package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {
    List<BankAccount> bankAccounts = new ArrayList<>();
    public void removeBankAccountByIndex(Integer indexNumber) {
            bankAccounts.remove(bankAccounts.get(indexNumber));
    }

    public void addBankAccount(BankAccount bankAccount) {
        bankAccounts.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
//        throw new UnsupportedOperationException("Method not yet implemented");
        if (bankAccounts.contains(bankAccount)) {return true;}
        else return false;

    }
}
