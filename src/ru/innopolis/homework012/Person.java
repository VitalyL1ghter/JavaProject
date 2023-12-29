package ru.innopolis.homework012;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.StringJoiner;
import java.util.regex.Pattern;

public class Person {
    private String lastName;
    private String firstName;
    private String patronymic;
    private Date dateOfBirth;
    private Long phoneNumber;
    private String gender;
    private Integer age;
    public Person() {
    }
    public Person(String lastName, String firstName, String patronymic, Date dateOfBirth,
                  Long phoneNumber, String gender, Integer age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.age = age;
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName.isEmpty() || lastName == null || lastName.length() <= 2) {
            throw new InputMismatchException("Фамилия должна быть не пустой строкой, и не менее чем из 3 букв");
        } else if (!Pattern.matches("[а-яА-я\s]+", lastName)) {

        } else {
            this.lastName = lastName;
        }
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.isEmpty() || firstName == null || firstName.length() <= 2) {
            throw new InputMismatchException("Имя должно быть не пустой строкой, и не менее чем из 3 букв");
        } else if (!Pattern.matches("[а-яА-я\s]+", firstName)) {

        } else {
            this.firstName = firstName;
        }
    }
    public String getPatronymic() {
        return patronymic;
    }
    public void setPatronymic(String patronymic) {
        if (patronymic.isEmpty() || patronymic == null || patronymic.length() <= 7) {
            throw new InputMismatchException("Отчество должно быть не пустой строкой, и не менее чем из 7 букв");
        } else if (!Pattern.matches("[а-яА-я\s]+", patronymic)) {

        } else {
            this.patronymic = patronymic;
        }
    }

    public Date getDateOfBirth() {

        return dateOfBirth;
    }
    public void setDateOfBirth(Date dateOfBirth) {
        if (dateOfBirth == null) {
            throw new InputMismatchException("Дата рождения должна быть указанна");
        }
        this.dateOfBirth = dateOfBirth;
    }
    public Long getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(Long phoneNumber) {
        if (phoneNumber == null || phoneNumber == 0L || Long.toString(phoneNumber).length() != 11) {
            throw new InputMismatchException("Номер телефона должен быть указан и состоять из 11 цифр в формате 8ХХХХХХХХХХ");
        }

        else {
            this.phoneNumber = phoneNumber;
        }
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        if (gender == null || gender.isEmpty()) {
            throw new InputMismatchException("Пол должен быть указан в формате f (женский) либо m (мужской)");
        } else if (!Pattern.matches("[fm]", gender)) {
            throw new InputMismatchException("Пол должен быть указан в формате f (женский) либо m (мужской)");
        } else {
            this.gender = gender;
        }
    }
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age == null || age <= 0 || age > 110) {
            throw new InputMismatchException("Возвраст должен быть указан");
        } else {
            this.age = age;
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return Objects.equals(getLastName(), person.getLastName()) && Objects.equals(getFirstName(),
                person.getFirstName()) && Objects.equals(getPatronymic(),
                person.getPatronymic()) && Objects.equals(getDateOfBirth(),
                person.getDateOfBirth()) && Objects.equals(getPhoneNumber(),
                person.getPhoneNumber()) && Objects.equals(getGender(),
                person.getGender()) && Objects.equals(getAge(), person.getAge());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getLastName(), getFirstName(),
                getPatronymic(), getDateOfBirth(),
                getPhoneNumber(), getGender(), getAge());
    }
    @Override
    public String toString() {
        return new StringJoiner(", ", Person.class.getSimpleName() + "[", "]")
                .add("lastName='" + lastName + "'")
                .add("firstName='" + firstName + "'")
                .add("patronymic='" + patronymic + "'")
                .add("dateOfBirth=" + dateOfBirth)
                .add("phoneNumber=" + phoneNumber)
                .add("gender='" + gender + "'")
                .add("age=" + age)
                .toString();
    }
}
