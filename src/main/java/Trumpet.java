public class Trumpet {
    private String make;
    private String model;
    private String key;

    public Trumpet(String make, String model, String key){
        this.make = make;
        this.model = model;
        this.key = key;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getKey() {
        return key;
    }

    public String play(String instrument){
        return instrument + " is being played. ~Toot toot~";
    }
}
