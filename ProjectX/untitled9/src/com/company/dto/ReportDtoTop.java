package com.company.dto;

public class ReportDtoTop {
    private String name;
    private BuyingDtoTop[] data;


    public ReportDtoTop(String name, BuyingDtoTop[] data) {
        this.name = name;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public BuyingDtoTop[] getData() {
        return data;
    }
}

