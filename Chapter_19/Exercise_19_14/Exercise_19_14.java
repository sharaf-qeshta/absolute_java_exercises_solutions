package chapter_nineteen;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.net.URL;
import java.util.Scanner;

/**
 * 14. Write a GUI application using JavaFX with a button and a textarea. When the
 * button is clicked, the HTML from www.pearsonhighered.com/savitch should be
 * retrieved using the URL class and output into the textarea. Use Java 8’s functional
 * programming paradigm to implement the action listener for the button.
 *
 * @author Sharaf Qeshta
 * */

public class Exercise_19_14 extends Application
{
    public static final String LINK = "https://www.pearsonhighered.com/savitch";
    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)
    {
        Pane pane = new Pane();

        TextArea textArea = new TextArea();
        textArea.setEditable(false);
        Button parse = new Button("Parse");

        textArea.minWidthProperty().bind(pane.widthProperty());
        textArea.minHeightProperty().bind(pane.heightProperty().divide(1.1));
        VBox container = new VBox(textArea, parse);

        container.setAlignment(Pos.CENTER);
        container.setSpacing(10);

        parse.setOnAction(event ->
        {
            String text = "";
            try
            {
                URL url = new URL(LINK);

                try (Scanner scanner = new Scanner(url.openStream()))
                {
                    while (scanner.hasNext())
                        text += scanner.nextLine() + "\n";
                }
            }
            catch (Exception exception)
            {
                text = exception.getMessage();
            }

            textArea.setText(text);
        });

        pane.getChildren().add(container);
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setTitle("Exercise_19_14");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
