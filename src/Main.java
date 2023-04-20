public class Main {

    // task 1
    public static void printYear(int finalResult) {
        if (finalResult % 4 == 0 && finalResult % 100 != 0 || finalResult % 400 == 0)
            System.out.println(finalResult + " год является высокосным.");
        else if (finalResult % 4 != 0 && finalResult % 100 == 0 || finalResult % 400 != 0) {
            System.out.println(finalResult + " год не является высокосным.");
        }
    }

    // task 2
    public static void mobile (int clientOS1, int clientDeviceYear1) {
        if (clientOS1 == 0 && clientDeviceYear1 >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS1 == 0 && clientDeviceYear1 < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS1 == 1 && clientDeviceYear1 >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS1 == 1 && clientDeviceYear1 < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    // task 3
    public static int distance (int qwe){
        int distance = qwe;

        if ( distance < 20) {
            System.out.println("Потребуется 1 день для доставки.");
        }
        else if ( distance >= 20 && distance < 60) {
            System.out.println("Потребуется 2 дня для доставки.");
        }
        else if ( distance >= 60 && distance < 100) {
            System.out.println("Потребуется 3 дня для доставки.");
        } else {
            System.out.println("Свыше 100 км доставки нет.");
        }

        return distance;

    }


        public static void main (String[]args){

            // task 1
            short year = 2023;
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                printYear(year);
            } else {
                printYear(year);
            }

            // task 2

            int clientOS = 0;
            int clientDeviceYear = 2010;
            mobile (clientOS, clientDeviceYear);

            // task 3

            int deliveryDistance = 10;
            int asd = distance(deliveryDistance);



        }
    }