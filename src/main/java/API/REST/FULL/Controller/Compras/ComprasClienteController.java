package API.REST.FULL.Controller.Compras;

import API.REST.FULL.Models.Comprar.ComprasCliente;
import API.REST.FULL.Service.Compras.ComprasClientService;
import API.REST.FULL.Util.ResourceNotFound;
import API.REST.FULL.Validation.Compras.ComprasClienteValidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "API/")
public class ComprasClienteController {

    @Autowired
    private ComprasClientService comprasClientService;


    @Autowired
    private ComprasClienteValidate comprasClienteValidate;

    @RequestMapping(value = "Compras/List",method = RequestMethod.GET)
    public ResponseEntity<List<ComprasCliente>>getList(){
        Map<String,Object>response=new HashMap<>();
        List list=comprasClientService.findAll();
        if (list.isEmpty()){
            return ResponseEntity.noContent().build();
        }else {
            return ResponseEntity.ok(list);
        }
    }

    @RequestMapping(value = "Compras/Save",method = RequestMethod.POST)
    public ResponseEntity<?>SaveCompra(@RequestBody ComprasCliente comprasCliente)throws ResourceNotFound{
        Map<String,Object>response=new HashMap<>();

        this.comprasClienteValidate.ValidationCompras(comprasCliente);
        this.comprasClientService.SaveComprasClient(comprasCliente);
        response.put("Mensaje","La Compra Ha Sido Realizada ".concat("Con Exito"));
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }


    @RequestMapping(value = "Client/page/{page}",method = RequestMethod.GET)
    public Page<ComprasCliente>pageCompras(@PathVariable Integer page){
        Pageable pageable= PageRequest.of(page,5);
        return comprasClientService.pageCompras(pageable);
    }
}
