package API.REST.FULL.Validation.Compras;

import API.REST.FULL.Models.Comprar.ComprasCliente;
import API.REST.FULL.Util.ResourceNotFound;
import org.springframework.stereotype.Component;

@Component
public class ComprasClienteValidate implements ComprasValidation {

    private void MessageCompras(String message)throws ResourceNotFound{
        throw new ResourceNotFound(message);
    }


    @Override
    public void ValidationCompras(ComprasCliente comprasCliente) throws ResourceNotFound {
        if (comprasCliente.getFechaCompra()==null){
            this.MessageCompras("La Fecha De Compra Es Obligatorio,Intente Nuevamente");
        }
        if (comprasCliente.getPrecioTotalCompra()==0){
            this.MessageCompras("El Precio De La Compra Es Obligatorio,Intente Nuevamente");
        }
        if (comprasCliente.getProductosComprados()==null){
            this.MessageCompras("El Nombre de los Productos Comprados Es Obligatorio,Intente Nuevamente");

        }
        if (comprasCliente.getCantidadProducto()==0){
            this.MessageCompras("La Cantidad De Productos Es Obligatorio,Intente Nuevamente");

        }
    }
}
