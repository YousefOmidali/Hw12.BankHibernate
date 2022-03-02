package BankWithHibernate;

import BankWithHibernate.EntityH.AccountH;
import BankWithHibernate.EntityH.AccountStatus;
import BankWithHibernate.EntityH.Branch;
import BankWithHibernate.EntityH.Customer;
import BankWithHibernate.Repository.AccountRepositoryImpl;
import BankWithHibernate.SessionFactory.SessionFactorySingleton;

public class Main {
    public static void main(String[] args) {
        var sessionFactory = SessionFactorySingleton.getInstance();

        var accountRepositoryImpl = new AccountRepositoryImpl();
        Customer customer = new Customer("Mohammad","Omidali",1234567891);
        var accountH =
                new AccountH(customer,150000, Branch.KISH, AccountStatus.ALLOW);

        accountRepositoryImpl.save(accountH);

        accountH.setBranch(Branch.TEHRAN);
        accountRepositoryImpl.update(accountH);

//        accountRepositoryImpl.delete(accountH);

    }
}
