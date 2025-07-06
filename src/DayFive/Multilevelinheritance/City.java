package DayFive.Multilevelinheritance;


public class City extends State {
	private String Area;
	private String cityName;
	public String getArea() {
		return Area;
	}
	public void setArea(String area) {
		Area = area;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	@Override
	public String toString() {
		return "City [Area=" + Area + ", cityName=" + cityName + ", getArea()=" + getArea() + ", getCityName()="
				+ getCityName() + ", getStateName()=" + getStateName() + ", getLanguage()=" + getLanguage()
				+ ", getContryName()=" + getContryName() + ", getCapital()=" + getCapital() + "]";
	}
	
	

}
