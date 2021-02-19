import behaviours.IPlay;

public class Violin extends OrchestralInstrument implements IPlay {
    private String size;

    public Violin(String make, String model, String orchestralFamily, String size) {
        super(make, model, orchestralFamily);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public String play(String instrument){
        return instrument + " is being played, badly. ~SCREEEEEECH~";
    }
}
