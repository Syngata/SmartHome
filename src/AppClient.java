
public class AppClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//invoker
		RemoteController rmt= new RemoteController();
		
		//recievers
		
		Light light= new Light();
		Garage garage= new Garage();
		StereoMethods strMet= new StereoMethods();
		
		//command objets on
		LightOnCommand lightOnCom = new LightOnCommand(light);		
		GarageDoorCommand garDoorCom= new GarageDoorCommand(garage);		
		Stereo stOn = new Stereo(strMet);
		
		//command objects off
		StereoOff stOff= new StereoOff(strMet);
		LightOffCommanr lightOffCom= new LightOffCommanr(light);
		GarageDoorDown garDoorDown= new GarageDoorDown(garage);
		
		//programming buttons
		rmt.setCommand(0, lightOnCom, lightOffCom);		
		rmt.setCommand(1, garDoorCom, garDoorDown);		
		rmt.setCommand(2, stOn, stOff);
		
		
		System.out.println(rmt.toString());
		
		for (int i=0;i<rmt.intComOn.length;i++) {
			System.out.println("**************SLOT "+ (i+1) +"*************");
			rmt.buttonOnWasPressed(i);
			rmt.buttonOffWasPressed(i);
		}
		
		rmt.undoCom.undo();
		
		  		
	}

}
