
public class AppClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteController rmt= new RemoteController();
		Light light= new Light();
		
		LightOnCommand lightOnCom = new LightOnCommand(light);
		
		rmt.setCommand(lightOnCom);
		rmt.buttonOnWasPressed();
		
		Garage garage= new Garage();
		GarageDoorCommand gdc= new GarageDoorCommand(garage);
		rmt.setCommand(gdc);
		rmt.buttonOnWasPressed();
		rmt.buttonOffWasPressed();		
	}

}
