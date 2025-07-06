package DayFive.Multilevelinheritance;

public class State extends CountryName {
	private String stateName;
	private String Language;
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getLanguage() {
		return Language;
	}
	public void setLanguage(String language) {
		Language = language;
	}
	@Override
	public String toString() {
		return "State [stateName=" + stateName + ", Language=" + Language + ", getStateName()=" + getStateName()
				+ ", getLanguage()=" + getLanguage() + ", getContryName()=" + getContryName() + ", getCapital()="
				+ getCapital() + "]";
	}
	
	
	

	
}
