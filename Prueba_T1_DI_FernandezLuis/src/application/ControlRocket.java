package application;

import java.io.IOException;

import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

/**
 * 
 * @author LUIS FERNANDEZ RAMIREZ
 * @version 1.0
 * @see ControlRocket
 *
 */
public class ControlRocket {

	@FXML
	private AnchorPane anchor, Pane;
	@FXML
	private ImageView photo;

	public void initialize() {

		transitio();

	}

	/**
	 * Metodo para abrir la nueva ventana
	 * Implemento la linea de código (stage.initStyle(StageStyle.UNDECORATED);)
	 * Al cargar la neva escena no aparecen los botones de Maximizar, Minimizar o Salir
	 */
	@FXML
	public void openStage() {
		Stage thisStage = (Stage) anchor.getScene().getWindow();
		thisStage.close();

		try {
			
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/Urano.fxml"));
			Parent root1;
			root1 = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.initStyle(StageStyle.UNDECORATED);
			stage.setScene(new Scene(root1));
			stage.setResizable(false);
			stage.show();
	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Metodo para cerrar la aplicacion
	 */
	@FXML
	public void closeApp() {
		Stage thisStage = (Stage) Pane.getScene().getWindow();
		thisStage.close();
	}

	/**
	 * Metodo que hace que la imagen tenga transición
	 */

	private void transitio() {
		FadeTransition ft = new FadeTransition(Duration.seconds(5), photo);
		ft.setFromValue(0);
		ft.setToValue(1);
		ft.play();
	}
}
