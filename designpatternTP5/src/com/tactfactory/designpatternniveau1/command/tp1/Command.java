package com.tactfactory.designpatternniveau1.command.tp1;

public abstract class Command {

	  public abstract boolean execute() throws CloneNotSupportedException;

	  public abstract boolean undo();
	}