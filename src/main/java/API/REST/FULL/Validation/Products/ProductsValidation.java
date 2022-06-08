package API.REST.FULL.Validation.Products;

import API.REST.FULL.Models.Products.Products;
import API.REST.FULL.Util.ResourceNotFound;
import org.springframework.stereotype.Service;

@Service
public interface ProductsValidation {

    public void ValidateProducts(Products products)throws ResourceNotFound;
}
