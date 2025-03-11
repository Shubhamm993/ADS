import java.util.*;
public class multi_2darray {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n,m,i,j,k,p;
        n = scan.nextInt();
        m = scan.nextInt();
        p = scan.nextInt();
        int [][] arr = new int[n][m];
        int [][] arr2 = new int[m][p];
        int [][] mul = new int[n][p];

        //for(i=0; i<n; i++){
            for(i=0; i<n; i++){
                for(j=0; j<m; j++){
                    arr[i][j] = scan.nextInt();
                }
            }

            for(i=0; i<n; i++){
                for(j=0; j<m; j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println("");
            }
            for(i=0; i<m; i++){
                for(j=0; j<p; j++){
                    arr2[i][j] = scan.nextInt();
                }
            }

            for(i=0; i<m; i++){
                for(j=0; j<p; j++){
                    System.out.print(arr2[i][j]+" ");
                }
                System.out.println("");
            }

            for(i=0; i<n; i++){
                for(j=0; j<p; j++){
                    for(k=0; k<m; k++){
                        mul[i][j] += arr[i][k]*arr2[k][j];
                    }
                }
            }

            for(i=0; i<m; i++){
                for(j=0; j<p; j++){
                    System.out.print(mul[i][j]+" ");
                }
                System.out.println("");
            }
        //}
    }
}
