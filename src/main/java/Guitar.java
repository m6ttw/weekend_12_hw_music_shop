import behaviours.IPlay;
import behaviours.ISell;
import instrument.Instrument;

public class Guitar extends Instrument implements IPlay {
    private int numOfStrings;
    private double scaleLength;
    private String bodyShape;

    public Guitar(String make, String model, int numOfStrings, double scaleLength, String bodyShape) {
        super(make, model);
        this.numOfStrings = numOfStrings;
        this.scaleLength = scaleLength;
        this.bodyShape = bodyShape;
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

    public String play(String instrument, String noise){
        return instrument + " is being played. " + noise;
    }
}
