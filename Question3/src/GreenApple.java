
public class GreenApple extends Apple {
	
	String taste;

	public GreenApple(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Sour GreenApple";
	}

	public String getTaste(){
		
		return "sour";
	}
}
