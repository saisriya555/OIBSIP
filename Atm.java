import java.util.*;
import java.io.*;
public class Atm{
    public static int avbalance,amount,amount2,amount3;
    String history=" ";
    public static ArrayList<Integer> li=new ArrayList<Integer>();
    public static ArrayList<Integer> li2=new ArrayList<Integer>();
    public static ArrayList<Integer> li3=new ArrayList<Integer>();
    public static int[] arr={34567,8901,2346,7890,7689};
    Scanner sc=new Scanner(System.in);
    public void deposit(){
            System.out.println("enter the amount you want to deposit");
            amount=sc.nextInt();
            li.add(amount);
            avbalance=avbalance+amount;
            System.out.println("the total balance is "+avbalance);
    }
    public void withdraw(){
            System.out.println("enter the amount you want to withdraw");
            amount2=sc.nextInt();
            li2.add(amount2);
            if(amount2>avbalance){
                System.out.println("sorry your entered amount is more than the available balance");
            }
            else{
                avbalance=avbalance-amount2;
                System.out.println("you are succesfully withdrawed the amount "+amount2);
                System.out.println("your available balance is " +avbalance);
            }
    }
    public void transfer(){
        System.out.println("the account numbers available are");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("enter the account number you need to transfer");
        int num1=sc.nextInt();
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num1){
                count+=1;
                li3.add(arr[i]);
                break;
            }
        }
        if(count!=0){
            System.out.println("enter the amount you want to transfer");
            amount3=sc.nextInt();
            if(amount3>avbalance){
                System.out.println("sorry you cannot transfer since your availbalance is "+avbalance);
            }
            else{
                avbalance=avbalance-amount3;
                System.out.println("you are succefully transffered the amount "+amount3);
                System.out.println("Available balance is "+avbalance);
            }

        }
        else{
            System.out.println("sorry account number not available");
        }
    }
    public void transferHistory(){
        System.out.println("you have deposited the following amounts");
        System.out.println(li);
        System.out.println("you withdrawed the  following amounts");
        System.out.println(li2);
        System.out.println("your available balance is "+avbalance);
        System.out.println("you have transferred amount to the accounts");
        System.out.println(li3);

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("....WELCOME TO ATM INTERFACE....");
        System.out.println("do you want to register...? press 1 for yes 2 for no");
        int n=sc.nextInt();
        if(n==1){
            System.out.println("enter username");
            String un=sc.next();
            System.out.println("enter password");
            String pwd=sc.next();
            System.out.println("enter your account number to be created");
            int num=sc.nextInt();
            System.out.println("enter some amount to create a bank account");
            amount=sc.nextInt();
            avbalance+=amount;
            if(amount!=0){
                System.out.println("you are succesfully registered");
            }
            System.out.println("do you want to login");
            System.out.println("press 1 for yes 2 for no");
            int n1=sc.nextInt();
            while(n1==1){
                System.out.println("enter username");
                String lun=sc.next();
                System.out.println("enter password");
                String lpwd=sc.next();
                if(un.equals(lun) && pwd.equals(lpwd)){
                    System.out.println("you are successfully logged in");
                    break;
                }
                else{
                    System.out.println("wrong info please enter again");
                 
                }

            }
            while(true){
                System.out.println("which operation do you want to perform");
                System.out.println("1.DEPOSIT 2.WITHDRAW 3.transfer 4.TRANSFER HISTORY5.QUIT");
                int choice=sc.nextInt();
                if(choice==1){
                    Atm de=new Atm();
                    de.deposit();
                }
                if(choice==2){
                    Atm wi=new Atm();
                    wi.withdraw();
                }
                if(choice==3){
                    Atm tr=new Atm();
                    tr.transfer();
                }
                if(choice==4){
                    Atm th=new Atm();
                    th.transferHistory();
                }
                if(choice==5){
                    break;
                }

            }
        }
    }
}