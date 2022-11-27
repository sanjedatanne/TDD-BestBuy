package utils.data;

public class AutoData {
	
	private String item;
	private String house;
	private String capital;
	private String areaCode;

	public AutoData(String item, String house, String capital, String areaCode) {
		this.item = item;
		this.house = house;
		this.capital = capital;
		this.areaCode = areaCode;
	}

	public String getItem() {
		return item;
		
	}
	public String getHouse() {
		return house;
	}

	public String getCaptial() {
		return capital;
	}

	public String getAreaCode() {
		return areaCode;
	}
}
