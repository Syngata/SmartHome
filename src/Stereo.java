
public class Stereo implements IntCommand {
	
	StereoMethods strMet;
	public Stereo(StereoMethods strMet) {
		this.strMet=strMet;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		strMet.on();
		strMet.setCd();
		strMet.setVolume(90);
		

	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub

	}

}
