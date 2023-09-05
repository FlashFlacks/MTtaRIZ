package Java;
public class lb2 {
public static void main(String[] args) {
  int heigh = 6;
  for (int i=1; i<=heigh; i++) {
    for (int space=1; space<=heigh-i; space++) {
      System.out.print(" ");
    }
    for (int star=1; star<=i*2-1; star++) {
      System.out.print("*");
    }
    System.out.println();
    }
  }
} 
