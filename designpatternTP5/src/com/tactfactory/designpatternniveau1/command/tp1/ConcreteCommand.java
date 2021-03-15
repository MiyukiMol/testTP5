package com.tactfactory.designpatternniveau1.command.tp1;

public class ConcreteCommand extends Command {

	  private Receiver receiver;
	  private Receiver beforeExecute;

	  public ConcreteCommand(final Receiver receiver) {
	    this.receiver = receiver;
	  }

	  @Override
	  public boolean execute() throws CloneNotSupportedException {
	    System.out.println("ConcreteCommand execute");
	    this.beforeExecute = (Receiver) this.receiver.clone();
	    if (this.receiver.getName() == null && this.receiver.getQuantity() == 0) {
	      this.receiver.setName("name");
	      this.receiver.setQuantity(0);
	    }

	    return true;
	  }

	  @Override
	  public boolean undo() {
	    System.out.println("ConcreteCommand undo");
	    this.receiver.setName(this.beforeExecute.getName());
	    this.receiver.setQuantity(this.beforeExecute.getQuantity());
	    return true;
	  }

	  @Override
	  public String toString() {
	    return  receiver + "]";
	  }
	}
