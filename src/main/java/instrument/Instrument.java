package instrument;

import behaviours.ISell;

public abstract class Instrument implements ISell {
    private final String make;
    private final String model;

    public Instrument(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int calculateMarkup(int boughtPrice, int salePrice){
        return salePrice - boughtPrice;
    }
}
