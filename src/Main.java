import com.sbi.Account;
import com.sbi.Bank;
import com.sbi.Customer;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Customer customer=new Customer();
        customer.setName("ABC");
        customer.setAddress("INDIA");

        Account account=new Account();
        account.setCustomer(customer);
        account.setNumber(43215678);
        account.setBalance(3000);

        Customer customer1=new Customer();
        customer1.setName("XYZ");
        customer1.setAddress("US");

        Customer customer2=new Customer();
        customer2.setName("XYZ");
        customer2.setAddress("US");

        Customer customer3=new Customer();
        customer3.setName("XYZ");
        customer3.setAddress("US");

        Account account1=new Account();
        account1.setCustomer(customer1);
        account1.setNumber(526253256);
        account1.setBalance(5000);

        Bank bank=new Bank();
        bank.setName("SBI");
        bank.setBranch("HYDERABAD");
        List<Account> accounts=new ArrayList<>();
        accounts.add(account);
        accounts.add(account1);
        bank.setAccounts(accounts);
    }
}