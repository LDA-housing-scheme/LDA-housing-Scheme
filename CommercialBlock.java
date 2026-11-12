class CommercialBlock extends Block {
    private double rate;

	public CommercialBlock(String blockName, double rate) {
		super(blockName);
		this.rate = rate;
	}

	@Override
	public String getBlockType() {
		return "Commercial Block";
	}

	@Override
	public double getRate() {
		return rate;
	}
}