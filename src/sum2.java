import java.util.*;
public class sum2 {
    public static void main(String[] arggs){
        int n,min,max,temp,i,j;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int [] arr = new int[n];
        for(i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        for(i=0; i<n; i++){
            for(j=i+1; j<n; j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("min ele: "+ arr[0]);
        System.out.println("max ele: "+ arr[n-1]);
    }
}
