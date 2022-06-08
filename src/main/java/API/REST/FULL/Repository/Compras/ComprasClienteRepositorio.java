package API.REST.FULL.Repository.Compras;

import API.REST.FULL.Models.Comprar.ComprasCliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComprasClienteRepositorio extends JpaRepository<ComprasCliente,Integer> {
}
