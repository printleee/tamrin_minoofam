public class House {
    private int initialHouseCost,annualEnergyCost;
    private double tax;
    public House(int initialHouseCost,int annualEnergyCost,double tax){
        this.initialHouseCost = initialHouseCost;
        this.annualEnergyCost = annualEnergyCost;
        this.tax = tax;
    }

    private double getTaxPerYear(int years){
        return tax*years;
    }
    private int getEnergyCostPerYear(int years){
        return annualEnergyCost*years;
    }

    public double totalHouseCost(){
        return getTaxPerYear(5)+getEnergyCostPerYear(5)+initialHouseCost;
    }
}