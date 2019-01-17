package api;

import entity.Product;

import java.util.List;

/**
 * Created by Maciej Polański on 17.01.2019.
 */

//        sprawdzenie czy ilość produktu jest większa od 0 dla konkretnego productName
//        sprawdzenie czy produkt o podanym productName istnieje
//        sprawdzenie czy produkt o podanym id istnieje

public interface ProductService {

    List<Product> getAllProducts();

    Integer getCountProducts();
    Product getProductByProductName(String productName);
    boolean isProductOnWarehouse(String productName);
    boolean isProductExist(String productName);
    boolean isProductExist(Long productId);


}
