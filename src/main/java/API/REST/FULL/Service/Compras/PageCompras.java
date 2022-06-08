package API.REST.FULL.Service.Compras;

import API.REST.FULL.Models.Comprar.ComprasCliente;
import API.REST.FULL.Models.Products.Products;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PageCompras {

    Page<ComprasCliente>pageCompras(Pageable pageable);
}
