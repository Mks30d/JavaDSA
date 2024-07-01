package Basic;

import java.util.Scanner;

public class TemperatureChecker {
    public static void checkTemperature(double temp) throws Exception {
        if (temp < 20) {
            throw new Exception("Temperature Below Normal");
        } else if (temp >= 20 && temp < 40) {
            throw new Exception("Normal Temperature");
        } else if (temp >= 40) {
            throw new Exception("Temperature is High");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature in Celsius: ");
        double temperature = scanner.nextDouble();

        try {
            checkTemperature(temperature);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


//
//// Define the custom exception class
//class TemperatureException extends Exception {
//    public TemperatureException(String message) {
//        super(message);
//    }
//}
//
//public class TemperatureChecker {
//    public static void checkTemperature(double temp) throws TemperatureException {
//        if (temp < 20) {
//            throw new TemperatureException("Temperature Below Normal");
//        } else if (temp >= 20 && temp < 40) {
//            throw new TemperatureException("Normal Temperature");
//        } else if (temp >= 40) {
//            throw new TemperatureException("Temperature is High");
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the temperature in Celsius: ");
//        double temperature = scanner.nextDouble();
//
//        try {
//            checkTemperature(temperature);
//        } catch (TemperatureException e) {
//            System.out.println(e.getMessage());
//        } finally {
//            scanner.close();
//        }
//    }
//}

