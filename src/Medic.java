public class Medic{
	
	private String surnameM;
	private int colnumber;
	private Speciality speciality;

	public Medic(){

	}
	public Medic(String name, String surnameP , String surnameM, Sex sex, String dni, int age, StateC civilstate, double salary, TDedic typededication, int anexo, int colnumber, Speciality speciality){
		super(name, surnameP, sex, dni, age, civilstate, salary, typededication, anexo);
		this.surnameM=surnameM;
		this.colnumber=colnumber;
		this.speciality=speciality;
	}

	public String getSurnameM(){
		return surnameM;
	}
	public void setSurnameM(String surnameM){
		this.surnameM=surnameM;
	}
	public int getColnumber(){
		return colnumber;
	}
	public void setColnumber(int colnumber){
		this.colnumber=colnumber;
	}
	public Speciality getSpeciality(){
		return speciality;
	}
	public void setSpeciality(Speciality speciality){
		this.speciality=speciality;
	}
}