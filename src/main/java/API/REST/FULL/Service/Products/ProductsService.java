package API.REST.FULL.Service.Products;

import API.REST.FULL.Models.Products.Products;
import API.REST.FULL.Repository.Products.ProductRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService  {

    @Autowired
    private ProductRepositorio productoRepositorio;



    public List<Products>findAll(){
        return productoRepositorio.findAll();
    }

    public Products getProductId(Integer id){
        return productoRepositorio.findById(id).get();
    }

    public void SaveProduct(Products products){
        productoRepositorio.save(products);
    }

    public void DeleteProduct(Integer id){
        productoRepositorio.deleteById(id);
    }


}
