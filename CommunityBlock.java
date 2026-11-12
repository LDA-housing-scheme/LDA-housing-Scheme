class CommunityBlock extends Block {
    private double rate;

	public CommunityBlock(String blockName, double rate) {
		super(blockName);
		this.rate = rate;
	}

	@Override
	public String getBlockType() {
		return "Community Block";
	}

	@Override
	public double getRate() {
		return rate;
	}
}