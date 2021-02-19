import behaviours.IPlay;

public class Violin implements IPlay {
    private String make;
    private String model;
    private String size;

    public Violin(String make, String model, String size) {
        this.make = make;
        this.model = model;
        this.size = size;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getSize() {
        return size;
    }

    public String play(String instrument){
        return instrument + " is being played, badly. ~SCREEEEEECH~";
    }
}
