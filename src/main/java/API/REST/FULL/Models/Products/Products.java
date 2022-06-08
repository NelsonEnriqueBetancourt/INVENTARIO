package API.REST.FULL.Models.Products;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "Productos")
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "Nombre_Lote")
    private String Name;
    @Column(name = "Precio_Lote")
    private int Price;
    @Column(name = "Numero_Lote")
    private int numberLote;
    @Column(name = "Cantidad_Disponible")
    private int cantidadDisponible;
    @Column(name = "Fecha_Ingreso")
    private LocalDate fechaIngreso;


}
