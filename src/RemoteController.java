
public class RemoteController {
	
	IntCommand intCom;
	
	public void setCommand(IntCommand intCom) {
		this.intCom=intCom;
	}
	
	public void buttonOnWasPressed() {
		intCom.execute();
	}
	
	public void buttonOffWasPressed() {
		intCom.undo();
	}
}
