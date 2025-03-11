import java.util.*;
class arr_leader {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n-1; j++){
                if(arr[j]>arr[i]){
                    System.out.print(arr[j]+" ");
                }
            }
        }
        System.out.print(arr[n-1]);
    }
}