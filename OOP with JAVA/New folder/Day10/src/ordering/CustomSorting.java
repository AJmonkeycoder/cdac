package ordering;

import java.util.Comparator;
import com.app.core.*;

public class CustomSorting implements Comparator<Customer> {

	
	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		if(o1.getDob().isBefore(o2.getDob()))
			return -1;
		if(o1.getDob().isAfter(o2.getDob()))
			return 1;
		
		return 0;
	}

}
