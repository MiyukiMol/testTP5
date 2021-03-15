package com.tactfactory.designpatternniveau1.command.tp1;

/**
*
* @author tactfactory
*
* - Le programme doit utiliser un design pattern "Command" afin d'avoir les éléments suivant :
*   - 1 : Le programme permettra de gérer des stocks d'élément :
*       - 1 : On définira GlobalStock comme possédant une liste de Stock
*       - 2 : On ne pourra rajouter dans un GlobalStock que des éléments de Stock configurer par leur nom et une
*           quantité initialement égale à zéro
*       - 3 : Un Stock, à part comme configuration d'un GlobalStock, sera toujours construit en prenant comme
*           informations un nom, une quantité et le GlobalStock au quel il appartient
*       - 4 : Un Stock pourra être acheté ou vendu
*   - 2 : Votre design pattern "Command" doit permettre :
*       - 1 : De concerver toutes les commandes d'achat et de vente
*       - 2 : D'appliquer en une fois toutes les commandes sur le GlobalStock qui leur est rattaché
*       - 3 : Attention il est possible de continuer à passer d'autre commandes d'achat et de vente avec les même objets
*   - 3 : Le lancement de l'application doit afficher les éléments suivant :
*
*       Stock [ Name: myItem,Quantity: 0]
*       Stock [ Name: apple,Quantity: 0]
*       Stock [ Name: pinapple,Quantity: 0]
*
*
*       Stock [ Name: myItem,Quantity: 20 ] bought
*       Stock [ Name: myItem,Quantity: 20 ] sold
*       Stock [ Name: apple,Quantity: 4 ] sold
*       Stock [ Name: pinapple,Quantity: 7 ] bought
*
*
*       Stock [ Name: myItem,Quantity: 0]
*       Stock [ Name: apple,Quantity: -4]
*       Stock [ Name: pinapple,Quantity: 7]
*/
public class CommandTp1 {

	  public static void main(String[] args) throws CloneNotSupportedException {
		    Client client = new Client();
		    Receiver receiver1 = new Receiver();
		    receiver1.setName("myItem");
		    receiver1.setQuantity(0);
		    Receiver receiver2 = new Receiver();
		    receiver2.setName("apple");
		    receiver2.setQuantity(0);
		    Receiver receiver3 = new Receiver();
		    receiver3.setName("pinapple");
		    receiver3.setQuantity(0);
		    client.executeCommand(new ConcreteCommand(receiver1));
		    client.executeCommand(new ConcreteCommand(receiver2));
		    //client.undo();
		    //client.executeCommand(new ConcreteCommand(receiver3));
		    client.executeCommand(new ConcreteCommand(receiver3));

		    client.showHistory();

		    System.out.println("Current datas");
		    System.out.println(String.format("Receiver1 %s", receiver1));
		    System.out.println(String.format("Receiver2 %s", receiver2));
		    System.out.println(String.format("Receiver3 %s", receiver3));
		  }

}

