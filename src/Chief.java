public class Chief extends Worker{
	
	private String passport;
	private String ssn;
	private String carnet;

	public Chief(){

	}
	public Chief(String name, String surnameP, Sex sex, String dni, int age, StateC civilstate, double salary, TDedic typededication, int anexo, String passport, String ssn, String carnet){
		super(name, surnameP, sex, dni, age, civilstate, salary, typededication, anexo);
		this.passport=passport;
		this.ssn=ssn;
		this.carnet=carnet;
	}

	public String getPassport(){
		return passport;
	}
	public void setPassport(String passport){
		this.passport=passport;
	}
	public String getSsn(){
		return ssn;
	}
	public void setSsn(String ssn){
		this.ssn=ssn;
	}
	public String getCarnet(){
		return carnet;
	}
	public void setCarnet(String carnet){
		setDni(this.carnet);
		this.carnet=carnet;
	}
}