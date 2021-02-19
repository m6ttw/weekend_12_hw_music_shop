import behaviours.IPlay;

public class Trumpet extends OrchestralInstrument implements IPlay {
    private String key;

    public Trumpet(String make, String model, String orchestralFamily, String key){
        super(make, model, orchestralFamily);
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public String play(String instrument){
        return instrument + " is being played. ~Toot toot~";
    }
}
