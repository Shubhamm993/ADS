import java.util.*;
public class class_test {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int ans=0;
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= scan.nextInt();
        }
        for(int i=0; i<n; i++){
            int count=0;
            for(int j=i+1; j<n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    ans = Math.max(ans, count);
                }
            }
        }
        System.out.println(ans);
    }
}
