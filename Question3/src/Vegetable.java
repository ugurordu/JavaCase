
public class Vegetable implements Plant {
	
	String name;
	
	public Vegetable(String name) {
		
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
		// TODO Auto-generated method stub
		return name;
	}


}
