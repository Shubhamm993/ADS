import java.util.*;
public class striver_pattern6 {
    public static void main(String[] args){
        int n=5;
        int i,j;
        for(i=n; i>0; i--){
            for(j=0; j<i; j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}
