public abstract class Person{
	
	private String name;
	private String surnameP;
	private Sex sex;
	private String dni;
	private int age;
	private StateC civilstate;

	public Person(){

	}
	public Person(String name, String surnameP, Sex sex, String dni, int age, StateC civilstate){
		this.name=name;
		this.surnameP = surnameP;
		this.sex=sex;
		this.dni=dni;
		this.age=age;
		this.civilstate=civilstate;
	}

	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getSurname(){
		return surnameP;
	}
	public void setSurnameP(String surnameP){
		this.surnameP=surnameP;
	}
	public Sex getSex(){
		return sex;
	}
	public void setSex(Sex sex){
		this.sex=sex;
	}
	public String getDni(){
		return dni;
	}
	public void setDni(String dni){
		this.dni=dni;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age=age;
	}
	public StateC getCivilstate(){
		return civilstate;
	}
	public void setCivilstate(StateC civilstate){
		this.civilstate=civilstate;
	}
}