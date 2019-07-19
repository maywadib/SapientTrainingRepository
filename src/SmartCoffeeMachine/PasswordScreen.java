package SmartCoffeeMachine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PasswordScreen {

	public void showPasswordScreen() throws IOException
	{
		System.out.println("Please Enter your password");
		

		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in)) ;
		String llid = sc.readLine();
		
	}
}
