package com.company;

public class Main {

    public static void main(String[] args) {
        // firstExercise();
        // secondExercise();
        // thirdExercise();
        // fourthExercise ();
        // fifthExercise();

    }

    public static void firstExercise (){
        // Задание 1

        int clientOS = 1;
        if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public  static void secondExercise(){
        // Задание 2
        int clientOS = 0;
        int clientDeviceYear = 2015;

        if (clientOS == 0 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }else if (clientOS == 1 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }else {
            if (clientOS == 0){
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientOS == 1){
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }

    }

    public static void thirdExercise (){
        // Задание 3
        int year = 2021;

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) ){
            System.out.println(year + " год является високосным");
        }else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void fourthExercise (){
        // Задание 4
        int deliveryDistance = 95;
        int deliveryDay = 1;
        if (deliveryDistance < 20){
            System.out.println("Потребуется дней: " + deliveryDay );
        }else if (deliveryDistance >= 20 && deliveryDistance < 60){
            deliveryDay += 1;
            System.out.println("Потребуется дней: " + deliveryDay );
        }else if (deliveryDistance >= 60 && deliveryDistance < 100){
            deliveryDay += 2;
            System.out.println("Потребуется дней: " + deliveryDay );
        }

    }

    public static void fifthExercise (){
        // Задание 5
        int monthNumber = 1;

            switch (monthNumber){
                case 1: case 2: case 12:
                    System.out.println("Это зимний месяц");
                    break;
                case 3: case 4: case 5:
                    System.out.println("Это весенний месяц");
                    break;
                case 6: case 7: case 8:
                    System.out.println("Это летний месяц");
                    break;
                case 9: case 10: case 11:
                    System.out.println("Это осенний месяц");
                    break;
                default:
                    System.out.println("Введите значение от 1 до 12");
                    break;

            }


    }

}
