package com.yjf.entity;

/**
 * @author 余俊锋
 * @date 2020/10/9 11:48
 * @Description
 */
public class Address {

    private Integer addressId;
    private String addressName;
    private String addressCity;

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }
}
