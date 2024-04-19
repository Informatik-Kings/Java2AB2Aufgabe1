/**
 * 
 */
package application;

import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

/**
 * TODO Add comment here
 *
 * @author $Author:  $
 * @version $Revision:  $, $Date:  $ UTC
 */
public class CardBorderPane extends BorderPane
{

   /**
    * TODO Add constructor comment here
    *
    */
   public CardBorderPane()
   {
      VBox vbox = new VBox();
      Button button1 = new Button("Button 1");
      Button button2 = new Button("Button 2");
      Button button3 = new Button("Button 3");
      vbox.getChildren().addAll(button1,button2,button3);
      getChildren().add(vbox);
   }

}
