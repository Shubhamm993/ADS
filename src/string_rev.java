import java.util.*;
public class string_rev {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String  str = scan.nextLine();
        int count=0;
        String [] words = str.split("\\s+");
        for(String ele:words){
            String str2 = "";
            for(int i=ele.length()-1; i>=0; i--){
                str2 += (char)(ele.charAt(i));
            }
            System.out.print(str2+" ");
            if(ele.equals(str2)){
                count++;
            }
        }
        System.out.println(count);
    }
}
