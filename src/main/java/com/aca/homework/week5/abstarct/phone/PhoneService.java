package com.aca.homework.week5.abstarct.phone;

public class PhoneService extends AbstractPhoneService{
    private final Phone[] phones = new Phone[4];
    private int size;
    @Override
    Phone create(String IMEI, Model model) {
        Phone phone = new Phone(IMEI,model);
        phones[size] = phone;
        size++;
        return phone;
    }

    @Override
    Phone getByImei(String imei) {
        for (int i = 0; i < phones.length; i++) {
            if(imei.equals(phones[i].getIMEI())){
                return phones[i];
            }
        }
        return null;
    }
}
