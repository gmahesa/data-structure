package modul_1;

import java.util.*;
class array{
   public static void main(String args[]){
      ArrayList<String> alist = new ArrayList<String>(); 
      alist.add("ini");
      alist.add("contoh");
      alist.add("saja");
      alist.add("bukan");
      alist.add("asli");
      alist.add("bro");

      System.out.println(alist);

      alist.remove("saja");
      alist.remove("bro");

      System.out.println(alist);

      alist.remove(2);
      alist.add(2,"masih");
      alist.add(4,"kaya tadi");
      int index = alist.indexOf("contoh");
      boolean kata = alist.contains("masih");
      
      System.out.println(alist);
      System.out.println("contoh berada pada index ke " + index);
      System.out.println(kata);
      
      ArrayList<String> arr = new ArrayList<String>();
      arr.add("ini");
      arr.add("cuma");
      arr.add("tambahan aja sih");     
      alist.addAll(arr);
      
      System.out.println("final arraylist : " +alist);    
   }
}

