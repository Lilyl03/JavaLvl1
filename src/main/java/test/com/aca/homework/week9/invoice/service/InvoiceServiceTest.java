package com.aca.homework.week9.invoice.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.Arrays;

class InvoiceServiceTest {

   @Test
   public void testTotalAmountByTypeSAD() throws FileNotFoundException {
       long total = InvoiceService.totalAmountByType(InvoiceType.SAD);
        Assertions.assertEquals(45612345,total);
   }

   @Test
    public void testGetBySADType() throws FileNotFoundException {
       Invoice[] total = InvoiceService.getByType(InvoiceType.SAD);
       Assertions.assertEquals(123, Arrays.toString(total));
   }
    @Test
    public void testGetByMANType() throws FileNotFoundException {
        Invoice[] total = InvoiceService.getByType(InvoiceType.MAN);
        Assertions.assertEquals(123, Arrays.toString(total));
    }
    @Test
    public void getBySADTypeAndCode() throws FileNotFoundException {
        Invoice[] total = InvoiceService.getByTypeAndCode(InvoiceType.MAN, "MY-CODE");
        Assertions.assertEquals(123, Arrays.toString(total));
    }

}