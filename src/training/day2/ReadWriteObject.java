package training.day2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReadWriteObject {

	public static void storeAccount(Account account) throws FileNotFoundException, IOException {

		File file = new File("account.ser");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));

		oos.writeObject(account);
		oos.writeInt(111);
		oos.writeDouble(2222.3);
		oos.writeObject("heloooooooooo");

		oos.close();

		System.out.println("data written successfully...");
	}

	public static Account getAccount() throws FileNotFoundException, IOException, ClassNotFoundException {
		
		File file = new File("account.ser");
		ObjectInputStream ois =new ObjectInputStream(new FileInputStream(file));
		
		 Account account = (Account) ois.readObject();
		 System.out.println(ois.readInt());
		 System.out.println(ois.readDouble());
		return account;

	}

	public static void main(String[] args) {
		Account account = new Account("MAYUR", 232);
		try {
			storeAccount(account);
			Account account1 = getAccount();
			System.out.println(account1);
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
