package service;

import entity.Boots;
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
    public void testGetAllProductPositive() {
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

    @Test
    public void testGetAllProductsNegative() {
        List<Product> products = new ArrayList<Product>();
        products.add(new Cloth(1l, "T-SHIRT", 35.0f, 0.3f, "Black", 4, "XL", "COTTON"));
        products.add(new Boots(2l, "Boots", 35.0f, 0.3f, "Black", 4, 38, true));

        //new ArrayList<Product>(products) - utworzenie kopii listy, więcej o kopiowaniu i adresach w 4 tygodniu
        //dzieki wykonaniu kopii mamy dwa różne obiekty zamiast jedngo
        //jeden siedzi w productService, drugi w naszym tescie
        ProductServiceImpl productService = new ProductServiceImpl(new ArrayList<Product>(products));
        products.add(new Cloth(3l, "Spodnie", 44.f, 0.f, "White", 3, "S", "COTTON"));
        List<Product> listFromTestClass = productService.getAllProducts();

        Assert.assertNotEquals(products, listFromTestClass);
    }




    }





}