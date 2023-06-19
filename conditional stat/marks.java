import java.lang.*;
import java.util.*;
class marks{
    public static void main(String[] args){
        int m1,m2,m3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks of three subjets");
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
        int avg=(int)(m1+m2+m3)/3;
        if(avg>=70){
            System.out.println(" A grade");
        }
        else if(avg>=60 && avg<70)
            {
                System.out.println("B grade");
            }
            else if(avg>=50 && avg<60)
            {
                System.out.println("C grade");
            }
        else if(avg>=40 && avg<50)
        {
            System.out.println("D grade");
        }
        else
        {
            System.out.println("E grade");
        }
    }
}