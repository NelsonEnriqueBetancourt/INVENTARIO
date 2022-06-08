package API.REST.FULL.Repository.Roles;

import API.REST.FULL.Models.Roles.RolCliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepositorioClient extends JpaRepository<RolCliente,Integer> {
}
