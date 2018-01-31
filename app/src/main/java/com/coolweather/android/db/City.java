package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 001 on 2018/1/31.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int provinceId;
    private int CityCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCityCode() {
        return CityCode;
    }

    public void setCityCode(int cityCode) {
        CityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

}
