import behaviours.IPlay;

public class Clarinet implements IPlay {
    private String make;
    private String model;
    private String typeOfWood;
    private String key;

    public Clarinet(String make, String model, String typeOfWood, String key) {
        this.make = make;
        this.model = model;
        this.typeOfWood = typeOfWood;
        this.key = key;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getTypeOfWood() {
        return typeOfWood;
    }

    public String getKey() {
        return key;
    }

    public String play(String instrument){
        return instrument + " is being played. ~Woo woo~";
    }
}
