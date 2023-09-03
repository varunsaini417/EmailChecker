import java.util.*;
import java.lang.*;

public class EmailChecker {

    public static void main(String[] args) {
        String str = null;
        System.out.println("Enter the gmail to be checked");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        
        System.out.println("This email is about to verify: "+ str);
        int i = str.indexOf("@");
        String uName = str.substring(0, i);
        String domain = str.substring(i+1, str.length());
        System.out.println("The username is: "+ uName);
        System.out.println("And the domain is : "+ domain);
        System.out.println(domain.startsWith("gmail"));
    }
    
}
