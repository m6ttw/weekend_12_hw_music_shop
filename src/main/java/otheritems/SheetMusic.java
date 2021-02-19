package otheritems;

public class SheetMusic {
    private String nameOfPiece;
    private String artistOrComposer;

    public SheetMusic(String nameOfPiece, String artistOrComposer) {
        this.artistOrComposer = artistOrComposer;
        this.nameOfPiece = nameOfPiece;
    }

    public String getArtistOrComposer() {
        return artistOrComposer;
    }

    public String getNameOfPiece() {
        return nameOfPiece;
    }

    public int calculateMarkup(int boughtPrice, int salePrice){
        return salePrice - boughtPrice;
    }
}
