package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2016, 5, 19, 23, 59, 30);
		Date date = cal.getTime();
		SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(formateur.format(date));
		Calendar cal2 = Calendar.getInstance();
		Date date2 = cal2.getTime();
		SimpleDateFormat formateur2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println(formateur2.format(date2));
		SimpleDateFormat formateur3 = new SimpleDateFormat("yyyy/MMMM/EEEE HH:mm:ss",Locale.FRANCE);
		System.out.println(formateur3.format(date2));
		SimpleDateFormat formateur4 = new SimpleDateFormat("yyyy/MMMM/EEEE HH:mm:ss",Locale.CHINESE);
		System.out.println(formateur4.format(date2));
		SimpleDateFormat formateur5 = new SimpleDateFormat("yyyy/MMMM/EEEE HH:mm:ss",Locale.GERMANY);
		System.out.println(formateur5.format(date2));
		SimpleDateFormat formateur6 = new SimpleDateFormat("yyyy/MMMM/EEEE HH:mm:ss",new Locale("ru"));
		System.out.println(formateur6.format(date2));

	}

}
