
public class GarageDoorCommand implements IntCommand {
	
	Garage garage;
	
	public GarageDoorCommand(Garage garage) {
		// TODO Auto-generated constructor stub
		this.garage=garage;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		garage.up();
		garage.lightsOn();
		garage.stop();

	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
		garage.down();
		garage.lightsOff();

	}

}
