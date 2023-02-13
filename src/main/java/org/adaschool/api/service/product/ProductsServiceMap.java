package org.adaschool.api.service.product;

import org.adaschool.api.repository.product.Product;
import org.adaschool.api.service.product.productpesistance.ProductPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductsServiceMap implements ProductsService {

    @Autowired
    ProductPersistence persistence;

    @Override
    public Product save(Product product) {
        persistence.save(product);
        return product;
    }

    @Override
    public Optional<Product> findById(String id) {

        return Optional.of(persistence.getProductById(id));
    }

    @Override
    public List<Product> all() {
        return persistence.getAllProducts();
    }

    @Override
    public void deleteById(String id) {
        persistence.deleteProductById(id);
    }

    @Override
    public Product update(Product product, String productId) {
        return persistence.updateProduct(product,productId);
    }
}
