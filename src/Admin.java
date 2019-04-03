public class Admin extends Worker implements Consultable{
	
	private String surnameM;
	private RegimenWork regimen;
	private String function;

	public Admin(){

	}
	public Admin(String name, String surnameP , String surnameM, Sex sex, String dni, int age, StateC civilstate, double salary, TDedic typededication, int anexo, RegimenWork regimen, String function){
		super(name, surnameP, sex, dni, age, civilstate, salary, typededication, anexo);
		this.surnameM=surnameM;
		this.regimen=regimen;
		this.function=function;
	}

	public String getSurnameM(){
		return surnameM;
	}
	public void setSurnameM(String surnameM){
		this.surnameM=surnameM;
	}
	public RegimenWork getRegimen(){
		return regimen;
	}
	public void setRegimen(RegimenWork regimen){
		this.regimen=regimen;
	}
	public String getFunction(){
		return function;
	}
	public void setFunction(String function){
		this.function=function;
	}

	public String consultData(){

		return getName() + " " + getSurnameP() + " " + getSurnameM() + " " + getTypededication() + " " + getRegimen();
	}
}