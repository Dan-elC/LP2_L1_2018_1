public class Speciality{
	

	private char clasification;
	private String speciality;

	public Speciality(){

	}
	public Speciality(char clasification, String speciality){
		this.clasification=clasification;
		this.speciality=speciality;
	}

	public char getClasification(){
		return clasification;
	}
	public void setClasification(char clasification){
		this.clasification=clasification;
	}
	public String getSpeciality(){
		return speciality;
	}
	public void setSpeciality(String speciality){
		this.speciality=speciality;
	}
}