import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Podaj tekst: ");
    String tekst = sc.nextLine();

    StringBuilder wynik = new StringBuilder();

    for(int i=0;i<tekst.length();i++){
      char c = tekst.charAt(i);

      if(Character.isUpperCase(c)){
        wynik.append(Character.toLowerCase(c));
      } else if(Character.isLowerCase(c)){
        wynik.append(Character.toUpperCase(c));
      } else {
        wynik.append(c);
      }
    }

    System.out.println("Po zmianie:" +wynik);
  }
}