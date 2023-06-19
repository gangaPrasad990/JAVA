import java.lang.*;
public class date {
public static void main(String[] args){
    String d="01/02/2001";
    String str=String.valueOf(d);
    System.out.println(str.matches("[0-3][0-9]/[0-3][0-9]/[0-9]{4}"));
}    
}
