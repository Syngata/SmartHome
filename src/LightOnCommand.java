
public class LightOnCommand implements IntCommand {
	
	//Reciever
	
	Light light;
	
	public LightOnCommand(Light light) {
		this.light=light;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		light.on();

	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		light.off();
	}

}
