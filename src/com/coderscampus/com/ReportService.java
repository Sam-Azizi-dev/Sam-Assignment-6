package com.coderscampus.com;

import java.io.IOException;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ReportService {
	FileService fileService = new FileService();

	List<Car> model3 = new ArrayList<>();
	List<Car> modelS = new ArrayList<>();
	List<Car> modelX = new ArrayList<>();
	
	public ReportService() throws IOException {
		model3 = fileService.exportExcelDataFile("model3.csv");
		modelS = fileService.exportExcelDataFile("modelS.csv");
		modelX = fileService.exportExcelDataFile("modelX.csv");
	}

	
	public static void yearlySalesReport(List<Car> cars, Integer year) {
		Optional<Integer> yearSum = Optional.of(cars.stream()
				.filter(yearReport -> yearReport.getYearMonth().getYear() == year).mapToInt(Car::getSale).sum());
		if (yearSum.isPresent()) {
			System.out.println(year + " -> " + yearSum.get());
		}

	}

	public static void maxSaleReport(List<Car> cars) {
		Optional<YearMonth> maxDate = cars.stream().max(Comparator.comparingInt(Car::getSale)).map(Car::getYearMonth);
		if (maxDate.isPresent()) {
			System.out.println("The best month for Model 3 was: " + maxDate.get());

		}
	}

	public static void minSaleReport(List<Car> cars) {
		Optional<YearMonth> maxDate = cars.stream().min(Comparator.comparingInt(Car::getSale)).map(Car::getYearMonth);
		if (maxDate.isPresent()) {
			System.out.println("The worst month for Model 3 was: " + maxDate.get());
			System.out.println();
		}
	}

}
