package API.REST.FULL.Models.Users;


import API.REST.FULL.Models.Comprar.ComprasCliente;
import API.REST.FULL.Models.Roles.RolAdministrador;
import API.REST.FULL.Models.Roles.RolCliente;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Usuarios")
public class UserAdmin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "Nombre_User")
    private String Name;
    @Column(name = "Apellido_User")
    private String lastName;
    @Column(name = "Contraseña_User")
    private String  Password;

    @OneToOne
    private RolAdministrador rolAdministrador;

    @OneToOne
    private ComprasCliente comprasCliente;

}
