import java.util.Scanner;

public class GuessNum {

public static void main(String args[])
{

Scanner sc = new Scanner(System.in);
int mynumber = (int)(Math.random()*100+1);
int num=0;
int count = 1;

do {
        System.out.println("Guess my number or enter '505' for exit:");
    num = sc.nextInt();
    count++;
    
    if (num == mynumber)  

    {
        System.out.println("THAT'S A RIGHT GUESS !!! \nYou took " + count + " attempts."); 
        break; 
    }

    else if (num == 505)
    {
        System.out.println("You took " + count + " attempts.\nProgram aborted successfully");
        break;
    }

    else if (num < 1 || num > 100)
    {
        System.out.println("Make sure entered value must be between 1 to 100 or '505'");
    }

    else if (num>mynumber)
    {
        System.out.println("Make a lower guess"); 
    }

    else if (num<mynumber)
    {
        System.out.println("Make a higher guess"); 
    }

    } 

while (num>=0);

}

}
