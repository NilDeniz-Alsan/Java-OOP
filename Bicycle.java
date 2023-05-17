
class Bicycle implements Interface {
    private String bicycleModel;
    private double Kilometers;

	public Bicycle(String bicycleModel,double kilometers) {
        this.bicycleModel = bicycleModel;
        this.Kilometers = kilometers;
    }

    public String getBicycleModel() {
        return bicycleModel;
    }

    public double getCarbonFootprint() { // Carbon footprint of a bicycle is 0.15 kg co2 per kilometer
        return Kilometers * 0.15;
    }

	public float getCarbonelectricity() {
		return 0;
	}

}