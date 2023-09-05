import java.util.Scanner;

public class lb22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть кількість рядків: ");
        int rows = scanner.nextInt();
        System.out.print("Введіть кількість стовпців: ");
        int cols = scanner.nextInt();
        int[][] my2DArray = create2DArray(rows, cols);
        print2DArray(my2DArray);
    }

    public static int[][] create2DArray(int rows, int cols) {
        int[][] array = new int[rows][cols];
        int value = 1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = value;
                value += 3;
            }
        }

        return array;
    }

    public static void print2DArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

