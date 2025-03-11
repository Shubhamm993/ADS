import java.util.*;
public class max_ele {
    public static void main(String[] args){
        int n,i;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int [] arr = new int [n];
        int [] arr2 = new int [n];
        for(i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        for(i=0; i<n; i++){
            String bin = Integer.toBinaryString(arr[i]);
        }
        for(i=0; i<n; i++){
            System.out.println(arr2[i]);
        }
    }
}
