package BankWithHibernate.Repository;

import BankWithHibernate.EntityH.AccountH;
import BankWithHibernate.SessionFactory.SessionFactorySingleton;
import org.hibernate.SessionFactory;

import java.util.List;

public class AccountRepositoryImpl implements BaseRepository {

    private SessionFactory sessionFactory = SessionFactorySingleton.getInstance();

    @Override
    public AccountH save(AccountH accountH) {
        try (var session = sessionFactory.openSession()) {
            var transaction = session.beginTransaction();
            try {
                session.save(accountH);
                transaction.commit();
                return accountH;
            } catch (Exception e) {
                transaction.rollback();
                throw e;
            }
        }
    }

    @Override
    public void update(AccountH accountH) {
        try (var session = sessionFactory.openSession()) {
            var transaction = session.beginTransaction();
            try {
                session.update(accountH);
                transaction.commit();
            } catch (Exception e) {
                transaction.rollback();
                throw e;
            }
        }
    }

    @Override
    public void delete(AccountH accountH) {
        try (var session = sessionFactory.openSession()) {
            var transaction = session.beginTransaction();
            try {
                session.delete(accountH);
                transaction.commit();
            } catch (Exception e) {
                transaction.rollback();
                throw e;
            }
        }
    }

    @Override
    public AccountH findById(Long id) {
        try (var session = sessionFactory.openSession()) {
            return session.find(AccountH.class, id);
        }
    }

    @Override
    public List<AccountH> findAll() {
        throw new UnsupportedOperationException("Find All IDK how to implement yet!");
    }
}
