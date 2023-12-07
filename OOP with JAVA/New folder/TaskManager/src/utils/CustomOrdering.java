package utils;

import java.util.Comparator;

import app.com.core.Task;

public class CustomOrdering implements Comparator<Task> {
	public int compare(Task t1, Task t2) {
		if(t1.getTaskDate().isBefore(t2.getTaskDate())) return -1;
		if(t1.getTaskDate().isAfter(t2.getTaskDate())) return 1;
		
		return 0;
		
	}
}
