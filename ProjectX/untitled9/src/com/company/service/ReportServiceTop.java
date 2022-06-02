package com.company.service;

import com.company.dto.BuyingDtoTop;
import com.company.dto.ReportDtoTop;
import com.company.dto.StoreDto;
import com.company.model.Store;
import com.company.model.product.Buying;

import java.util.Arrays;

public class ReportServiceTop {
    public static final String SUMMARY_REPORT = "Top 5 sales";

    private Store[] stores;

    public ReportServiceTop(Store[] stores) {
        this.stores = stores;
    }

    public ReportDtoTop buildTop5() {
        StoreDto[] storeDtos = mapStores();
        BuyingDtoTop[] buyingDtosTop = topFiveSales(storeDtos);

        //write something
        return new ReportDtoTop(SUMMARY_REPORT, buyingDtosTop);
    }

    private BuyingDtoTop[] topFiveSales(StoreDto[] storeDtos) {
        int count = getCount(storeDtos);
        BuyingDtoTop[] totalArr = new BuyingDtoTop[count];
        int i = 0;
        for (StoreDto storeDto : storeDtos) {
            for (BuyingDtoTop sell : storeDto.getBuyingDtoTop()) {
                totalArr[i++] = sell;
            }
        }
        for (int k = 0; k < totalArr.length; k++) {

            int min = totalArr[k].getCount();
            int min_i = k;
            BuyingDtoTop min_el = totalArr[k];

            for (int j = k + 1; j < totalArr.length; j++) {
                //Если находим, запоминаем его индекс
                if (totalArr[j].getCount() < min) {
                    min = totalArr[j].getCount();
                    min_i = j;
                    min_el = totalArr[j];
                }
            }
                   if (k != min_i) {
                BuyingDtoTop tmp = totalArr[k];
                totalArr[k] = totalArr[min_i];
                totalArr[min_i] = tmp;
            }
        }
        BuyingDtoTop[] reverse = new BuyingDtoTop[totalArr.length];
        for (int l = totalArr.length - 1; l > 0; ) {
            for (int j = 0; j < totalArr.length; j++) {
                reverse[j] = totalArr[l];
                l--;
            }
        }
        BuyingDtoTop[] finalArr = new BuyingDtoTop[5];
        for (int j = 0; j < 5; j++) {
            finalArr[j] = reverse[j];
        }
        return finalArr;
    }

    private int getCount(StoreDto[] storeDtos) {
        int count = 0;
        for (StoreDto storeDto : storeDtos) {
            count += storeDto.getBuyingDtoTop().length;
        }
        return count;
    }

    private StoreDto[] mapStores() {
        StoreDto[] array = new StoreDto[stores.length];
        for (int i = 0; i < array.length; i++) {
            Store store = stores[i];
            String name = store.getName();
            BuyingDtoTop[] buyingDtosTop = new BuyingDtoTop[store.getSales().length];
            for (int j = 0; j < store.getSales().length; j++) {
                Buying sale = store.getSales()[j];
                double sum = sale.getProduct().getCost() * sale.getCount();
                buyingDtosTop[j] = new BuyingDtoTop(sale.getProduct().getName(), sale.getCount());
            }
            array[i] = new StoreDto(name, buyingDtosTop);
        }
        return array;
    }
}
