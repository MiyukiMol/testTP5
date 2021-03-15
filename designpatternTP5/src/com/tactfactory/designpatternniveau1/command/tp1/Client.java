package com.tactfactory.designpatternniveau1.command.tp1;

public class Client {

  private Invoker invoker = new Invoker();

  public void executeCommand(Command command) throws CloneNotSupportedException {
    if (command.execute()) {
      this.invoker.push(command);
    }
  }

  public void undo() {
    if (this.invoker.isEmpty())
      return;

    Command command = invoker.pop();
    if (command != null) {
      command.undo();
    }
  }

  public void showHistory() {
    this.invoker.showHistory();
  }

}