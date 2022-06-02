package com.company.controller;

import com.company.dto.ReportDto;
import com.company.dto.ReportDtoTop;
import com.company.model.Store;
import com.company.service.ReportService;
import com.company.service.ReportServiceTop;
import com.company.view.ReportView;
import com.company.view.ReportViewTop;

public class ReportController {

    public void execute(Store[] stores) {
        ReportService reportService = new ReportService(stores);
        ReportDto report = reportService.build();
        ReportView view = new ReportView();
        view.printDetails(report);
    }
    public void exeсuteTop (Store[] stores) {
        ReportServiceTop reportServiceTop = new ReportServiceTop(stores);
        ReportDtoTop report = reportServiceTop.buildTop5();
        ReportViewTop view = new ReportViewTop();
        view.printDetails(report);
    }
}
