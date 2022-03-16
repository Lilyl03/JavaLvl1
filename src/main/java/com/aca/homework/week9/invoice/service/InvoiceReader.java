package com.aca.homework.week9.invoice.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InvoiceReader {
    private static int noOfLines;
    private Invoice[] invoices;

    public static int size() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("C:\\Users\\LUser\\IdeaProjects\\JavaLvl1\\src\\main\\java\\com\\aca\\homework\\week9\\invoice\\service\\invoice.txt"));
        while (scanner.hasNextLine()) {
            scanner.nextLine();
            noOfLines++;
        }
        scanner.close();
        return noOfLines;
    }


    public Invoice[] read() throws FileNotFoundException {
        Scanner invoiceTxt = new Scanner(new File("C:\\Users\\LUser\\IdeaProjects\\JavaLvl1\\src\\main\\java\\com\\aca\\homework\\week9\\invoice\\service\\invoice.txt"));
        return initializeInvoiceArray(invoiceTxt);
    }

    public Invoice[] initializeInvoiceArray(Scanner invoiceTxt) throws FileNotFoundException {
        invoices = new Invoice[size()];
        invoiceTxt = new Scanner(new File("C:\\Users\\LUser\\IdeaProjects\\JavaLvl1\\src\\main\\java\\com\\aca\\homework\\week9\\invoice\\service\\invoice.txt"));
        for (int i = 0; i < noOfLines; i++) {
            String[] array = invoiceTxt.nextLine().split(",");
            invoices[i] = new Invoice(array[0], Long.parseLong(array[1]), array[2].equals("MAN") ? InvoiceType.MAN : InvoiceType.SAD, array[3]);
        }
        return invoices;
    }

}
