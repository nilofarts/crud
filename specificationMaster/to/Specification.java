package in.net.usit.specificationMaster.to;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Specification {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
    private  String requiredParameters;
    private  String tolMin;
    private  String tolMax;
    private  String valuesMIN;
    private  String valuesAim;
    private  String valuesMAX;
    private  String mandatory;
    private  String sampleRequired;
    private  String noOfSamples;
    private  String validity;
    private  String validityDateTime;
    private  String version;

    public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRequiredParameters() {
		return requiredParameters;
	}
	public void setRequiredParameters(String requiredParameters) {
		this.requiredParameters = requiredParameters;
	}
	public String getTolMin() {
		return tolMin;
	}
	public void setTolMin(String tolMin) {
		this.tolMin = tolMin;
	}
	public String getTolMax() {
		return tolMax;
	}
	public void setTolMax(String tolMax) {
		this.tolMax = tolMax;
	}
	public String getValuesMIN() {
		return valuesMIN;
	}
	public void setValuesMIN(String valuesMIN) {
		this.valuesMIN = valuesMIN;
	}
	public String getValuesAim() {
		return valuesAim;
	}
	public void setValuesAim(String valuesAim) {
		this.valuesAim = valuesAim;
	}
	public String getValuesMAX() {
		return valuesMAX;
	}
	public void setValuesMAX(String valuesMAX) {
		this.valuesMAX = valuesMAX;
	}
	public String getMandatory() {
		return mandatory;
	}
	public void setMandatory(String mandatory) {
		this.mandatory = mandatory;
	}
	public String getSampleRequired() {
		return sampleRequired;
	}
	public void setSampleRequired(String sampleRequired) {
		this.sampleRequired = sampleRequired;
	}
	public String getNoOfSamples() {
		return noOfSamples;
	}
	public void setNoOfSamples(String noOfSamples) {
		this.noOfSamples = noOfSamples;
	}
	public String getValidity() {
		return validity;
	}
	public void setValidity(String validity) {
		this.validity = validity;
	}
	public String getValidityDateTime() {
		return validityDateTime;
	}
	public void setValidityDateTime(String validityDateTime) {
		this.validityDateTime = validityDateTime;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
    
    

}
