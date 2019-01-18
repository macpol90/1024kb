package service;

import entity.Cloth;
import entity.Product;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maciej Polański on 18.01.2019.
 */

public class ProductServiceTest {

    @Test
    public void testGetAllProduct() {
        //is
        List<Product> products = new ArrayList<Product>();
        products.add(new Cloth(00001l, "T-shirt", 99.99f, 0.5f, "black", 4, "XL", "COTTON"));
        products.add(new Cloth(00002l, "T-shirt", 19.99f, 0.4f, "white", 4, "XL", "COTTON"));

        //then
        ProductServiceImpl userService = new ProductServiceImpl(products);
        List<Product> productsFromTestClass = userService.getAllProducts();

        //expect
        Assert.assertEquals(products, productsFromTestClass);


    }
}