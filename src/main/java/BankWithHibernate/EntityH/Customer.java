package BankWithHibernate.EntityH;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.MappedSuperclass;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
//@MappedSuperclass
@Embeddable
public class Customer {
   private String firstName;
   private String lastName;
   private Integer NationalCode;


}
