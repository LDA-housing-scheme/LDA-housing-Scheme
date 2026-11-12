public abstract class Plot {

    protected String ownerName;

    public abstract double calculateSize();

    public abstract double calculatePrice(double rate);

    public abstract String getPlotType();

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void displayOwner() {
        System.out.println("Owner Name: " + ownerName);
    }
}