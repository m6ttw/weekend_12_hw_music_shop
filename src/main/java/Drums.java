import behaviours.IPlay;

public class Drums extends Instrument implements IPlay {
    private int numOfPieces;

    public Drums(String make, String model, int numOfPieces) {
        super(make, model);
        this.numOfPieces = numOfPieces;
    }

    public int getNumOfPieces() {
        return numOfPieces;
    }

    public String play(String instrument, String noise){
        return instrument + " are being played. " + noise;
    }
}
