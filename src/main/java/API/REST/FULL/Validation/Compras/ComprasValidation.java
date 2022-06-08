package API.REST.FULL.Validation.Compras;

import API.REST.FULL.Models.Comprar.ComprasCliente;
import API.REST.FULL.Util.ResourceNotFound;
import org.springframework.stereotype.Service;

@Service
public interface ComprasValidation {

    public void ValidationCompras(ComprasCliente comprasCliente)throws ResourceNotFound;
}
