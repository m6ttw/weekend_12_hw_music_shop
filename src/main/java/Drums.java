import behaviours.IPlay;

public class Drums implements IPlay {
    private String make;
    private String model;
    private int numOfPieces;

    public Drums(String make, String model, int numOfPieces) {
        this.make = make;
        this.model = model;
        this.numOfPieces = numOfPieces;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getNumOfPieces() {
        return numOfPieces;
    }

    public String play(String instrument){
        return instrument + " are being played. ~Dum dum kah dum duun duun doon doon duhn duhn duhn duhn~";
    }
}
