package com.aca.homework.week9.invoice.service;

public class Invoice {
    private String id;
    private long amount;
    private InvoiceType type;
    private String code;

    public Invoice(String id, long amount, InvoiceType type, String code) {
        this.id = id;
        this.amount = amount;
        this.type = type;
        this.code = code;
    }

    public String getId() {
        return id;
    }

    public long getAmount() {
        return amount;
    }

    public InvoiceType getType() {
        return type;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "id='" + id + '\'' +
                ", amount=" + amount +
                ", type=" + type +
                ", code='" + code;
    }
}
