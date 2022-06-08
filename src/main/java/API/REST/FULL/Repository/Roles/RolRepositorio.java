package API.REST.FULL.Repository.Roles;

import API.REST.FULL.Models.Roles.RolAdministrador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepositorio extends JpaRepository<RolAdministrador,Integer> {
}
