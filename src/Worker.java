public class Worker extends Person{
	
	private static int code;
	private double salary;
	private TDedic typededication;
	private int anexo;

	public Worker(){

	}
	public Worker(String name, Sex sex, String dni, int age, StateC civilstate, double salary, TDedic typededication, int anexo){
		super( name, sex, dni, age, civilstate);
		this.salary=salary;
		this.typededication=typededication;
		this.anexo=anexo;
		code++;
	}

	public double getSalary(){
		return salary;
	}
	public void setSalary(double salary){
		this.salary=salary;
	}
	public TDedic getTypededication(){
		return typededication;
	}
	public void setTypededication(TDedic typededication){
		this.typededication=typededication;
	}
	public int getAnexo(){
		return anexo;
	}
	public void setAnexo(int anexo){
		this.anexo=anexo;
	}

	

}