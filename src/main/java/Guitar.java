import behaviours.IPlay;

public class Guitar implements IPlay {
    private String make;
    private String model;
    private int numOfStrings;
    private double scaleLength;
    private String bodyShape;

    public Guitar(String make, String model, int numOfStrings, double scaleLength, String bodyShape) {
        this.make = make;
        this.model = model;
        this.numOfStrings = numOfStrings;
        this.scaleLength = scaleLength;
        this.bodyShape = bodyShape;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getNumOfStrings() {
        return numOfStrings;
    }

    public double getScaleLength() {
        return scaleLength;
    }

    public String getBodyShape() {
        return bodyShape;
    }

    public String play(String instrument){
        return instrument + " is being played. Bring bring";
    }
}
