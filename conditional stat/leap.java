import java.lang.*;
import java.util.*;
class leap{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int year;
        year=sc.nextInt();
        System.out.println("Enter year");
        if(year%4==0){
            System.out.println("IS a leap year");
        }
        else if(year%100==0){
            System.out.println("is not a leap year");
        }
        else if(year%400==0){
            System.out.println("IS a leap year");
        }
        else{
            System.out.println("Is not a leap year");
        }
    }
}