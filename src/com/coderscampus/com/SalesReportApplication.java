package com.coderscampus.com;

import java.io.IOException;

public class SalesReportApplication {

	public static void main(String[] args) throws IOException {

		ReportService reports = new ReportService();
		
		model3Reports(reports);
		modelSReports(reports);
		modelXReports(reports);
	}

	private static void model3Reports(ReportService reports) {
		System.out.println("model 3 Yearly Sales Report");
		System.out.println("---------------------");
		
		ReportService.yearlySalesReport(reports.model3, 2017);
		ReportService.yearlySalesReport(reports.model3, 2018);
		ReportService.yearlySalesReport(reports.model3, 2019);
		System.out.println();
		ReportService.maxSaleReport(reports.model3);
		ReportService.minSaleReport(reports.model3);
	}
	private static void modelSReports(ReportService reports) {
		System.out.println("model S Yearly Sales Report");
		System.out.println("---------------------");
		
		ReportService.yearlySalesReport(reports.modelS, 2016);
		ReportService.yearlySalesReport(reports.modelS, 2017);
		ReportService.yearlySalesReport(reports.modelS, 2018);
		ReportService.yearlySalesReport(reports.modelS, 2019);
		System.out.println();
		ReportService.maxSaleReport(reports.modelS);
		ReportService.minSaleReport(reports.modelS);
	}
	private static void modelXReports(ReportService reports) {
		System.out.println("model X Yearly Sales Report");
		System.out.println("---------------------");
		
		ReportService.yearlySalesReport(reports.modelX, 2016);
		ReportService.yearlySalesReport(reports.modelX, 2017);
		ReportService.yearlySalesReport(reports.modelX, 2018);
		ReportService.yearlySalesReport(reports.modelX, 2019);
		System.out.println();
		ReportService.maxSaleReport(reports.modelX);
		ReportService.minSaleReport(reports.modelX);
	}

}
