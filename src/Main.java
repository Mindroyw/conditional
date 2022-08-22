public class Main {
    public static void main(String[] args) {


        int clientOs = 0; //задача с ссылкой на приложение, по дефолту стоит иос
        int clientDeviceYear = 2014;
        if (clientOs == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        }else if (clientOs == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        }else if (clientOs == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }else if (clientOs == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        int year = 2021; // задачв с годами
        int highYear = 2020;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " високосный год");
        }else{
            System.out.println(year + " не високосный год");
        }

        int deliveryDistance = 95; // задача с доставкой карты
        if (deliveryDistance <= 20) {
            System.out.println("Срок доставки: 1 день");
        }else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Срок доставки: 2 дня");
        }else if (deliveryDistance > 60 && deliveryDistance < 100) {
            System.out.println("Срок доставки: 3 дня");
        }

        int monthNumber = 12; //задача с определением месяца
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Это зимний месяц");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Это весенний месяц");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Это летний месяц");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Это осенний месяц");
                break;
            default:
                System.out.println("Такого месяца не существует");

        }

    }

}