import java.util.*;
class Result {
    public static int findOddMan(int n, int arr[]) {
        // Write your code here
        //Scanner scan = new Scanner(System.in);
        int i,j;
        for(i=0; i<n; i++){
            int count = 0;
            for(j=0; j<n; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count%2!=0){
                break;
            }
            return -1;
        }
        return arr[i];
    }
}