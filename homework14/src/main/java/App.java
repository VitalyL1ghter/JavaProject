import model.Person;
import model.Product;
import service.PersonService;
import service.ProductService;
import service.impl.PersonServiceImpl;
import service.impl.ProductServiceImpl;

public class App {

    private static final PersonService personService = new PersonServiceImpl();

    private static final ProductService productService = new ProductServiceImpl();

    public static void main(String[] args) {
        Product[] products = new Product[7];
        products[0] = productService.create("Хлеб", 40);
        products[1] = productService.create("Молоко", 60);
        products[2] = productService.create("Торт", 1000);
        products[3] = productService.create("Кофе растворимый", 879);
        products[4] = productService.create("Масло", 150);
        products[5] = productService.create("Мороженное", 200);
        products[6] = productService.create("Макароны", 800);
        System.out.println("Список продуктов с ценами :");
        for (Product product : products) {
            System.out.println(product);
        }

        Person[] newPerson = new Person[5];
        newPerson[0] = personService.create("Павел Андреевич", 10000);
        newPerson[1] = personService.create("Анна Петровна", 2000);
        newPerson[2] = personService.create("Борис", 10);
        newPerson[3] = personService.create("Женя", 0);
        newPerson[4] = personService.create("Света", -3);
        System.out.println("Список покупателей : ");
        for (Person person : newPerson) {
            System.out.println(person);
        }

        for (Person person : newPerson) {
            System.out.println("Покупает: " + person.getName());

            try {
                for (int i = 0; i < 3; i++) {
                    Product purchasedProduct = personService.byuRandomProduct(products, person);
                    System.out.println("Купил: " + purchasedProduct.getProductName());
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}



