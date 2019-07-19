package training.day3;

class Customer {

	
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	private String customerName;
	private String email;

}

public class UserDefinedException {
	public static void main(String[] args) {
		
		Customer cust = new Customer();
		cust.setCustomerName("MA");
		cust.setEmail("mayur.cbg@gmail.com");
		
		
		int amount = 100;
		try {
			performTransactio(cust,amount);
		} catch (NameTooSmallException ne) {
			System.out.println("Name too small caught");
			//ne.getMessage();
		}catch(amountTooLessException ae){
			System.out.println("amount to small exaception");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void  performTransactio(Customer cust, int amount) throws Exception {
		
		try {
			checkName(cust.getCustomerName());
		} catch (NameTooSmallException e) {
			throw new Exception("Sorry it was not performed",e);
			//e.printStackTrace();    ///should not tracwe here it should again throw an exception
		}
		
		if(amount>100) {
			throw new amountTooLessException();
		}
		}
	
	public static void checkName(String name) throws NameTooSmallException{
		
		if(name.length()<3) {
			throw new NameTooSmallException("sorry cannot perform transaction because name  "+ name + " too small ");
		}
		
	}
}
