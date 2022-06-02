package com.company.dto;

public class StoreDto {

    private String name;
    private BuyingDto[] sells;
    private BuyingDtoTop[] buyingDtoTop;

    public StoreDto(String name, BuyingDto[] buyingDtoTop) {
        this.name = name;
        this.sells = buyingDtoTop;
    }

    public StoreDto(String name, BuyingDtoTop[] buyingDtoTop) {
        this.name = name;
        this.buyingDtoTop = buyingDtoTop;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSells(BuyingDto[] sells) {
        this.sells = sells;
    }

    public void setBuyingDtoTop(BuyingDtoTop[] buyingDtoTop) {
        this.buyingDtoTop = buyingDtoTop;
    }

    public BuyingDtoTop[] getBuyingDtoTop() {
        return buyingDtoTop;
    }

    public String getName() {
        return name;
    }

    public BuyingDto[] getSells() {
        return sells;
    }
}
