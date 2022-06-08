package API.REST.FULL.Validation.Products;

import API.REST.FULL.Models.Products.Products;
import API.REST.FULL.Util.ResourceNotFound;
import org.springframework.stereotype.Component;

@Component
public class ProductsValidate implements ProductsValidation {

    private void MessageProducts(String message)throws ResourceNotFound{
        throw new ResourceNotFound(message);
    }


    @Override
    public void ValidateProducts(Products products) throws ResourceNotFound {

        if (products.getName()==null){
            this.MessageProducts("El Nombre del Producto es Obligatorio, Intente Nuevamente");
        }
        if (products.getPrice()==0){
            this.MessageProducts("El Precio del Lote es Obligatorio, Intente Nuevamente");
        }
        if (products.getCantidadDisponible()==0){
            this.MessageProducts("La Cantidad de Products Disponibles es Obligatorio, Intente Nuevamente");
        }
        if (products.getNumberLote()==0){
            this.MessageProducts("El Numero del Lote es Obligatorio, Intente Nuevamente");

        }
        if (products.getFechaIngreso()==null){
            this.MessageProducts("La Fecha De Ingreso del Lote es Obligatorio, Intente Nuevamente");
        }
    }
}
