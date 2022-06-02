package com.company.view;

import com.company.dto.BuyingDtoTop;
import com.company.dto.ReportDtoTop;

public class ReportViewTop {
    public static final String DESCRIPTION = "REPORT DATA: ";

    public void printDetails(ReportDtoTop report) {
        int dash = 27;
        System.out.println("=".repeat(dash));
        System.out.println(DESCRIPTION + report.getName());
        System.out.println("=".repeat(dash));

        System.out.printf("%-20s %-15s   %n", "name", "count");
        System.out.println("=".repeat(dash));
        for (BuyingDtoTop buyingDtoTop : report.getData()) {
            System.out.printf("%-20s %-15d %n", buyingDtoTop.getName(), buyingDtoTop.getCount());
            System.out.println("-".repeat(dash));
        }
        System.out.println("=".repeat(dash));
    }

}
