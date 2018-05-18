package zahid;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Dodgeball extends Application{

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Dodgeball");
		GridPane layout = new GridPane();
		Button button = new Button("Click here to WIN an iPhone 11!!");
		Button button2 = new Button("Click here to WIN $10.00!!");
		layout.getChildren().add(button);
		layout.getChildren().add(button2);
		Scene scene = new Scene(layout, 200,100);
		primaryStage.setScene(scene);
		
		primaryStage.show();
		
	}
	

}
