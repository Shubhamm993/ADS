import java.util.*;
public class pattern {
    public static void main(String[] args){
        int n,i,j;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        for(i=n-1; i>=0; i--){
            for(j=i; j<n; j++){
                System.out.print(n-j);
            }
            System.out.println();
        }
    }
}
