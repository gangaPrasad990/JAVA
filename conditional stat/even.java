import java.lang.*;
import java.util.*;
class even{
    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the age of person");
        n=sc.nextInt();
        if(n<=18){
            System.out.println("the person is young");
        }else{
            System.out.println("the person is not young");
        }


    }
}