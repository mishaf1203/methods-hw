import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        leapYear(2024);

        appYear(2002, 1);

        delivery(95);

    }

    public static void leapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " високосный год");
        } else {
            System.out.println(year + " не високосный год");
        }
    }


    public static void appYear(int clientDeviceYear, int clientOS) {
        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear >= currentYear && clientOS == 1) {
            System.out.println("Установите приложение последней версии для Android по ссылке");
        } else if (clientDeviceYear >= currentYear && clientOS == 0) {
            System.out.println("Установите приложение последней версии для iOS по ссылке");
        } else if (clientDeviceYear < currentYear && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear < currentYear && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
    }

    public static int delivery(int deliveryDistance) {
        int a = 1;
        int deliveryDuration = 1;
        if (deliveryDistance <= 20) {
            a = deliveryDuration * 1;
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            a = deliveryDuration * 2;
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            a = deliveryDuration * 3;
        }
        return a;

    }
}