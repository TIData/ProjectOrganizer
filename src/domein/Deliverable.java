package domein;

public class Deliverable extends ProjectItem {

    private double materialsCost;
    private double productionTime;

    public Deliverable(String name, String description,
            double materialsCost, double productionTime, double rate) {
        super(name, description, rate, productionTime);
        this.materialsCost = materialsCost;
        //this.productionTime = productionTime;
    }
     //public double getProductionTime() {
       // return productionTime;
    //} 
      public double getMaterialsCost() {
        return materialsCost;
    }
   
}