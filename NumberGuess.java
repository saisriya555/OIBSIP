import java.util.*;
import java.io.*;
public class NumberGuess{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=10,count=0;
        int score=10;
        System.out.println(".....WELCOME TO THE NUMBER GUESSING GAME........");
        System.out.println("THE NUMBER OF ROUNDS ARE " +n);
        Random randomNum = new Random();
        int num = randomNum. nextInt(100);
        System.out.println("ENTER THE NUMBER BETWEEN 1 to 100");
        for(int i=1;i<=n;i++){
            System.out.println("ROUND " +i);
            int U=sc.nextInt();
            if(U==num){
                System.out.println("YOU HAVE WON");
                System.out.println("Score is " +score);
                count+=1;
                break;
            }
            else if(U<num){
                System.out.println("you have entered the lower number than the guessed ");
                score-=1;
            }
            else if(U>num){
                 System.out.println("you have entered the higher number than the guessed ");
                 score-=1;

            }
        }
        if(count==0){
            System.out.println("Sorry no of rounds are completed");
            System.out.println("YOU LOSE...");
            System.out.println("Score is " +(score-1));

        }
        
    }
}