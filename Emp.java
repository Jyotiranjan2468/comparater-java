package comparater;

public class Emp {
	private int Id;
	private String Name;
	private String City;
	public Emp(int id, String name, String city) {
		Id = id;
		Name = name;
		City = city;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	@Override
	public String toString() {
		return "Emp [Id=" + Id + ", Name=" + Name + ", City=" + City + "]";
	}
	
	

}
