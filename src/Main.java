public class Main {
    public static void main(String[] args) {
        //task1
        System.out.println("Задача №1");
        byte clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке\nЗадача №2");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке\nЗадача №2");
        }
        //task2
        short clientDeviceYear = 2014;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке\nЗадача №3");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке\nЗадача №3");
            }
        } else if (clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке\nЗадача №3");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке\nЗадача №3");
        }
        //task3
        short year = 2023;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " год является високосным");
                } else {
                    System.out.println(year + " год НЕ является високосным");
                }
            } else {
                System.out.println(year + " год является високосным");
            }
        } else {
            System.out.println(year + " год НЕ является високосным");
        }
        System.out.println("Задача №4");
        //task4
        short distance = 165;
        if (distance < 20) {
            System.out.println("Потребуются сутки на доставку");
        } else if (distance <= 60) {
            System.out.println("Потребутся 2 дня на доставку");
        } else if (distance <= 100) {
            System.out.println("Потребутся 3 дня на доставку");
        } else {
            System.out.println("Доставки нет");
        }
        System.out.println("Задача №5");
        //task5
        byte monthNumber = 13;
        switch (monthNumber) {
            case 12, 1, 2:
                System.out.println("Зима");
                break;
            case 3, 4, 5:
                System.out.println("Весна");
                break;
            case 6, 7, 8:
                System.out.println("Лето");
                break;
            case 9, 10, 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Месяца с таким номером нет");
        }
    }
}