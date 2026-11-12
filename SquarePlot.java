public class SquarePlot extends Plot {

    private double side;

    public SquarePlot(double side) {
        this.side = side;
    }

    @Override
    public double calculateSize() {
        return side * side;
    }

    @Override
    public double calculatePrice(double rate) {
        return calculateSize() * rate;
    }

    @Override
    public String getPlotType() {
        return "Square Plot";
    }
}