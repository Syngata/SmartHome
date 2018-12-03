
public class StereoOff implements IntCommand {
	StereoMethods strMet;
	
	
	public StereoOff(StereoMethods strMet) {
		this.strMet=strMet;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		strMet.off();
		
		strMet.setVolume(0);
		
		
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub

	}

}
