import java.util.*;
class keyname1{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        float base,height,area;
        System.out.println("enter base");
        base=s.nextFloat();
        System.out.println("enter height");
        height=s.nextFloat();
        area=((1f/2f)*base*height);
        System.out.println("area of trinagle is" +area);
    }
}
