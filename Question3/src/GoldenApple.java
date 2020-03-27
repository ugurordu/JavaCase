
public class GoldenApple extends GreenApple {

	public GoldenApple(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean isColoured() {

		System.out.println("just eat it !!");
		return true;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Sour GoldenApple";
	}

}
