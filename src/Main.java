import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
/********************************
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *******************************/




/*
    Name: Main
    Purpose: The main application launcher, do not alter it unless
    there's a necessity to alter program launch settings for JavaFX
    Constructer: N/A
    Usages: N/A
*/
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //opens the default GUI fxml file
        Parent root = FXMLLoader.load(getClass().getResource("GameOfLife/Comp/MainPage.fxml"));
        primaryStage.setTitle("Game of Life");
        //GUI application min size settings in px
        primaryStage.setMinHeight(700);
        primaryStage.setMinWidth(880);
        //
        primaryStage.setScene(new Scene(root, 900, 700));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
