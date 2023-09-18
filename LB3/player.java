import java.util.Scanner;

public class player {
    public String name;
    public char symbol;

    public player(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public int[] makeMove() {
        int[] move = new int[2];
        Scanner scanner = new Scanner(System.in);

        System.out.println(name + ", enter row number (0, 1, 2): ");
        move[0] = scanner.nextInt();

        System.out.println(name + ", enter column number (0, 1, 2): ");
        move[1] = scanner.nextInt();

        return move;
    }

    public void displayInfo() {
        System.out.println("Player: " + name);
        System.out.println("Symbol: " + symbol);
    }
}