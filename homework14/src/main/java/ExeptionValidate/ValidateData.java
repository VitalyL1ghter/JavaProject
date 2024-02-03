package ExeptionValidate;
import model.Person;
import model.Product;
import java.util.InputMismatchException;
import java.util.regex.Pattern;

public class ValidateData {

    public static void validCreatPerson(String name) {
        if (name == null || name.isEmpty()) {
            throw new InputMismatchException("Имя должно быть, состоять из букв ");
        } else if (Pattern.matches("[a-zA-Zа-яА-Я ]\s+", name)) {
            throw new InputMismatchException("Не верный формат ввода ");
        }
    }

    public static void validCreatProduct(String name, double cost) {
        if (name == null || name.isEmpty()) {
            throw new InputMismatchException("Наименование продукта должно быть и состоять из букв ");
        } else if (Pattern.matches("[a-zA-Zа-яА-Я ]\s+", name)) {
            throw new InputMismatchException("Не верный формат ввода ");

        }
        if (cost == 0) {
            throw new InputMismatchException("Цена продукта должна быть указана ");
        }
    }

    public static void validPersonCash(Person person) {
        if (person.getCash() < 0 || person.getCash() == 0) {
            throw new RuntimeException("Нет денег ");
        }
    }

    public static void validCashCost(Person person, Product product) {
        if (product.getCost() > person.getCash()) {
            throw new RuntimeException("Не достаточно денег ");
        }
    }
}