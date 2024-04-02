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
        System.out.println("Номер максимального элемента массива0:"+indexOfMaxArray(massiv0));
        System.out.println("Номер максимального элемента массива1:"+indexOfMaxArray(massiv1));
        System.out.println("Номер максимального элемента массива2:"+indexOfMaxArray(massiv2));
        MaxMinArray(massiv2);
        System.out.println("Номер максимального элемента массива2:"+indexOfMaxArray(massiv2));
        System.out.println("Элемент равный параметру Х массива2:"+findXArray(massiv2));
        System.out.println("Номер элемента ближайшего по модулю к Х массива2:"+findModCloseXArray(massiv2));
        printBackArray("массив2 содержит ", massiv2);
        printIntervalArray(massiv1);
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
        int msum = 0;
        for (int i = 0; i < m.length; i++)
            msum = msum + m[i];
        return msum;
    }
    public static int minArray(int[] m){
        int min = m[0];
        for (int i = 1; i < m.length; i++) {
            if (m[i] < min)
                min = m[i];
        }
        return min;
    }
    public static int indexOfMaxArray(int[] m){
        int imax = 0;
        for (int i = 1; i < m.length; i++) {
            if (m[i] > m[imax]) {
                imax = i;
            }
        }
        return imax;
    }
    public static int indexOfMinArray(int[] m){
        int imin = 0;
        for (int i = 1; i < m.length; i++) {
            if (m[i] < m[imin]) {
              imin = i;
            }
        }
        return imin;
    }
    public static void MaxMinArray(int[] m){
        int imin = indexOfMinArray(m);
        int imax = indexOfMaxArray(m);
        int temp;
        temp = m[imin];
        m[imin] = m[imax];
        m[imax] = temp;
    }
    public static int findXArray(int[] m){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число х: ");
        int x = sc.nextInt();
        for (int i = 0; i < m.length; i++) {
            if (m[i] == x)
                return i;
        }
        return -1;
    }
    public static int findModCloseXArray(int[] m){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число х: ");
        int x = sc.nextInt();
        int modClose = m[0];
        int iclose = 0;
        for (int i = 1; i < m.length; i++) {
            if (Math.abs(Math.abs(x) - Math.abs(m[i])) < Math.abs((Math.abs(x) - modClose))) {
                modClose = m[i];
                iclose = i;
            }
        }
        return iclose;
    }
    private static void printBackArray(String message, int[] massiv) {
        System.out.println(message + massiv.length + " чисел");
        for (int i = massiv.length-1; i >= 0; i--) {
            System.out.println(massiv[i]);
        }
    }
    public static void printIntervalArray(int[] m){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число х1: ");
        int x1 = sc.nextInt();
        System.out.println("Введите число х2: ");
        int x2 = sc.nextInt();
        for (int i = 0; i < m.length; i++) {
            if ((m[i] >= x1) && (m[i] <= x2))
                System.out.println(m[i]);
        }
    }
}