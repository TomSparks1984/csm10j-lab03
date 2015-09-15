import java.util.*;/**

public class Lab03_A.java {
    
    static Scanner console = new Scanner(System.in); 
    public static void main(String[] args) {
        
       int numberOfPages;
       double costToFax;
       
       System.out.println("How many pages to fax?" );
       costToFax = 3.20;
       numberOfPages = console.nextInt();
       
       if (numberOfPages <= 10 && numberOfPages > 0) {
           costToFax = 3.20; 
       } else if(numberOfPages >10) {
          costToFax = 3.20 + (numberOfPages - 10) * 0.10;
       }

      System.out.println("That will cost $" + String.format("%.2f", costToFax));
    }
    
}
