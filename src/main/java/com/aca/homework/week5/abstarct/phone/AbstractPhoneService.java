package com.aca.homework.week5.abstarct.phone;

public abstract class AbstractPhoneService {
    abstract Phone create(String IMEI, Model model);
    abstract Phone getByImei(String imei);
}
