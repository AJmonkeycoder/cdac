package exception_handling;

import java.util.Scanner;

import custom_exceptions.SpeedOutOfRangeException;
import utils.VehicleValidationRules;
import static utils.VehicleValidationRules.validateSpeed;
import static utils.VehicleValidationRules.validateLicense;

public class TestSpeed {

	public static void main(String[] args) /* throws SpeedOutOfRangeException */ {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter curnt speed");
			// invoke a static method for speed validation.
			validateSpeed(sc.nextInt());
			System.out.println("Enter License expiry date");
			validateLicense(sc.next());
			System.out.println("end of try...");
		} // JVM : sc.close()
		catch (SpeedOutOfRangeException e) {
		//	System.out.println(e.getMessage());
			e.printStackTrace();
		}
		

	}

}
