package eje;


public class StringSplitter implements IStringCalculator, IStringSplitter {

	/* (non-Javadoc)
	 * @see eje.IStringCalculator#parse(java.lang.String)
	 */
	/* (non-Javadoc)
	 * @see eje.IStringSplitter#parse(java.lang.String)
	 */
	public String[] parse(String numbers) {

		if (numbers.isEmpty()) {
			return new String[0];			
		} 
				
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
			String[] out = new String[1];
			out[0] = numbers;
			return out;
		} else{
			return values;
		}
		
	}




}
