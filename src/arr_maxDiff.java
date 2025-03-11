import java.util.Scanner;
public class arr_maxDiff {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        int max=arr[1],min=arr[0];
        for(int i=0; i<n; i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        for(int i=0; i<=max; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        int ans = arr[max] - min;
        System.out.println(ans);
    }
}
