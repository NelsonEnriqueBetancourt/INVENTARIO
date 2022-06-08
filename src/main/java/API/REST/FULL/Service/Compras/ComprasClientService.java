package API.REST.FULL.Service.Compras;

import API.REST.FULL.Models.Comprar.ComprasCliente;
import API.REST.FULL.Repository.Compras.ComprasClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComprasClientService implements PageCompras{

    @Autowired
    private ComprasClienteRepositorio comprasClienteRepositorio;


    public List<ComprasCliente>findAll(){
        return comprasClienteRepositorio.findAll();
    }

    public void SaveComprasClient(ComprasCliente comprasCliente){
        comprasClienteRepositorio.save(comprasCliente);
    }

    @Override
    public Page<ComprasCliente> pageCompras(Pageable pageable) {
        return comprasClienteRepositorio.findAll(pageable);
    }
}
