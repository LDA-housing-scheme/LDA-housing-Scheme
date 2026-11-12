abstract class Block {
    protected String blockName;
    protected List<Plot> plots; 

    public Block(String blockName) {
        this.blockName = blockName;
        this.plots = new ArrayList<>();
    }

    public void addPlot(Plot p) {
        plots.add(p);
    }

    public String getBlockName() {
        return blockName;
    }

    public abstract String getBlockType();
    public abstract double getRate();
}
