
public class RemoteController {

	IntCommand[] intComOn;
	IntCommand[] intComOff;
	IntCommand nc = new NoCommand();
	IntCommand undoCom;
	int slot;

	public RemoteController() {
		// TODO Auto-generated constructor stub
		intComOn = new IntCommand[7];
		intComOff = new IntCommand[7];

		for (int i = 0; i < intComOn.length; i++) {
			intComOn[i] = nc;
			intComOff[i] = nc;

		}
		undoCom = nc;
	}

	public void setCommand(int slot, IntCommand comOn, IntCommand comOff) {
		intComOn[slot] = comOn;
		intComOff[slot] = comOff;
	}

	public void buttonOnWasPressed(int slot) {
		intComOn[slot].execute();
		undoCom= intComOn[slot];
	}

	public void buttonOffWasPressed(int slot) {
		intComOff[slot].execute();
		undoCom= intComOff[slot];
	}
	
	public void undoBttn() {
		undoCom.undo();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuffer sbuff = new StringBuffer();
		sbuff.append("\n ********************** Remote Controller**********************\n ");
		for (int i = 0; i < intComOn.length; i++) {
			sbuff.append("[slot" + i + "]" + intComOn[i].getClass().getName() + "\t \t"
					+ intComOff[i].getClass().getName() + "\n");
		}
		return sbuff.toString();
	}

}
