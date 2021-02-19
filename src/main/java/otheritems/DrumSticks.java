package otheritems;

public class DrumSticks {
    private String make;

    public DrumSticks(String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }

    public int calculateMarkup(int boughtPrice, int salePrice){
        return salePrice - boughtPrice;
    }
}
