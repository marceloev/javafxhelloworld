package eu.headcrashing;

import java.util.ResourceBundle;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloWorldController {

	@FXML
	private ResourceBundle resources;

	@FXML
	private Label myLabel;

	@FXML
	private TextField myTextField;

	@FXML
	private void initialize() {
		this.name.set(this.resources.getString("initialName"));
		this.greeting.set(this.resources.getString("greeting"));
		this.myTextField.textProperty().bindBidirectional(this.name);
	}

	private final StringProperty name = new SimpleStringProperty("");

	public StringProperty nameProperty() {
		return this.name;
	}

	public String getName() {
		return this.name.get();
	}

	public void setName(final String value) {
		this.name.set(value);
	}

	private final StringProperty greeting = new SimpleStringProperty("");

	public StringProperty greetingProperty() {
		return this.greeting;
	}

	public String getGreeting() {
		return this.greeting.get();
	}

	public void setGreeting(final String value) {
		this.greeting.set(value);
	}

	public void onEnteredName(final ActionEvent e) {
		new Alert(AlertType.INFORMATION, this.myTextField.getText()).showAndWait();
	}

}