 import java.util.*;

 public class Main {
     public static void main(String[] args) {
        Set<String> hash = new HashSet<>();
        hash.add("java");
         hash.add("spring");
         hash.add("java");
         hash.add("collections");
         hash.add("spring");
         hash.add("oop");

         Set<String> tree = new TreeSet<>(hash);


         for(String s : tree){
             System.out.print(s + " ");
         }
     }
 }






