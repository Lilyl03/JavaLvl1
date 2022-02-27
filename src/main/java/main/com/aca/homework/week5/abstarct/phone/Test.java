package com.aca.homework.week5.abstarct.phone;

public class Test {
    public static void main(String[] args) {
        PhoneService phoneService = new PhoneService();
        Phone phone1 = phoneService.create( "351978946541895", Model.SAMSUNG);
        Phone phone2 = phoneService.create( "45678974132187", Model.IPHONE);
        Phone phone3 = phoneService.create( "04894100487866", Model.IPHONE);
        Phone phone4 = phoneService.create( "99987741084444", Model.NOKIA);
        System.out.println(phoneService.getByImei("04894100487866"));
    }
}
