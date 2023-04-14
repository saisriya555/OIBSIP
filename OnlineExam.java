import java.util.*;
import java.io.*;
import javax.swing.Timer;
public class OnlineExam{
    public static void main(String[] args){
        String u,p;
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your username and password to register");
        String un=sc.nextLine();
        String pwd=sc.nextLine();
        System.out.println("you are registered succesfully");
        System.out.println("do you want to update your details?");
        System.out.println("1.yes 2.no");
        int up=sc.nextInt();
        if(up==1){
          System.out.println("enter username");
          un=sc.next();
          System.out.println("enter the password");
          pwd=sc.next();
          System.out.println("updated succesfully");
        }
        while(true){
            System.out.println("login to write the exam");
            System.out.println("enter username:");
            u=sc.next();
            System.out.println("enter password:");
            p=sc.next();
            if(u.equals(un)&& p.equals(pwd)){
             System.out.println("you are succesfully logged in");
             break;
            }
            else{
                System.out.println("wrong details!please enter again");
            }
        }
        System.out.println("would you like to start the exam");
        System.out.println("press 1 for yes and 2 for no");
        int n=sc.nextInt();
        if(n==1){
            System.out.println("you have total 5 questions to attempt in 1 min");
            System.out.println("would you like to begin?");
            System.out.println("press 1 for yes and 2 for no");
            int n2=sc.nextInt();
            if(n2==1){
                while(true){
                    System.out.println("your time starts now");
                    //int countdown=60000;
                    //Timer timer=new Timer(countdown);
                    //timer.start();
                    System.out.println("in which year java was invented?");
                    System.out.println("options:");
                    System.out.println("1.1985");
                    System.out.println("2.1995");
                    int q1=sc.nextInt();
                    if(q1==1){
                        count+=1;

                    }
                    System.out.println("who invented java");
                    System.out.println("options:");
                    System.out.println("1.Guido Van Rossum");
                    System.out.println("2.James Gosling");
                    int q2=sc.nextInt();
                    if(q2==2){
                        count+=1;
                    }
                    System.out.println("number of primitive datatypes in java");
                    System.out.println("options:");
                    System.out.println("1.8");
                    System.out.println("2.1");
                    int q3=sc.nextInt();
                    if(q3==1){
                        count+=1;
                    }
                    System.out.println("what is the size of float in java");
                    System.out.println("options:");
                    System.out.println("1.64");
                    System.out.println("2.32");
                    int q4=sc.nextInt();
                    if(q4==2){
                        count+=1;
                    }
                    System.out.println("automatic type conversion is possible in which types of datatypes in java");
                    System.out.println("options:");
                    System.out.println("1.int to long");
                    System.out.println("2.short to int");
                    int q5=sc.nextInt();
                    if(q5==1){
                        count+=1;
                    }
                    System.out.println("do you want to submit");
                    System.out.println("1.yes");
                    System.out.println("2.no");
                    int n3=sc.nextInt();
                    if(n3==1){
                        break;
                    }
                }
                System.out.println("yoy scored" +count);
            }
        }
    }
}
                
