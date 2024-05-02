import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args); // Launch the JavaFX application
    }

    @Override
    public void start(Stage primaryStage) {
        // Create a button
        Button button = new Button("Click me!");

        // Set action on button click
        button.setOnAction(e -> System.out.println("Button clicked!"));

        // Create a layout and add the button
        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        // Create a scene and add the layout
        Scene scene = new Scene(layout, 300, 250);

        // Set the scene to the stage and show the stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX Button Example");
        primaryStage.show();
    }
}
