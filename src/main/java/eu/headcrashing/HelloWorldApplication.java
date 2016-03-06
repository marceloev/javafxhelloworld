package eu.headcrashing;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloWorldApplication extends Application {

	public static void main(final String[] arguments) {
		Application.launch(arguments);
	}

	@Override
	public void start(final Stage primaryStage) throws Exception {
		final Class<?> myClass = this.getClass();
		final String myPackage = myClass.getPackage().getName();
		final URL fxml = myClass.getResource("HelloWorldView.fxml");
		final ResourceBundle resources = ResourceBundle.getBundle(myPackage + ".HelloWorldResources");
		final Parent rootNode = FXMLLoader.load(fxml, resources);
		final Scene view = new Scene(rootNode);
		primaryStage.setScene(view);
		primaryStage.show();
	}

}
