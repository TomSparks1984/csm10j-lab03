import java.util.*;

public class Lab03_B_DoWhile {
    
    static Scanner console = new Scanner(System.in);
   
    public static void main(String[] args) {
    
    int firstNum = 1;
    int secondNum = 0;
    int currentNum = 0;
    
    while(firstNum >= secondNum)
    {
    System.out.println( "Input the first number:");
    firstNum = console.nextInt();
    
    currentNum=firstNum;
    
    System.out.println( "Input the second number:");
    secondNum = console.nextInt();
    
    if (firstNum >= secondNum)
    {
        System.out.println("Sorry, your first number must be less than the second.");            
    }
    }
    System.out.println( "All odd numbers between " + firstNum + " and " + secondNum + " inclusive");
        do 
        {
            if(currentNum %2 == 1) {
              System.out.println(currentNum);
            }
        currentNum++; 
        }
        while (currentNum <= secondNum);
        
    System.out.println("Sum of all even numbers between " + firstNum + " and " + secondNum + " inclusive");
        
        int sum = 0;
        currentNum = firstNum;
        
        do 
        { 
        if(currentNum %2 == 0) {
        sum = (sum + currentNum); 
        }
        currentNum++;
        }
        while (currentNum <= secondNum);
        System.out.println(sum);
    }
    
}
