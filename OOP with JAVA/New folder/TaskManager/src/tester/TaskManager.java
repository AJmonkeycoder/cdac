package tester;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import app.com.core.Status;
import app.com.core.Task;
import customException.TaskException;
import utils.CustomOrdering;

import static utils.TaskValidation.validateTask;
import static utils.TaskValidation.parseAndValidateStatus;

public class TaskManager {
	public static void main(String[] args) throws TaskException{
		try(Scanner sc = new Scanner(System.in)){
			
			List<Task> taskList = new ArrayList();
			
			taskList.add(new Task("Make Project", "Create project decription"));
			taskList.add(new Task("Solve Assign", "Solve Java Day10-12 assignment"));
			taskList.add(new Task("Prepare", "Read DSA book"));
			
			boolean exit=false;
			
			while(!exit) {
				System.out.println("1-> Add new task\n"
						+ "2-> Delete a task\n"
						+ "3-> Update task status\n"
						+ "4-> Display all pending tasks\n"
						+ "5-> Display all tasks sorted by taskdate");
				try {
				switch(sc.nextInt()) {
					//Add new Task
					case 1 : 
						System.out.println("Enter Task Name and Task Description");
						Task newTask = new Task(sc.next(), sc.next());
						taskList.add(newTask);
						System.out.println("Task added succefully");
						break;
					
						// Remove Task
					case 2 :
						System.out.println(" Enter task id");
						Task rmTask = validateTask(sc.nextInt(), taskList);
						taskList.remove(rmTask);
						System.out.println("Task removed !!!");
						break;
						
					//Update task status
					case 3 :
						System.out.println(" Enter task id");
						Task upTask = validateTask(sc.nextInt(), taskList);
						System.out.println("Inprogress or completed");
						Status status = parseAndValidateStatus(sc.next());
						upTask.setStatus(status);
						break;
					//	Display all pending Task
					case 4 :
						for(Task t : taskList) {
							Status s = t.getStatus();
							if(s ==  Status.PENDING)
							System.out.println(t);
						}
						break;
						
					case 5 :
						Collections.sort(taskList, new CustomOrdering());
						for(Task t : taskList) {
							System.out.println(t);
						}
				}
				}catch(Exception e) {
					e.printStackTrace();
					sc.nextLine();
				
						
						
				}
			}
		}
	}
}
