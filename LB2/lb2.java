
import java.util.Scanner;

public class lb2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення кількості рівнів ялинки
        System.out.print("ввод количество уровней ёлки: ");
        int treeLevels = scanner.nextInt();

        // Виведення ялинки
        printTree(treeLevels);

        // Введення розмірів масиву
        System.out.print("ввод к-ства строк массива: ");
        int rows = scanner.nextInt();
        System.out.print("ввод к-ства столбцов массива: ");
        int cols = scanner.nextInt();

        // Створення та виведення масиву
        int[][] my2DArray = createAndPrint2DArray(rows, cols);
    }

    public static void printTree(int levels) {
        for (int i = 1; i <= levels; i++) {
            for (int j = 1; j <= levels - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static int[][] createAndPrint2DArray(int rows, int cols) {
        int[][] array = new int[rows][cols];
        int value = 1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = value;
                System.out.print(array[i][j] + " "); // Виведення значення
                value += 3;
            }
            System.out.println(); // Перехід на новий рядок
        }

        return array;
    }
}