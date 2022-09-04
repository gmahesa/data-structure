package modul2;

import java.util.Scanner;

public class TUGAS1 {
   public static void main(String[] args) {
      System.out.println("input kaya: ");
      
      Scanner scan = new Scanner(System.in);
      
      String kata = scan.nextLine();
      
      int stackSize = kata.length();
      
      Stack stack = new Stack(stackSize);
      
      for (int j = 0 ; j < kata.length() ; j++) {
         char huruf = kata.charAt(j);
         stack.push(huruf);
      } 
      while (!stack.isEmpty()) {
         char huruf = stack.pop();
         System.out.print(huruf);
      } 
   }
}
