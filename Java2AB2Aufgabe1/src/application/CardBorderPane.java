/**
 * 
 */
package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

/**
 * TODO Add comment here
 *
 * @author $Author:  $
 * @version $Revision:  $, $Date:  $ UTC
 */
public class CardBorderPane extends BorderPane
{
   /*
    * Innere Klasse als EventHandler für die Knöpfe
    * 
    * Verwaltet die StackPane
    */
   
   public class Listener implements EventHandler<ActionEvent> {

      private StackPane pane;
      private Label label;
      private String text;
      
      /*
       * Konstruktor für den EventHandler
       */
      public Listener(StackPane stackPane, Label label, String text)
      {
         pane=stackPane;
         this.label = label;
         this.text = text;
         
      }
      
      /*
       * Eventhandler, welcher die Labels der Stackpane erzeugt und behandelt
       */
      @Override
      public void handle(ActionEvent arg0)
      {
         try {
            if(!pane.getChildren().isEmpty())
            pane.getChildren().getLast().setVisible(false);
                       
            if(pane.getChildren().contains(label))
            {
               pane.getChildren().remove(label);
            }
            else
            {
               label = new Label(text);
               label.setMinSize(200, 100);   
            }
            
            pane.getChildren().addLast(label);
            
            pane.getChildren().getLast().setVisible(true);
               
            
            
         }catch(Exception e)
         {
            Alert alert =
                  new Alert(AlertType.ERROR, "Fehler nach dem Drücken des Buttons", ButtonType.OK);
            alert.setResizable(true);
            alert.showAndWait();
         }
         
      }
      
      
      
   }
   
   /**
    * TODO Add constructor comment here
    *
    */
   public CardBorderPane()
   {
      VBox vbox = new VBox();
      StackPane stackPane = new StackPane();
      
      Button button1 = new Button("Button 1");
      Label label1 = null;
      Listener listener1 = new Listener(stackPane,label1,"Knopf 1");
      button1.setOnAction(listener1);
      vbox.getChildren().add(button1);
      
      Button button2 = new Button("Button 2");
      Label label2 = null;
      Listener listener2 = new Listener(stackPane,label2,"Knopf 2");
      button2.setOnAction(listener2);
      vbox.getChildren().add(button2);
            
      Button button3 = new Button("Button 3");
      Label label3 = null;
      Listener listener3 = new Listener(stackPane,label3,"Knopf 3");
      button3.setOnAction(listener3);
      vbox.getChildren().add(button3);
      
      this.setLeft(vbox);
      this.setCenter(stackPane);
   }

}
