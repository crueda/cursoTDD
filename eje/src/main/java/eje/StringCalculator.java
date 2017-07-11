package eje;

import java.util.regex.Pattern;

import org.hamcrest.Matcher;

public class StringCalculator {
	
	private IStringSplitter stringSplitter;
	
	public StringCalculator(IStringSplitter stringSplitter) {
		this.stringSplitter = stringSplitter;
	}
	
	public int add(String numbers) {

		if (numbers.isEmpty()) {
			return 0;			
		} 
		/*
		Pattern pattern = Pattern.compile("^\\/\\/(.)\\n(.*)$");
		String separator = ",";		
		Matcher matcher = pattern.matcher(numbers);		
		if (matcher.matches()) {
			separator = matcher.group(1);
			numbers = matcher.group(2);
		}*/
			
		String [] values;
		if (numbers.length()>3) {
			if (numbers.substring(0, 2).equals("//")) {
				String token = numbers.substring(2, 3);
				numbers = numbers.substring(3,numbers.length());
				values = numbers.split(",|\n|"+token);						
			} else {
				values = numbers.split(",|\n");			
			}
		} else {
			values = numbers.split(",|\n");		
		}

		if (values.length==1) {
				return Integer.parseInt(numbers);
		} else{
			int acc = 0;
			for (int i=0;i<values.length;i++) {
				if (!(values[i].equals("")))
					acc += Integer.parseInt(values[i]);
			}
			return acc;
		}
		
	}




}
