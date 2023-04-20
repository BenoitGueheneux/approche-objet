package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
		Date date = new Date(123,3,19);
		SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(formateur.format(date));
		Date date2 = new Date(116,4,19,23,59,30);
		SimpleDateFormat formateur2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println(formateur2.format(date2));
		Date date3 = new Date();
		SimpleDateFormat formateur3 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println(formateur3.format(date3));

	}

}
