package dao;

import api.ProductDao;
import entity.Product;

import java.io.IOException;
import java.util.List;

/**
 * Created by Maciej Polansky on 2019-01-26.
 **/

public class ProductDaoImpl implements ProductDao {

    private final String fileName;
    private final String productType;

    public ProductDaoImpl(String fileName, String productType) throws IOException {
        this.fileName = fileName;
        this.productType = productType;
    }


    @Override
    public void saveProduct(Product product) {

    }

    @Override
    public void saveProducts(List<Product> products) {

    }

    @Override
    public void removeProductById(Long productId) {

    }

    @Override
    public void removeProductByName(String productName) {

    }

    @Override
    public List<Product> getAllProducts() {
        return null;
    }

    @Override
    public Product getProductById(Long productId) {
        return null;
    }

    @Override
    public Product getProductByProductName(String productName) {
        return null;
    }
}
