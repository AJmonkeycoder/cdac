package utils;

import java.util.List;

import app.com.core.Status;
import app.com.core.Task;
import customException.TaskException;

public class TaskValidation {
	public static Task validateTask(int id, List<Task> taskList) throws TaskException {
		Task t = new Task(id);
		int index = taskList.indexOf(t);
		if(index == -1) {
			new TaskException("Invalid Id");
		}
		
		return taskList.get(index) ;
		
	}
	
	public static Status parseAndValidateStatus(String status) throws IllegalArgumentException{
		return Status.valueOf(status.toUpperCase());
	}
}
