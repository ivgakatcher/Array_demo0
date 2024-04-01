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
    }
}