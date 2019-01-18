package api;

import entity.Product;

import java.util.List;

/**
 * Created by Maciej Polański on 17.01.2019.
 */

public interface ProductService {

    List<Product> getAllProducts();

    Integer getCountProducts();
    Product getProductByProductName(String productName);
    boolean isProductOnWarehouse(String productName);
    boolean isProductExist(String productName);
    boolean isProductExist(Long productId);


}
