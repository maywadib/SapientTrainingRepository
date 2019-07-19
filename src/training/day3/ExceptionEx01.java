package training.day3;

public class ExceptionEx01 {

	public static void main(String[] args) {

		try {
			int[] arr = new int[-1];
		} catch (NegativeArraySizeException e) {

			try {
				int num1 = Integer.parseInt(args[0]);
				int num2 = Integer.parseInt(args[1]);
				
				System.out.println("result " + num1 / num2);
			} catch (ArithmeticException ae) {
				System.out.println(ae);
			} catch (NumberFormatException nfe) {
				
			}
	
		}finally{
			System.out.println("closed connectiom");

		}

		System.out.println("blah blah things");
	}
}
