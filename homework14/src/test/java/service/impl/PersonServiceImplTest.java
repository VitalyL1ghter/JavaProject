package service.impl;
import model.Person;
import model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import service.PersonService;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class PersonServiceImplTest {

    public PersonService personService;

    @BeforeEach
    void setUp() {
        personService = new PersonServiceImpl();
    }

    @Test
    @DisplayName("Тест на добавление пользователя")
    void create() {
        Person person = personService.create("name", 100);
        assertNotNull(person);
        assertEquals(person.getName(), "name");
    }

    @Test
    @DisplayName("Тест на покупку продукта")
    void byuRandomProduct() {
        Person person = personService.create("name", 100);
        Product product = new Product("хлеб", 100);
        Product purchasedProduct = personService.byuRandomProduct(List.of(product).toArray(new Product[0]), person);
        assertNotNull(product);
        assertEquals(purchasedProduct, product);
    }

    @Test()
    @DisplayName("Тест на отсутсвие денег 0")
    void byuRandomProductIfNotMoney() {
        Person person = personService.create("name", 0);
        Product product = new Product("хлеб", 100);
        Exception exception = assertThrows(RuntimeException.class, () -> {
            personService.byuRandomProduct(List.of(product).toArray(new Product[0]), person);
        });
        String expectedMessage = "Нет денег";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test()
    @DisplayName("Тест на нехватку денег")
    void byuRandomProductIfNotEnoughMoney() {
        Person person = personService.create("name", 10);
        Product product = new Product("хлеб", 100);
        Exception exception = assertThrows(RuntimeException.class, () -> {
            personService.byuRandomProduct(List.of(product).toArray(new Product[0]), person);
        });
        String expectedMessage = "Не достаточно денег";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
}

