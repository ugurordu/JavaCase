
public class Fruit implements Plant {
	
	String name;
	
	public Fruit(String name) {
		this.name=name;
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public boolean isColoured() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getName() {
		
		return "Sweet "+ name + " " + (this.getClass().getName());
	}
	

}
