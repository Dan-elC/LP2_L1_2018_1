import java.util.*;

public class Clinic{

	private String name;
	private String address;
	private City city;
	private List<Worker> workers;

	public Clinic(){
		workers = new ArrayList<Worker>();
	}
	public Clinic(String name, String address, City city){
		this.name = name;
		this.address = address;
		this.city = city;
		workers = new ArrayList<Worker>();
	}

	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getAddress(){
		return address;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public City getCity(){
		return city;
	}
	public void setCity(City city){
		this.city = city;
	}
	public List<Worker> getWorkers(){
		return workers;
	}
	public void setWorkers(List<Worker> workers){
		this.workers=workers;
	}

	public void addWorker(Worker worker){
		workers.add(worker);
	}
}