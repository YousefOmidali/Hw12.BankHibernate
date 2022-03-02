package BankWithHibernate.Repository;

import BankWithHibernate.EntityH.AccountH;

import java.util.List;

public interface BaseRepository {
    AccountH save(AccountH contact);
    void update(AccountH contact);
    void delete(AccountH contact);
    AccountH findById(Long id);
    List<AccountH> findAll();
}
