import java.util.*;
public class M2Q7{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 1 ; i <=n; i++) {
            int a = scn.nextInt();
            int b = scn.nextInt();
            int c = scn.nextInt();
        if(a >= 60 && b >= 60 && c >= 60){
            System.out.println("P");
        }
        else if((a < 60 && b >= 60 && c>=60 || b < 60 && a >= 60 && c>=60 || c < 60  && b >= 60 && a>=60) && a+b+c >= 220){
            System.out.println("P");
        }
        else if((a < 60 && b >= 60 && c>=60 || b < 60 && a >= 60 && c>=60 || c < 60 && b >= 60 && a>=60) && a+b+c < 220){
            System.out.println("M");
        }
        else if(a < 60 && b < 60 && c >= 80 || a < 60 && c < 60 && b >= 80 || b < 60 && c < 60 && a >= 80){
            System.out.println("M");
        }
        else{
            System.out.println("F");
        }
    }
  }
}