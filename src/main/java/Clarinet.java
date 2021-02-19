import behaviours.IPlay;

public class Clarinet extends OrchestralInstrument implements IPlay {
    private String typeOfWood;
    private String key;

    public Clarinet(String make, String model, String typeOfWood, String key) {
        super(make, model);
        this.typeOfWood = typeOfWood;
        this.key = key;
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
