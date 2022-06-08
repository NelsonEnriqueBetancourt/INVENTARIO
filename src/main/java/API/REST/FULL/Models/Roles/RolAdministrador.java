package API.REST.FULL.Models.Roles;

import API.REST.FULL.Models.Products.Products;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "Roles_Usuarios")
public class RolAdministrador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "ADMIN")
    private String Name;

    @OneToOne
    private Products products;
}
