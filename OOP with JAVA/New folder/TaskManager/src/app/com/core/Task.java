package app.com.core;

import java.time.LocalDate;

public class Task {
	
	private int taskId;
	private String taskName;
	private String discription;
	private LocalDate taskDate;
	private Status status1;
	private boolean active;
	
	private static int idGenerator=1;
	
	//parametrized constructor 
	public Task(String taskName, String discription) {
		super();
		taskId=idGenerator++;
		this.taskName = taskName;
		this.discription = discription;
		this.taskDate = LocalDate.now();
		this.status1= Status.PENDING;
		this.active = false;
	}
	
	public Task(int id) {
		super();
		taskId = id;
	}
	
	public String toString() {
		return "TaskId : "+taskId+" Task Name : "+taskName+" Discription : "+discription+" TaskDate : "+taskDate+" Status : "+status1+" Active : "+active;
	}
	
	public Status getStatus() {
		return status1;
	}

	public void setStatus(Status status) {
		this.status1 = status;
	}

	public LocalDate getTaskDate() {
		return taskDate;
	}

	public void setTaskDate(LocalDate taskDate) {
		this.taskDate = taskDate;
	}

	public Status getStatus1() {
		return status1;
	}

	public void setStatus1(Status status1) {
		this.status1 = status1;
	}

	public boolean equals(Object o) {
		if(o instanceof Task) {
			Task newTask = (Task) o;
			return this.taskId==(newTask.taskId);
		}
		return true;
	}
	
	
}
