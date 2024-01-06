package behavioral.designpattern.command;

public class App {

	public static void main(String[] args) {
		
		Switcher switcher = new Switcher();
		
		Light light = new Light();
		
		TurnOffCommand offCommand = new TurnOffCommand(light);
		TurnOnCommand onCommand = new TurnOnCommand(light);
		
		switcher.addCommand(onCommand);
		switcher.addCommand(offCommand);
		
		switcher.executeCommands();
		
	}
	
}
