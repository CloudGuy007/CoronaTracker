package be.dog.d.steven.corona_tracker.model;

public class DailyReportsUS {

	private String provinceState;
    private String countryRegion;
    private String lastUpdate;
    private Double lat;
    private Double lng;   
    private int confirmed;
    private int deaths;
    private int recovered;
    private int active;
    private int FIPS;
    private Double incidentRate;
    private int totalTestResults;
    private int peopleHospitalized;
    private Double caseFatalityRatio;
    private int UID;
    private String ISO3;
    private Double testingRate;
    private Double hospitalizationRate;
    

	
    public String getProvinceState() {
		return provinceState;
	}
	public void setProvinceState(String provinceState) {
		this.provinceState = provinceState;
	}
	public String getCountryRegion() {
		return countryRegion;
	}
	public void setCountryRegion(String countryRegion) {
		this.countryRegion = countryRegion;
	}
	public String getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	public Double getLat() {
		return lat;
	}
	public void setLat(Double lat) {
		this.lat = lat;
	}
	public Double getLng() {
		return lng;
	}
	public void setLng(Double lng) {
		this.lng = lng;
	}
	public int getConfirmed() {
		return confirmed;
	}
	public void setConfirmed(int confirmed) {
		this.confirmed = confirmed;
	}
	public int getDeaths() {
		return deaths;
	}
	public void setDeaths(int deaths) {
		this.deaths = deaths;
	}
	public int getRecovered() {
		return recovered;
	}
	public void setRecovered(int recovered) {
		this.recovered = recovered;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	public int getFIPS() {
		return FIPS;
	}
	public void setFIPS(int fIPS) {
		FIPS = fIPS;
	}
	public Double getIncidentRate() {
		return incidentRate;
	}
	public void setIncidentRate(Double incidentRate) {
		this.incidentRate = incidentRate;
	}
	public int getTotalTestResults() {
		return totalTestResults;
	}
	public void setTotalTestResults(int totalTestResults) {
		this.totalTestResults = totalTestResults;
	}
	public int getPeopleHospitalized() {
		return peopleHospitalized;
	}
	public void setPeopleHospitalized(int peopleHospitalized) {
		this.peopleHospitalized = peopleHospitalized;
	}
	public Double getCaseFatalityRatio() {
		return caseFatalityRatio;
	}
	public void setCaseFatalityRatio(Double caseFatalityRatio) {
		this.caseFatalityRatio = caseFatalityRatio;
	}
	public int getUID() {
		return UID;
	}
	public void setUID(int uID) {
		UID = uID;
	}
	public String getISO3() {
		return ISO3;
	}
	public void setISO3(String iSO3) {
		ISO3 = iSO3;
	}
	public Double getTestingRate() {
		return testingRate;
	}
	public void setTestingRate(Double testingRate) {
		this.testingRate = testingRate;
	}
	public Double getHospitalizationRate() {
		return hospitalizationRate;
	}
	public void setHospitalizationRate(Double hospitalizationRate) {
		this.hospitalizationRate = hospitalizationRate;
	}

	@Override
	public String toString() {
		return "DailyReportsUS [provinceState=" + provinceState + ", countryRegion=" + countryRegion + ", lastUpdate="
				+ lastUpdate + ", lat=" + lat + ", lng=" + lng + ", confirmed=" + confirmed + ", deaths=" + deaths
				+ ", recovered=" + recovered + ", active=" + active + ", FIPS=" + FIPS + ", incidentRate="
				+ incidentRate + ", totalTestResults=" + totalTestResults + ", peopleHospitalized=" + peopleHospitalized
				+ ", caseFatalityRatio=" + caseFatalityRatio + ", UID=" + UID + ", ISO3=" + ISO3 + ", testingRate="
				+ testingRate + ", hospitalizationRate=" + hospitalizationRate + "]";
	}
	public DailyReportsUS() {
		super();
	}
	
	
}
