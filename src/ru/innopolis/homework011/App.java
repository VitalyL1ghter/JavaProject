package ru.innopolis.homework011;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.function.Predicate;

public class App {

    public static void main(String[] args) throws IOException {
        List<Car> cars = new ArrayList<>();
        try (BufferedReader carsReader = new BufferedReader(new FileReader("resource/cars.txt"))) {

            String carsLine = carsReader.readLine();
            while (carsLine != null) {
                String[] newCarsParam = carsLine.split("\\|");
                cars.add(new Car(newCarsParam[0]
                        , newCarsParam[1],
                        newCarsParam[2],
                        Long.parseLong(newCarsParam[3]),
                        Long.parseLong(newCarsParam[4])));

                carsLine = carsReader.readLine();
            }
            cars.forEach(System.out::println);
        } catch (FileNotFoundException exception) {
            exception.getMessage();

        }

        // 1)   Номера   всех   автомобилей,   имеющих   заданный   в   переменной   цвет colorToFind
        // и нулевой пробег mileageToFind.
        String color = "Black";
        Long mileage = 0L;


        Predicate<Car> filterCarByColorOrMileage = car ->
                car.getCarColor().equals(color) || car.getCarMileage().equals(mileage);

        // 2) Количество уникальных моделей в ценовом диапазоне от n до m тыс.
        Long startPrice = 700_000L;
        Long endPrice = 800_000L;

        Predicate<Car> filterCarByStartEndPrice = car ->
                car.getCarPrice() >= startPrice && car.getCarPrice() <= endPrice;

        //3) Вывести цвет автомобиля с минимальной стоимостью.
        // Предикат не нужен

        // 4) Среднюю стоимость искомой модели modelToFind
        String modelToFind = "Toyota";
        Predicate<Car> filterCarByModel = car -> car.getCarModel().equals(modelToFind);

         // 1)   Номера   всех   автомобилей,
        // имеющих   заданный   в   переменной   цвет
        // colorToFind или нулевой пробег mileageToFind.
        List<String> carNumbers = cars
                .stream()
                .filter(filterCarByColorOrMileage)
                .map(Car::getCarNumberId)
                .toList();

        System.out.printf("Заданный цвет colorToFind: %s\n", color);
        System.out.printf("Заданный пробег mileageToFind: %d\n", mileage);
        System.out.printf("Список автомобилей: %s\n", String.join(", ", carNumbers));

        // 2) Количество уникальных моделей в ценовом диапазоне от n до m тыс.
        Long countDistinctCarsByPrice = cars
                .stream()
                .filter(filterCarByStartEndPrice)
                .distinct()
                .count();

        System.out.printf("Заданный диапазон цен: от %d до %d\n", startPrice, endPrice);
        System.out.printf("Количество уникальных моделей в ценовом диапазоне: %d\n", countDistinctCarsByPrice);

        //3) Вывести цвет автомобиля с минимальной стоимостью.

        try {
            String carColorWithMinPrice = cars
                    .stream()
                    .min(Comparator.comparingLong(Car::getCarPrice))
                    .orElseThrow().getCarColor();

            System.out.printf("Вывести цвет автомобиля с минимальной стоимостью: %s\n", carColorWithMinPrice);

            // 4) Среднюю стоимость искомой модели modelToFind
            OptionalDouble optionalAverageCarPrice = cars
                    .stream()
                    .filter(filterCarByModel)
                    .map(Car::getCarPrice)
                    .mapToDouble(price -> price)
                    .average();

            Double averageCarPrice = optionalAverageCarPrice.orElseThrow();

            System.out.printf("Заданная модель modelToFind: %s\n", modelToFind);
            System.out.printf("Средняя стоимость модели modelToFind: %.2f\n", averageCarPrice);

            System.out.println();
        } catch (NoSuchElementException exception) {
            System.out.println(exception.getMessage());
        }
    }
}


