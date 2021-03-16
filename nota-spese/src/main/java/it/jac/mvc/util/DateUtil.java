package it.jac.mvc.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	private static SimpleDateFormat sdf_day = new SimpleDateFormat("dd/MM/yyyy");
	private static SimpleDateFormat sdf_dayTime = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	public static String formatDateSQL(Date data) {
		
		if (data == null) {
			return "";
		}
		return sdf_dayTime.format(data);
	}
}
