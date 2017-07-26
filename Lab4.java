
package lab4;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Lab4 {

    public static void main(String[] args) {
        Vector users = new Vector();

        users.addElement(new User("Abbas", "coolbeans", "client"));
        users.addElement(new User("Fahad", "awesomepossum", "client"));
        users.addElement(new User("Fahad", "ihatemyjob", "manager"));
        boolean x=true;

        while(x){
            System.out.println("Hello, welcome to Foodway!");
            System.out.println("Please select an option: ");
            System.out.println("1. New User 2. Registered User");
            Scanner sc = new Scanner(System.in);
            int m = sc.nextInt();
            if(m==1){
                //registration process
            }
            else if(m==2){
                //menu
            }
            else{
                System.out.println("Please select a valid option.");
            }
        }
    }
}
