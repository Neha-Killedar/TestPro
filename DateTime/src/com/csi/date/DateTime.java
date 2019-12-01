package com.csi.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class DateTime {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf= new SimpleDateFormat("dd-MMMM-yyyy");
		Date dob= sdf.parse("08-July-1997");
		String emdob=sdf.format(dob);
		System.out.println("BirthDate: "+emdob);
		System.out.println("Hello");
		
	}
}
