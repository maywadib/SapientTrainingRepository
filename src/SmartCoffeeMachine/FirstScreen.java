package SmartCoffeeMachine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class FirstScreen {

	public static void main(String[] args) throws IOException {

		Database db = new Database();

		try {
			db.createDatabase();
		} catch (Exception e) {

		}

		while(true) {

			// Scanner sc = new Scanner(System.in);
			BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

			
			System.out.println("Please Enter your LLID");
			String llid = sc.readLine();
			
			if (llid.equals("exit")) {
				System.exit(0);
			}
			
			// check llid in the database
			if (db.isUserPresent(llid)) {
				System.out.println("Please Enter your password");

				BufferedReader passInp = new BufferedReader(new InputStreamReader(System.in));
				String password = passInp.readLine();

				int count = 0;
				while(count<2)
				{
					if(db.checkPassword(llid, password))
						break;
					else {
						System.out.println("Please enter again");
						password = sc.readLine();
					}
					count++;
				}
				
				if(count==3)
				{
					System.out.println("Incorrect password for three times");
				}
				
			} else {
				System.out.println("User not found...Please Sign up");

				System.out.println("Your user LLID is " + llid + "\nPlease enter new password");
				String password = sc.readLine();

				db.signUp(llid, password);

			}
		}

	}
}
