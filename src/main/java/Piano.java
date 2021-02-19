import behaviours.IPlay;

public class Piano implements IPlay {
    private String make;
    private String model;
    private String keyMaterial;
    private String size;

    public Piano(String make, String model, String keyMaterial, String size) {
        this.make = make;
        this.model = model;
        this.keyMaterial = keyMaterial;
        this.size = size;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
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
