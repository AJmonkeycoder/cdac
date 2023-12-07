package utils;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import custom_exceptions.SpeedOutOfRangeException;

public class VehicleValidationRules {
	// declare static constants : speed range
	public static final int MIN_SPEED;
	public static final int MAX_SPEED;
	static {
		MIN_SPEED=40;
		MAX_SPEED=80;
	}

//add a static method for speed validation
	public static void validateSpeed(int speed) throws SpeedOutOfRangeException{
		if(speed < MIN_SPEED)
			throw new SpeedOutOfRangeException("Speed too slow");
		if(speed > MAX_SPEED)
			throw new SpeedOutOfRangeException("Speed too fast , FATAL!!!!!!");
		System.out.println("speed within range....");
	}
	
	public static void validateLicense(String ds) throws SpeedOutOfRangeException{
		  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	        LocalDate date = LocalDate.parse(ds, formatter);	
	        if(date.isAfter(LocalDate.now())){
			throw new SpeedOutOfRangeException("Invalid License");
		}else {
			System.out.println("Valid License");
		}
	}
}
