package data;

import java.util.Map;
import ognl.DefaultTypeConverter;
import com.opensymphony.xwork2.conversion.TypeConversionException;

public class MyDateConverter extends DefaultTypeConverter {
	public Object convertValue(Map context, Object value, Class toType) {
		try {
			// value parameter is passed as array, so we need to parse it first
			// in String array
			String[] s = (String[]) value;
			String finalValue = s[0];
			System.out.println("final value "+finalValue);
			String values[] = finalValue.split("/");
			java.util.Calendar c = java.util.Calendar.getInstance();
			int day = Integer.parseInt(values[0]);
			int month = Integer.parseInt(values[1]);
			int year = Integer.parseInt(values[2]);
			System.out.println(day+"/"+month+"/"+year);
		
			if (day < 1 || day > 31 || month < 1 || month > 12 || year < 1000|| year > 9999){
				throw new java.lang.IllegalArgumentException("one of value is out of rang.");
			}
			c.set(year, month-1, day);
			System.out.println(c.getTime());
			return c.getTime();
		} catch (Exception e) {
			System.out.println("Error : " + e);
			throw new TypeConversionException("Invalid conversion of date");
		}
	}
}
