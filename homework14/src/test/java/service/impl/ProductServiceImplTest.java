package service.impl;
import model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import service.ProductService;
import java.util.InputMismatchException;
import static org.junit.jupiter.api.Assertions.*;

class ProductServiceImplTest {

    public ProductService productService;

    @BeforeEach
    void setUp() {
        productService = new ProductServiceImpl();
    }

    @Test
    @DisplayName("Тест на добавление продукта")
    void create() {
        Product product = productService.create("name", 100);
        assertNotNull(product);
        assertEquals(product.getProductName(), "name");
    }

    @Disabled
    @Test
    @DisplayName ("Тест на наименование продукта ")
    void notNameProduct () {
        Exception exception = assertThrows(InputMismatchException.class, () -> {
           productService.create("777",150);
        });
        String expectedMessage = "Не верный формат ввода ";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
}