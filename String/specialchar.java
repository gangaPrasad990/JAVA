import java.lang.*;
public class specialchar {
public static void main(String[] args){
    String str="abc def   ghi  jk   l  mon  pqr  stuv   wxyz";
    //System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));
 System.out.println(str.replaceAll("\\s+"," "));
}
}
