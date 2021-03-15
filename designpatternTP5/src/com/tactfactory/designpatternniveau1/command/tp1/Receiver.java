package com.tactfactory.designpatternniveau1.command.tp1;

public class Receiver implements Cloneable {

	  private String name;
	  private int quantity;
	  
	// Action 1
	public String getName() {
		return name;
	}

	// Action 2
	public void setName(String name) {
		this.name = name;
	}

	// Action 3
	public int getQuantity() {
		return quantity;
	}

	// Action 4
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	
	
	

	  @Override
	  public String toString() {
	    return "Stock [Name :" + name + ", quantity :" + quantity + "]";
	  }

	  @Override
	  protected Object clone() throws CloneNotSupportedException {
	    Receiver result = new Receiver();
	    result.setName(this.getName());
	    result.setQuantity(this.getQuantity());
	    return result;
	  }
	}