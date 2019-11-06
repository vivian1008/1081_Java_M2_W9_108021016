import java.util.*;
public class M2Q10{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        for(int i =1; i<=9; i++){
            for(int j=1; j<=9; j++){
                System.out.printf("%d\t",i*j);
            }
            System.out.println();
        }
    }
}