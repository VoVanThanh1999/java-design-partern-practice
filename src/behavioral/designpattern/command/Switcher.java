package behavioral.designpattern.command;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// invoker
public class Switcher {

	public List<Command> commands;
	
	public Switcher() {
		this.commands = new ArrayList<>();
	}

	public void addCommand(Command command) {
		this.commands.add(command);
	}
	
	public void executeCommands() {
		for (Command command: commands) {
			command.execute();
		}
	}
	
}
