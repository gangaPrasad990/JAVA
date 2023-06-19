import java.lang.*;
import java.util.*;
class radix {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String num;
        num=sc.nextLine();
        System.out.println("enter the number");
        if(num.matches("[01]+")){
             System.out.println("Binary Radix=2");
        }
        else if(num.matches("[0-7]+")){
            System.out.println("Octial radix=8");
        }
        else if(num.matches("[0-9]+")){
          System.out.println("decimal radix=8");
        }
        else if(num.matches("[0-9A-F]+")){
            System.out.println("Hexo radix=16");
        }
        else{
            System.out.println("it's not a number");
        }
    }
}
