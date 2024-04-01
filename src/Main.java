import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] massiv0 = new int[5]; //объявление переменной и выделение памяти для 5 целых чисел
        //массив уже заполнен 0
        int[] massiv1 = {12, 16, 13, -8, 7, 9};
        int[] massiv2 = inputArray();

        printArray("массив0 содержит ", massiv0);
        printArray("массив1 содержит ", massiv1);
        printArray("массив2 содержит ", massiv2);
        fillArray(massiv0, 193);
        printArray("массив0 содержит ", massiv0);
        printArray("массив2 содержит ", massiv2);
        System.out.println("Сумма элементов массива0:"+sumArray(massiv0));
        System.out.println("Сумма элементов массива1:"+sumArray(massiv1));
        System.out.println("Сумма элементов массива2:"+sumArray(massiv2));
        System.out.println("Минимальное значение массива0:"+minArray(massiv0));
        System.out.println("Минимальное значение массива1:"+minArray(massiv1));
        System.out.println("Минимальное значение массива2:"+minArray(massiv2));
        System.out.println("Максимальное значение массива0:"+maxArray(massiv0));
        System.out.println("Максимальное значение массива1:"+maxArray(massiv1));
        System.out.println("Максимальное значение массива2:"+maxArray(massiv2));
    }
    private static void printArray(String message, int[] massiv) {
        System.out.println(message + massiv.length + " чисел");
        for (int i = 0; i < massiv.length; i++) {
            System.out.println(massiv[i]);
        }
    }
    public static void fillArray(int[] m, int filler)
    {
        for (int i = 0; i < m.length; i++) {
            m[i] = filler;
        }
    }
    public static void readArray(int[] m)
    {
        Scanner scanner = new Scanner(System.in);
        int value;
        System.out.println("введите "+m.length+" элементов массива");
        for (int i = 0; i < m.length; i++) {
            value = scanner.nextInt();
            m[i] = value;
        }
    }
    public static int[] inputArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите размер массива 2");
        int size = scanner.nextInt();
        int[] m = new int[size];
        readArray(m);
        return m;
    }
    public static int sumArray(int[] m){
        int M = 0;
        for (int i = 0; i < m.length; i++)
            M = M + m[i];
        return M;
    }
    public static int minArray(int[] m){
        int min = m[0];
        for (int i = 0; i < m.length; i++) {
            if (m[i] < min)
                min = m[i];
        }
        return min;
    }
    public static int maxArray(int[] m){
        int max = m[0];
        for (int i = 0; i < m.length; i++) {
            if (m[i] > max)
                max = m[i];
        }
        return max;
    }
    
}