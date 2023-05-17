
class Building implements Interface {
    private String building;
    private double energyConsumption;
    private double electricity;

    public Building(String building, double energyConsumption,double electricity) {
        this.building = building;
        this.energyConsumption = energyConsumption; //
        this.electricity = electricity; // kwatt
    }

    public double getElectricity() {
		return electricity;
	}

	public String getBuilding() {
        return building;
    }

    public double getEnergyConsumption() {
        return energyConsumption;
    }
    
// Calculate carbon footprint based on energy consumption
    
    public double getCarbonFootprint() { 
    	
    	return energyConsumption * 0.85; // Arbitrary calculation for demonstration purposes
    }
    public float getCarbonelectricity() { 
    	
    	return (float) (electricity * 0.98);  
    }
}

