import java.util.Scanner;
public class FactorialExample {

     static void main(String[] args) {

    	//We will find the factorial of this number
        int number;
       
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        scanner.close();
        long fact = 1;
        int i = 1;
        while(i<=number)
        {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}