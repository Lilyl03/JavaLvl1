package com.aca.homework.week9.invoice.service;

import java.io.FileNotFoundException;

public class InvoiceService {
    public static Invoice[] load() throws FileNotFoundException {
        return new InvoiceReader().read();
    }

    public static long totalAmountByType(InvoiceType type) throws FileNotFoundException {
        Invoice[] invoices = load();
        long total = 0;
        for (int i = 0; i < invoices.length; i++) {
            if (invoices[i].getType() == type) {
                total += invoices[i].getAmount();
            }
        }
        return total;
    }

    public static Invoice[] getByType(InvoiceType type) throws FileNotFoundException {
        Invoice[] invoices = load();
        int length = 0;
        for (int i = 0; i < invoices.length; i++) {
            if (invoices[i].getType() == type) length++;
        }
        Invoice[] invoicesByType = new Invoice[length];
        for (int i = 0, k = 0; i < length; i++) {
            if (invoices[i].getType() == type) {
                invoicesByType[k] = invoices[i];
                k++;
            }
        }
        return invoicesByType;
    }

    public static Invoice[] getByTypeAndCode(InvoiceType type, String code) throws FileNotFoundException {
        Invoice[] invoicesByType = getByType(type);
        int length = 0;
        for (int i = 0; i < invoicesByType.length; i++) {
            if (invoicesByType[i].getCode().equals(code)) length++;
        }
        Invoice[] invoicesByTypeAndCode = new Invoice[length];
        for (int i = 0, k = 0; i < length; i++) {
            if (invoicesByType[i].getCode().equals(code)) {
                invoicesByTypeAndCode[k] = invoicesByType[i];
            }
        }
        return invoicesByTypeAndCode;
    }
}
