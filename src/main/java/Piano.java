import behaviours.IPlay;
import instrument.Instrument;

public class Piano extends Instrument implements IPlay {
    private String keyMaterial;
    private String size;

    public Piano(String make, String model, String keyMaterial, String size) {
        super(make, model);
        this.keyMaterial = keyMaterial;
        this.size = size;
    }

    public String getKeyMaterial() {
        return keyMaterial;
    }

    public String getSize() {
        return size;
    }

    public String play(String instrument, String noise){
        return instrument + " is being played. " + noise;
    }
}
