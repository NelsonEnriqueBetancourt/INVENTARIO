package API.REST.FULL.Models.Comprar;

import API.REST.FULL.Models.Roles.RolCliente;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;


@Getter
@Setter
@Entity
@Table(name = "Compras_Cliente")
public class ComprasCliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "Fecha_Compra")
    private LocalDate fechaCompra;
    @Column(name = "Productos_Comprados")
    private String ProductosComprados;
    @Column(name = "Cantidad_Productos")
    private int CantidadProducto;
    @Column(name = "Precio_Total")
    private int PrecioTotalCompra;

    @OneToOne
    private RolCliente rolCliente;
}
