
public class GarageDoorDown implements IntCommand{
	
	Garage garage;
	
	public GarageDoorDown(Garage garage) {
		this.garage=garage;
		// TODO Auto-generated constructor stub
	
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		garage.down();
		garage.lightsOff();
		
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
