package orchestralinstruments;

import instrument.Instrument;

public abstract class OrchestralInstrument extends Instrument{
    private String orchestralFamily;

    public OrchestralInstrument(String make, String model, String orchestralFamily) {
        super(make, model);
        this.orchestralFamily = orchestralFamily;
    }

    public String getOrchestralFamily() {
        return orchestralFamily;
    }
}
