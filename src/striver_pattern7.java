import java.util.*;
public class striver_pattern7 {
    public static void main(String[] args){
        int n=5,i,j;
        for(i=n; i>0; i--){
            for(j=0; j<i; j++){
                System.out.print(" ");
            }
            for(j=0; j<=n-i; j++){
                System.out.print("*");
            }
            for(j=1; j<=n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
