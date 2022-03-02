package BankWithHibernate.EntityH;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "AccountH")
public class AccountH {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Customer customer;
    private Integer amount;

    @Enumerated(EnumType.ORDINAL)
    private Branch branch;

    @Enumerated(EnumType.ORDINAL)
    private AccountStatus accountStatus;

    public AccountH(Customer customer, Integer amount, Branch branch, AccountStatus accountStatus) {
        this.customer = customer;
        this.amount = amount;
        this.branch = branch;
        this.accountStatus = accountStatus;
    }
}
