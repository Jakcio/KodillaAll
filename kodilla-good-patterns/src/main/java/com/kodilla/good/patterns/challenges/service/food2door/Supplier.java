package com.kodilla.good.patterns.challenges.service.food2door;

public class Supplier {

    String supplierName;
    int supplierPhoneNumber;
    String supplierMail;

    public Supplier(String supplierName, int supplierPhoneNumber, String supplierMail) {
        this.supplierName = supplierName;
        this.supplierPhoneNumber = supplierPhoneNumber;
        this.supplierMail = supplierMail;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public int getSupplierPhoneNumber() {
        return supplierPhoneNumber;
    }

    public String getSupplierMail() {
        return supplierMail;
    }
}
