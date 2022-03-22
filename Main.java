import java.util.Scanner; 
import static java.lang.Math.*;
class Main {
  public static void main(String[] args) {
    
    Scanner myObj = new Scanner(System.in);  
    int x=1;
    while(x>0)
    {
      System.out.println("Podaj nr funkcji, którą chcesz otworzyć");
      x=myObj.nextInt();
      Double liczba1, liczba2, wynik;
          wynik=0.0;
      switch (x)
        {
          case 1:
              {
                System.out.println("Podaj pierwszą liczbę:");
                liczba1 = myObj.nextDouble();
                System.out.println("Podaj drugą liczbę:");
                liczba2 = myObj.nextDouble();
                wynik= pow(liczba1, liczba2);
              }break;
          case 2:
              {
                System.out.println("Podaj pierwszą liczbę:");
                liczba1 = myObj.nextDouble();
                System.out.println("Podaj drugą liczbę:");
                liczba2 = myObj.nextDouble();
                wynik= sqrt(liczba1)+sqrt(liczba2);
              }break;
          case 3:
              {
                System.out.println("Podaj pierwszą liczbę:");
                liczba1 = myObj.nextDouble();
                System.out.println("Podaj drugą liczbę:");
                liczba2 = myObj.nextDouble();
                wynik = max(liczba1, liczba2);
              }break;
          case 4:
              {
                System.out.println("Podaj pierwszą liczbę:");
                liczba1= myObj.nextDouble();
                System.out.println("Podaj drugą liczbę:");
                liczba2= myObj.nextDouble();
                wynik= liczba1 * liczba2;
              }break;
          case 0:
              {
                System.out.println("Do widzenia");
               x=0;
              }break;
        }
        System.out.println("Wynik twojej operacji to: "+wynik);

      }   
    }
   
  }