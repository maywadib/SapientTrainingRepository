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

		while (true) {

			// Scanner sc = new Scanner(System.in);
			BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Please Enter your LLID");
			String llid = sc.readLine();

			if (llid.equals("exit")) {
				System.exit(0);
			}

			int flag = 0;
			// check llid in the database
			if (db.isUserPresent(llid)) {
				System.out.println("Please Enter your password");

				BufferedReader passInp = new BufferedReader(new InputStreamReader(System.in));
				String password = passInp.readLine();

				int count = 0;
				while (count < 2) {
					if (db.checkPassword(llid, password)) {

						flag =1;
						break;
					} else {
						System.out.println("Please enter again");
						password = sc.readLine();
					}
					count++;
				}

				if (count == 2) {
					System.out.println("Incorrect password for three times");
				}

			} else {
				System.out.println("User not found...Please Sign up");

				System.out.println("Your user LLID is " + llid + "\nPlease enter new password");
				String password = sc.readLine();

				db.signUp(llid, password);
				
				flag = 1;

			}
			
			
			
			
			if(flag==1)
			{
				Coffee.dispalyOptions();
				int option = Integer.parseInt(sc.readLine());

				switch (option) {
				case 1: {
					Coffee cap = new Cappuccino();
					Coffee.coffCounter.put("cappuccino",Coffee.coffCounter.get("cappuccino")+1);
					cap.display();
					break;
				}
				case 2: {
					
					Coffee esp = new Espresso();
					Coffee.coffCounter.put("espresso",Coffee.coffCounter.get("espresso")+1);
					esp.display();

					break;
				}
				case 3: {
					
					Coffee lat = new Lattee();
					Coffee.coffCounter.put("latte",Coffee.coffCounter.get("latte")+1);
					lat.display();
					break;
				}
				case 4: {
					
					System.out.println("Work in Progress , Sorry for the inconvience: ");
//					Coffee yc = new YourChoice(
//							);
//					yc.display();
					break;
				}
				case 5: {

					System.out.println(Coffee.getPopularCoffeeOption());
					System.out.println("Thank You for using the Smart Coffee Machine...\n");
					break;
				}
				default:
					System.out.println("Wrong Option");
				}

			}
			
			
			
			
		System.out.println("Current coffee count for all the available option : " +Coffee.coffCounter);
		}
		
	}
}
