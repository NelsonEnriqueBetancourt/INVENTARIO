package API.REST.FULL.Repository.Products;

import API.REST.FULL.Models.Products.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepositorio extends JpaRepository<Products,Integer> {
}
