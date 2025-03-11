import java.util.*;
public class dectobin {
    static void decToBinary(int n){
        int [] bin = new int[1000];
        int ctr=0;
        int i = 0;
        while(n>0){
            bin[i] = n%2;
            n = n/2;
            i++;
        }
        for(int j = i-1; j>=0; j--) {
            if(bin[j]==1) ctr++;
            //System.out.print(bin[j]);
        }
        //System.out.println();
        System.out.print(ctr+" ");
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n,i;
        n = scan.nextInt();
        int [] arr = new int[n];
        for(i=0; i<n; i++){
            arr[i]= scan.nextInt();
        }
        for(i=0; i<n; i++) {
            //System.out.println("decimal: " + arr[i]);
            //System.out.print("binary: ");
            decToBinary(arr[i]);
        }

    }
}
