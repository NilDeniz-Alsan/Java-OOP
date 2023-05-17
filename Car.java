class Car implements Interface {
    private String carModel;
    private double fuelConsumption;

    public Car(String carModel, double fuelConsumption) {
        this.carModel = carModel;
        this.fuelConsumption = fuelConsumption;
    }

    public String getCarModel() {
        return carModel;
    }

    public double getFuelConsumption() {
        return 0;
    }

	public double getCarbonFootprint() {
		return fuelConsumption* 2.3;
	}
	public float getCarbonelectricity() {
		// TODO Auto-generated method stub
		return 0;
	}

}