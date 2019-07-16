package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {
    List<BankAccount> list = new ArrayList<>();
    public BankAccount removeBankAccountByIndex(Integer indexNumber) {
        return list.get(indexNumber);
    }

    public void addBankAccount(BankAccount bankAccount) {
        list.add(new BankAccount());
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
//        throw new UnsupportedOperationException("Method not yet implemented");
        if (list.contains(bankAccount)) {
            return true;
        }
        return false;
    }
}
