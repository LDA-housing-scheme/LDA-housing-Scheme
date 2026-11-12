import java.util.List;
import java.util.ArrayList;

class LDAHousingScheme {
    private String schemeName;
    private List<Block> blocks; 

    public LDAHousingScheme(String schemeName) {
        this.schemeName = schemeName;
        this.blocks = new ArrayList<>();
    }

    public void addBlock(Block b) {
        blocks.add(b);
    }

    public void assignPlot(String ownerName, Block block, Plot plot) {
        plot.setOwnerName(ownerName);
       
        System.out.println("==================================================");
        System.out.println("===== " + schemeName + " =====");
        System.out.println("==================================================");
        System.out.println();
        System.out.println("----- PLOT ASSIGNMENT -----");
        plot.displayOwner();
        System.out.println("Block Name: " + block.getBlockName());
        System.out.println("Plot Area: " + plot.calculateSize());
        System.out.println("Rate: " + block.getRate());
        System.out.println("Total Price: " + plot.calculatePrice(block.getRate()));
    }
}
