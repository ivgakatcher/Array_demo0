import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] massiv0 = new int[5]; //объявление переменной и выделение памяти для 5 целых чисел
        //массив уже заполнен 0
        int[] massiv1 = {12, 16, 13, -8, 7, 9};

        Scanner scanner = new Scanner(System.in);
        System.out.println("введите размер еще одного массива");
        int size = scanner.nextInt();

        int[] massiv2 = new int[size];

        printArray("массив0 содержит ", massiv0);
        printArray("массив1 содержит ", massiv1);
        printArray("массив2 содержит ", massiv2);
    }
    private static void printArray(String message, int[] massiv) {
        System.out.println(message + massiv.length + " чисел");
        for (int i = 0; i < massiv.length; i++) {
            System.out.println(massiv[i]);
        }
    }
}