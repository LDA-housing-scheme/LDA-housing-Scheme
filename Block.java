public class Block {

    private String blockName;
    private String blockCode;
    private int totalPlots;

    private Plot[] plots;
    private static final int MAX_PLOTS = 100;

    public Block(String blockName, String blockCode){
        this.blockName = blockName;
        this.blockCode = blockCode;
        this.totalPlots = 0;
        this.plots = new Plot[MAX_PLOTS];
    }
    public void addPlot(Plot plot){
        if (plot != null && totalPlots < MAX_PLOTS){
            plots[totalPlots] = plot;
            totalPlots++;
        }else {
            System.out.println("Cannot add plot.");
        }
    }

    public void removePlot(Plot plot){
        for (int i = 0; i < totalPlots; i++){
            if (plots[i] == plot) {
                for (int j = i; j < totalPlots - 1; j++) {
                    plots[j] = plots[j + 1];
                }
                plots[totalPlots - 1] = null;
                totalPlots--;
                System.out.println("Plot removed successfully.");
                return;
            }
        }
        System.out.println("Plot not found.");
    }
  
    public void displayPlots(){
        if (totalPlots == 0) {
            System.out.println("No plots available in this block.");
        }else {
            System.out.println("Block Name: " + blockName);
            System.out.println("Block Code: " + blockCode);
            System.out.println("Total Plots: " + totalPlots);
		for (int i = 0; i < totalPlots; i++) {
                plots[i].displayPlotDetails();
            }
        }
    }
}
