
public class AppClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteController rmt= new RemoteController();
		Light light= new Light();
		Garage garage= new Garage();
		StereoMethods strMet= new StereoMethods();
		
		LightOnCommand lightOnCom = new LightOnCommand(light);
		LightOffCommanr lightOffCom= new LightOffCommanr(light);
		GarageDoorCommand garDoorCom= new GarageDoorCommand(garage);
		GarageDoorDown garDoorDown= new GarageDoorDown(garage);
		Stereo stOn = new Stereo(strMet);
		StereoOff stOff= new StereoOff(strMet);
		
		rmt.setCommand(0, lightOnCom, lightOffCom);		
		rmt.setCommand(1, garDoorCom, garDoorDown);		
		rmt.setCommand(2, stOn, stOff);
		
		System.out.println(rmt.toString());
		
		for (int i=0;i<rmt.intComOn.length;i++) {
			System.out.println("**************SLOT "+ i +"*************");
			rmt.buttonOnWasPressed(i);
			rmt.buttonOffWasPressed(i);
		}
		
		  		
	}

}
