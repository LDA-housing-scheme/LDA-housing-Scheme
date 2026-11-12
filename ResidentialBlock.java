class ResidentialBlock extends Block {
    private double rate;

	public ResidentialBlock(String blockName, double rate) {
		super(blockName);
        	this.rate = rate;
	}

	@Override
	public String getBlockType() {
        	return "Residential Block";
	}

	@Override
	public double getRate() {
        	return rate;
	}
}
