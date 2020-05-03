package com.company;

public class Model {
    public String yearProducing;
    public String modelIphone;

    public String getYearProducing() {
        return yearProducing;
    }

    public String getModelIphone()
    {
        return modelIphone;
    }

    public Model(String yearProducing, String modelIphone) {
        this.yearProducing = yearProducing;
        this.modelIphone = modelIphone;
    }
}
