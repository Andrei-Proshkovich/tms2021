package com.tms.model;

public enum CarType {

    HB("хэчбек"), SD("sedan"), UN("Universal"), CP("cupe"), SP("sportcar");


    String name;

    CarType(String name) {
        this.name = name;
    }
}
