import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.print("Podaj wyskość choinki:");
    int height = sc.nextInt();
    System.out.print("Podaj znak do rysowania choinki:");
    String znak = sc.next();
    char ch = znak.charAt(0);
    System.out.print("Podaj liczbe kopii: ");
    int copies = sc.nextInt();

    if(height < 1){
      System.out.print("Wysokość musi być większa lub równa 1");
      return;
    }

    for (int i = 0;i<copies;i++){
      drawTree(height, ch);
      System.out.println();
    }
  }
  private static void drawTree(int height, char  ch){
    for (int row = 0; row < height; row++){
      int count = (row + 1);
      for (int i=0;i<count;i++) System.out.print(ch);
      System.out.println();
    }
    
  }
}