import lamp.Lamp;
import button.Button;


public class MainLamp {
	public static void main(String[] args){
		Lamp lamp=new Lamp();
		Button button=new Button(lamp);
		button.switchOn();
		button.switchOff();
	}
}
