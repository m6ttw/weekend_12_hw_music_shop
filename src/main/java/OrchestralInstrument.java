public abstract class OrchestralInstrument {
    private String make;
    private String model;

    public OrchestralInstrument(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
}
