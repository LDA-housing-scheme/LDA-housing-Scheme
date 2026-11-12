public class Main {
    public static void main(String[] args) {
      
        LDAHousingScheme scheme = new LDAHousingScheme("MD Housing Scheme");

        Block commercialBlock = new CommercialBlock("Commercial Block", 5000.0);
        Plot rectPlot = new RectanglePlot(30.0, 40.0);

        commercialBlock.addPlot(rectPlot);
        scheme.addBlock(commercialBlock);

        Block residentialBlock = new ResidentialBlock("Residential Block", 3000.0);
        Plot squarePlot = new SquarePlot(25.0);

        residentialBlock.addPlot(squarePlot);
        scheme.addBlock(residentialBlock);
 
        Block communityBlock = new CommunityBlock("Community Block", 2000.0);
        Plot communityPlot = new RectanglePlot(20.0, 30.0);

        communityBlock.addPlot(communityPlot);
        scheme.addBlock(communityBlock);
   
        scheme.assignPlot("Ali", commercialBlock, rectPlot);
        scheme.assignPlot("Ahmed", residentialBlock, squarePlot);
        scheme.assignPlot("Sara", communityBlock, communityPlot);
}
}


