import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.print("Podaj wyskość choinki:");
    int height = sc.nextInt();
    System.out.print("Podaj znak do rysowania choinki:");
    String znak = sc.next();
    char ch = znak.charAt(0);

    if(height < 1){
      System.out.print("Wysokość musi być większa lub równa 1");
      return;
    }

    drawTree(height, ch);
    drawTrunk(height, ch);
  }
  private static void drawTree(int height, char  ch){
    for (int row = 0; row < height; row++){
      int spaces = height - row - 1;
      int count = 2 * row + 1;



      for (int i=0;i<spaces;i++) System.out.print(' ');
      for (int i=0;i<count;i++) System.out.print(ch);
      System.out.println();
    }
  }
  private static void drawTrunk(int height, char ch){
    int trunkWidth = Math.max(1, height / 3);
    if(trunkWidth % 2 == 0) trunkWidth++;
    int totalWidth = height * 2 - 1;
    int spaces =(totalWidth - trunkWidth)/2;

    for(int r=0;r<2;r++){
      for(int i=0;i<spaces;i++) System.out.print(' ');
      for(int i=0;i<trunkWidth;i++) System.out.print(ch);
      System.out.println();
    }
  }
}