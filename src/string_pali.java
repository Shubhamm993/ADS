import java.util.Scanner;
// Other imports go here// Do NOT change the class name
class string_pali
{
    public static void main(String[] args)
    {
        // Write your code here
        int n,i;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int [] arr = new int[n];
        for(i=0; i<n; i++){
            arr[i]= scan.nextInt();
        }
        for(i=0; i<n; i++){
            int rem=0,rev=0,num=0;
            while(arr[i]>0){
                num=arr[i];
                rem = arr[i]%10;
                rev = (rem*10)+rem;
                arr[i] = arr[i]/10;
            }
            if(rev==num) System.out.println("Equal");
            else System.out.println("Not Equal");
        }
    }
}