package com.coderscampus.com;

import java.time.YearMonth;

public class Car {
	private YearMonth yearMonth;
	private Integer sale;

	public YearMonth getYearMonth() {
		return yearMonth;
	}

	public void setYearMonth(YearMonth yearMonth) {
		this.yearMonth = yearMonth;
	}

	public Integer getSale() {
		return sale;
	}

	public void setSale(Integer sale) {
		this.sale = sale;
	}

	@Override
	public String toString() {
		return "Car [yearMonth=" + yearMonth + ", sale=" + sale + "]";
	}

	public Car(YearMonth yearMonth, Integer sale) {
		this.yearMonth = yearMonth;
		this.sale = sale;
	}

}
