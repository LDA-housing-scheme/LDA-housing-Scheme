public class RectanglePlot extends Plot {

    private double length;
    private double width;

    public RectanglePlot(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateSize() {
        return length * width;
    }

    @Override
    public double calculatePrice(double rate) {
        return calculateSize() * rate;
    }

    @Override
    public String getPlotType() {
        return "Rectangle Plot";
    }
}