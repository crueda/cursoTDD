package eje;

public class StringCalculator {

	public int add(String numbers) {

		if (numbers.isEmpty()) {
			return 0;			
		} 

		String [] values = numbers.split(",");

		if (values.length==1) {
				return Integer.parseInt(numbers);
		} else{
			int acc = 0;
			for (int i=0;i<values.length;i++) {
				acc += Integer.parseInt(values[i]);
			}
			return acc;
		}
		
	}




}
