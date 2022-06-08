package API.REST.FULL.Models.Roles;

import API.REST.FULL.Models.Comprar.ComprasCliente;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "Rol_Cliente")
public class RolCliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "CLIENTE")
    private String Name;


}
