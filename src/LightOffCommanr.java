
public class LightOffCommanr implements IntCommand {
	
	Light light;
	public LightOffCommanr(Light light) {
		this.light=light;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		light.off();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub

	}

}
