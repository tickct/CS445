package button;

import lamp.Lamp;

public class Button {
	protected Lamp lamp;
	public Button(Lamp lmp){
		lamp=lmp;
	}
	public void switchOn(){
		System.out.println("Button switched to ON");
		lamp.on();
	}
	public void switchOff(){
		System.out.println("Button switched to OFF");
		lamp.off();
	}

}
