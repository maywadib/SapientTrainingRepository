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
			// database connection.

			
		} catch (Exception e) {

		}

		// Scanner sc = new Scanner(System.in);
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Please Enter your LLID");
		String llid = sc.readLine();

		// check llid in the database

		System.out.println(db.checkUser(llid));
	}
}
