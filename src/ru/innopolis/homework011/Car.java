package ru.innopolis.homework011;

import java.util.Objects;
import java.util.StringJoiner;

public class Car {

    private String carNumberId;
    private String carModel;
    private String carColor;
    private Long carMileage;
    private Long carPrice;

    public Car() {
    }

    public Car(String carNumberId, String carModel, String carColor, Long carMileage, Long carPrice) {
        this.carNumberId = carNumberId;
        this.carModel = carModel;
        this.carColor = carColor;
        this.carMileage = carMileage;
        this.carPrice = carPrice;
    }

    public String getCarNumberId() {
        return carNumberId;
    }

    public void setCarNumberId(String carNumberId) {
        this.carNumberId = carNumberId;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public Long getCarMileage() {
        return carMileage;
    }

    public void setCarMileage(Long carMileage) {
        this.carMileage = carMileage;
    }

    public Long getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(Long carPrice) {
        this.carPrice = carPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return Objects.equals(getCarNumberId(),
                car.getCarNumberId()) && Objects.equals(getCarModel(),
                car.getCarModel()) && Objects.equals(getCarColor(),
                car.getCarColor()) && Objects.equals(getCarMileage(),
                car.getCarMileage()) && Objects.equals(getCarPrice(),
                car.getCarPrice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCarNumberId(), getCarModel(), getCarColor(), getCarMileage(), getCarPrice());
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Car.class.getSimpleName() + "[", "]")
                .add("carNumberId='" + carNumberId + "'")
                .add("carModel='" + carModel + "'")
                .add("carColor='" + carColor + "'")
                .add("carMileage=" + carMileage)
                .add("carPrice=" + carPrice)
                .toString();
    }
}
