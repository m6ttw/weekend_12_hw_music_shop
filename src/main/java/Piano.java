import behaviours.IPlay;

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

    public String play(String instrument){
        return instrument + " is being played. ~Dun dun dun~";
    }
}
