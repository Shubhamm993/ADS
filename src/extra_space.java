import java.util.*;
public class extra_space {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String [] words = str.split("\\s+");
        for(String ele:words){
            String res = "";
            int n = ele.length()-1;
            if (!ele.isEmpty()){
                res += ele+" ";
            }
            System.out.print(res.trim());
        }
    }
}
