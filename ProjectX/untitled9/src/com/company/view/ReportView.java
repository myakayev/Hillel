package com.company.view;

import com.company.dto.BuyingDto;
import com.company.dto.ReportDto;

public class ReportView {

    public static final String DESCRIPTION = "REPORT DATA: ";

    public void printDetails(ReportDto report) {
        int dash = 50;
        System.out.println("=".repeat(dash));
        System.out.println(DESCRIPTION + report.getName());
        System.out.println("=".repeat(dash));

        System.out.printf("%-20s %-15s %-1s  %n", "name", "count", "cost");
        System.out.println("=".repeat(dash));
        for (BuyingDto buyingDto : report.getData()) {
            String cost = Math.round(buyingDto.getSum()) + " uah";
            System.out.printf("%-20s %-15d %-1s %n", buyingDto.getName(), buyingDto.getCount(), cost);
            System.out.println("-".repeat(dash));
        }
        System.out.println("=".repeat(dash));
        System.out.println("Total sum: " + report.getTotalSum() + " uah");
    }


}
