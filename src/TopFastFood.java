
public class TopFastFood {
	
	private int rank;
	private String category;
	private String name;
	private int sales;
	private int avgSales;

	public TopFastFood() {
		
	}
	
	public TopFastFood(int rank, String name, String category, int sales, int avgSales) {
		this.rank = rank;
		this.name = name;
		this.category = category;
		this.sales = sales;
		this.avgSales = avgSales;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSales() {
		return sales;
	}

	public void setSales(int sales) {
		this.sales = sales;
	}
	
	public int getAvgSales() {
		return avgSales;
	}

	public void setAvgSales(int avgSales) {
		this.avgSales = avgSales;
	}
	
	@Override
	public String toString() {
		String topFastFoodStr = this.getRank() +"\t" + this.getName() +"\t" + this.getCategory() + "\t" + this.getSales() +"\t" + this.getAvgSales();
		return topFastFoodStr;
	}

}
