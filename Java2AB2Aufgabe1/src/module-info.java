module Java2AB2Aufgabe1 {
   exports exception;

   exports application;
   
   opens application;
   
   requires javafx.base;
   
   requires javafx.controls;

   requires transitive javafx.graphics;
   
   requires javafx.fxml;
}
