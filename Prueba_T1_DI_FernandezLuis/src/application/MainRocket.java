package application;

/** Programa que abre un login y al pulsar un bot�n abrimos otra ventana.
 * @author LUIS FERN�NDEZ RAMIREZ
 * @version  1.0
 * @see MainRockets
 *
 */
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

public class MainRocket extends Application {
	/**
	 * M�todo que inicia la aplicaci�n.
	 */
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Mars.fxml"));
			AnchorPane root = (AnchorPane) loader.load();
			Scene scene = new Scene(root, 600, 500);
			primaryStage.setTitle("Let me in");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}