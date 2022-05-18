package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Maincito extends Application
{

	public static void main ( String[] args )
	{
		launch(args);
	}

	public void start ( Stage stage ) throws Exception
	{

		Parent root = FXMLLoader.load(getClass().getResource("/view/SopitaView.fxml"));
		Scene scene = new Scene(root);

		String css = this.getClass().getResource("/res/css/application.css").toExternalForm();
		scene.getStylesheets().add(css);

		Image icon = new Image("/res/img/img_1.png");
		stage.getIcons().add(icon);
		stage.setTitle("Sopita de Letritas");
		stage.setResizable(false);
		stage.setScene(scene);
		stage.show();

		stage.setOnCloseRequest(event ->
		{
			event.consume();
			logout(stage);
		});
	}

	public void logout ( Stage stage )
	{
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("");
		alert.setHeaderText("Estas apunto de salir de la aplicación");
		alert.setContentText("");

		if ( alert.showAndWait().get() == ButtonType.OK )
		{
			stage.close();
		}
	}
}
