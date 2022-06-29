import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        task1(2024);

        task2(2022, 0);

        task3(95);

    }

    public static void task1(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }


    public static void task2(int clientDeviceYear, int clientOS) {
        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear >= currentYear && clientOS == 1) {
            System.out.println("Установите приложение последней версии для Android по ссылке");
        }
        if (clientDeviceYear >= currentYear && clientOS == 0) {
            System.out.println("Установите приложение последней версии для iOS по ссылке");
        }
        if (clientDeviceYear < currentYear && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (clientDeviceYear < currentYear && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
    }
    public static void task3(int deliveryDistance){
        int deliveryDuration = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: "+ deliveryDuration * 1);
        }
        if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: "+ deliveryDuration *  2);
        }
        if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: "+ deliveryDuration * 3);
        }

    }

}