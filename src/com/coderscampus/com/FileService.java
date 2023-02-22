package com.coderscampus.com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class FileService {

	public List<Car> exportExcelDataFile(String filename) throws IOException {
		List<Car> cars = new ArrayList<>();
		BufferedReader fileReader;
		fileReader = new BufferedReader(new FileReader(filename));
		fileReader.readLine();
		String line = null;
		while ((line = fileReader.readLine()) != null) {
			String[] yearAndSale = line.split(",");
			YearMonth yearMonth = YearMonth.parse(yearAndSale[0], DateTimeFormatter.ofPattern("MMM-yy", Locale.US));
			Car car = new Car(yearMonth, Integer.parseInt(yearAndSale[1]));
			cars.add(car);
		}
		fileReader.close();
		return cars;
	}

}
