package Consultation;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество номеров в отеле: ");
        int qtyRooms = scanner.nextInt();
        scanner.nextLine();

        int[] rooms = new int[qtyRooms]; // rooms = {0, 0, 0, 0}
        myNewMethodVoidArray(rooms);

        inputDataArray(0, rooms, scanner);

        myNewMethodVoidArray(rooms);

        System.out.println("Введите количество номеров после реконструкции: ");
        int newQuantityRooms = scanner.nextInt();
        scanner.nextLine(); // "обнуляем" данные из потока консоли

        int[] newHotel = reconstructHotel(rooms, newQuantityRooms);

        myNewMethodVoidArray(newHotel);
    }


    public static void myNewMethodVoidArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Номер [" + (i + 1) + "]: " + array[i]);
        }
    }

    public static void inputDataArray(int counter, int[] arr, Scanner scanner) {
        for (int i = counter; i < arr.length; i++) {
            // Выводим строку запроса для ввода и выводим номер комнаты (i)
            System.out.println("Введите количество человек которые проживают в номере [" + (i + 1) + "]: ");
            int peoples = scanner.nextInt();
            scanner.nextLine();
            arr[i] = peoples;
        }
    }

    public static int[] reconstructHotel(int[] array, int quantityRooms) {
        Scanner scanner = new Scanner(System.in);

        if (array.length < quantityRooms) {  // Хотим увеличить количество номеров
            int[] newHotel = new int[quantityRooms];

            for (int i = 0; i < array.length; i++) { // копируем номера из исходного массива
                newHotel[i] = array[i];
            }

            inputDataArray(array.length, newHotel, scanner); // перезаписываем "0" на новое количество человек в номере

            return newHotel;    // возвращаем новый массив (новый отель) в выше стоящий метод
        } else { // Хотим уменьшить количество номеров (номера делаем большими)
            int[] newHotel1 = new int[quantityRooms];

            for (int i = 0; i < quantityRooms; i++) { // копируем нужное количество номеров из исходного массива
                newHotel1[i] = array[i];
            }

                return array; // пока возвращаем исходный массив в выше стоящий метод
                // попробуйте сделать самостоятельно реконструкцию с уменьшением количества номеров

        }


    }
}