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

    public String play(String instrument){
        return instrument + " are being played. ~Dum dum kah dum duun duun doon doon duhn duhn duhn duhn~";
    }
}
