
import java.util.Scanner;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NewFXMain extends Application {
    
    @Override
    public void start(Stage primaryStage) {

        
      primaryStage.setHeight(600);
      primaryStage.setWidth(1000);
      
      Label message = new Label(StringHandler.formatMessage());
      
      TextField dosCommand = new TextField();
      
      Label output = new Label();
      
      Button playButton = new Button("Execute");
      
      playButton.setOnAction(e -> ExecuteCommand(dosCommand.getText(), output));
  
      VBox vBox = new VBox(20); 
      vBox.getChildren().addAll(message,dosCommand,playButton, output);
      vBox.setPadding(new Insets(20,20,20,20));
      //Setting the space between the nodes of a VBox pane 
      
      //Setting the margin to the nodes 
      
      
      
      //Creating a scene object 
      Scene scene = new Scene(vBox);  
      
      //Setting title to the Stage 
      primaryStage.setTitle("Shell Simulator"); 
      
         
      //Adding scene to the stage 
      primaryStage.setScene(scene); 
         
      //Displaying the contents of the stage 
      primaryStage.show(); 
    
    
    }
    
   private void ExecuteCommand(String dosCommand, Label output)
   {
	   
	   String[] commandWords = dosCommand.split(" ");
	   if(commandWords.length == 2 && commandWords[0].equalsIgnoreCase("Task4") && commandWords[1].equalsIgnoreCase("-h"))
	   {
		  String finalOutput = ProcessBuilderHandler.getTheOutput("cat help.txt");
		  output.setText(finalOutput);
	   }
	   else
	   {
		   Scanner fileScanner = null;
		   fileScanner = InputObtainer.readTheFile(fileScanner, "DOS-Commands.txt");
		   
		   if(fileScanner == null)
				return;
		   
		   String LinuxCommand = FileHandler.generateLinuxCommand(fileScanner, dosCommand);
		   
		   if(LinuxCommand == null)
		   {
			   output.setText("Command not found.");
			   return;
		   }
				
		   String finalOutput = ProcessBuilderHandler.getTheOutput(LinuxCommand);
		   
		   if(finalOutput != null)
				output.setText(finalOutput);
	   }
	   
       return;
   }
   
    public static void main(String[] args) {
        launch(args);
    }
    
    
}
