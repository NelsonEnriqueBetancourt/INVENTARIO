package API.REST.FULL.Controller.Products;

import API.REST.FULL.Models.Products.Products;
import API.REST.FULL.Service.Products.ProductsService;
import API.REST.FULL.Util.ResourceNotFound;
import API.REST.FULL.Validation.Products.ProductsValidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "API/")
public class ProductController {

    @Autowired
    private ProductsService productsService;

    @Autowired
    private ProductsValidate productsValidate;


    @RequestMapping(value = "Product/List",method = RequestMethod.GET)
    public ResponseEntity<List<Products>>getList(){
        Map<String,Object>response = new HashMap<>();
        List list = productsService.findAll();
        if (list.isEmpty()){
            return ResponseEntity.noContent().build();
        }else{
            return ResponseEntity.ok(list);
        }
    }

    @RequestMapping(value = "Product/{id}",method = RequestMethod.GET)
    public ResponseEntity<?>GetProductId(@PathVariable Integer id){
        Map<String,Object>response=new HashMap<>();
        try{
            this.productsService.getProductId(id);
            response.put("Mensaje","El Producto Se Encuentra En El Sistema ");
            return ResponseEntity.ok(response);
        }catch (DataAccessException exception){
            response.put("Mensaje","El Producto No Esta Registrado ");
            response.put("Error",exception.getMostSpecificCause().getMessage());
            return new ResponseEntity<>(response, HttpStatus.NO_CONTENT);
        }
    }

    @RequestMapping(value = "Product/Update/{id}",method = RequestMethod.PUT)
    public ResponseEntity<?>UpdateProduct(@RequestBody Products products, @PathVariable Integer id){
        Map<String,Object>response=new HashMap<>();
        try {
            this.productsService.getProductId(id);
            this.productsService.SaveProduct(products);
            response.put("Mensaje","Los Datos Del Producto Han Sido Actualizados ".concat("Con Exito"));
            return ResponseEntity.ok(response);
        }catch (DataAccessException exception){
            response.put("Mensaje","No Se Han Podido Actualizar Los Datos ".concat("Intente Nuevamente"));
            response.put("Error",exception.getMostSpecificCause().getMessage());
            return new ResponseEntity<>(response,HttpStatus.NOT_ACCEPTABLE);
        }
    }

    @RequestMapping(value = "Product/Save",method = RequestMethod.POST)
    public ResponseEntity<?>SaveProduct(@RequestBody Products products)throws ResourceNotFound{
        Map<String,Object>response=new HashMap<>();

        this.productsValidate.ValidateProducts(products);
        this.productsService.SaveProduct(products);
        response.put("Mensaje","El Producto Ha Sido Actualizado ".concat("Con Exito"));
        return ResponseEntity.ok(response);
    }

    @RequestMapping(value = "Product/Delete/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?>DeleteProduct(@PathVariable Integer id){
        Map<String,Object>response=new HashMap<>();
        try {
            this.productsService.DeleteProduct(id);
            response.put("Mensaje","El Producto Ha Sido Eliminado ".concat("Con Exito"));
            return ResponseEntity.ok(response);
        }catch (DataAccessException exception){
            response.put("Mensaje","No se Pudo Eliminar El Producto ".concat("Intente Nuevamente"));
            response.put("Error",exception.getMostSpecificCause().getMessage());
            return new ResponseEntity<>(response,HttpStatus.NOT_ACCEPTABLE);
        }
    }
}
