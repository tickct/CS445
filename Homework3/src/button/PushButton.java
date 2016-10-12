package button;

import lamp.Lamp;

public class PushButton extends Button {
	boolean on=false;
	public PushButton(Lamp lmp) {
		super(lmp);
	}
	public void pushButton(){
		if(on==false){
			on=true;
			lamp.on();
		}
		else{
			on=false;
			lamp.off();
		}
	}

}
