package otheritems;

import behaviours.ISell;

public class GuitarStrings implements ISell {
    private int numStringsInPack;
    private int gauge;

    public GuitarStrings(int numStringsInPack, int gauge) {
        this.numStringsInPack = numStringsInPack;
        this.gauge = gauge;
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
