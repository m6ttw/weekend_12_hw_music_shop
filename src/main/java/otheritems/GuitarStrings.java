package otheritems;

import behaviours.ISell;

public class GuitarStrings implements ISell {
    private String make;
    private int numStringsInPack;
    private int gauge;

    public GuitarStrings(String make, int numStringsInPack, int gauge) {
        this.make = make;
        this.numStringsInPack = numStringsInPack;
        this.gauge = gauge;
    }

    public String getMake() {
        return make;
    }

    public int getNumStringsInPack() {
        return numStringsInPack;
    }

    public int getGauge() {
        return gauge;
    }

    public int calculateMarkup(int boughtPrice, int salePrice){
        return salePrice - boughtPrice;
    }
}
