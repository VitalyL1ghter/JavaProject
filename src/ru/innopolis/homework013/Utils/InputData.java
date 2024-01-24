package ru.innopolis.homework013.Utils;

public class InputData {

    public InputData() {
    }
    public static Integer parseCount(String inputNewData) throws NumberFormatException {
        try {
            return  Integer.parseInt(inputNewData);
        } catch (NumberFormatException error) {
            throw new NumberFormatException("Невалидное значение" + error);
        }
    }
    public static Integer validateCount(String inputNewData) throws NumberFormatException {
        try {
            return parseCount(inputNewData);
        } catch (NumberFormatException error) {
            throw new NumberFormatException("Невалидное значение" + error);
        }
    }
    public static Double parseNumber(String inputNewData) throws NumberFormatException {
        try {
            return  Double.parseDouble(inputNewData);
        } catch (NumberFormatException error) {
            throw new NumberFormatException("Невалидное значение" + error);
        }
    }
    public static Double validateNumber(String inputNewData) throws NumberFormatException {
        try {
            return parseNumber(inputNewData);
        } catch (NumberFormatException error) {
            throw new NumberFormatException("Невалидное значение" + error);
        }
    }
}



