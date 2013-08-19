package data;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import ognl.DefaultTypeConverter;
import com.opensymphony.xwork2.conversion.TypeConversionException;

public class MyDateConverter2 extends DefaultTypeConverter {
	public Object convertValue(Map context, Object value, Class toType) {
		try {
			// value parameter is passed as array, so we need to parse it first
			// in String array
			String[] s = (String[]) value;
			String finalValue = s[0];
			//in-built facilty to deal with date format
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			Date date = df.parse(finalValue);
			System.out.println("Today = " + df.format(date));
			return date;
		} catch (Exception e) {
			System.out.println("Error : " + e);
			throw new TypeConversionException("Invalid conversion of date");
		}
	}
}
