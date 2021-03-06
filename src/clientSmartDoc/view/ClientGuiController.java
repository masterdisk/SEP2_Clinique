package clientSmartDoc.view;

import java.awt.Button;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

public class ClientGuiController implements Initializable {

	@FXML
	private TextField user;
	@FXML
	private PasswordField pass;
	@FXML
	private Button register;
	@FXML
	private Button signin;

	private String password = "pass";

	private String username = "ana";

	public void signInButtonPressed(ActionEvent event) throws IOException {
		{
			String password1 = pass.getText();
			String username1 = user.getText();

			if ((password1.equals(password)) && (username1.equals(username))) {
				Parent signin = FXMLLoader.load(getClass().getResource("SUCCESS.fxml"));
				Scene home_page_scene = new Scene(signin);
				Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
				app_stage.setScene(home_page_scene);
				app_stage.show();
			} else {
				Parent signin = FXMLLoader.load(getClass().getResource("FAILED.fxml"));
				Scene home_page_scene = new Scene(signin);
				Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
				app_stage.setScene(home_page_scene);
				app_stage.show();
			}
		}

	}

	public void registerButtonPressed(ActionEvent event) throws IOException {
		{
			Parent register = FXMLLoader.load(getClass().getResource("UserPage.fxml"));
			Scene home_page_scene = new Scene(register);
			Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			app_stage.setScene(home_page_scene);
			app_stage.show();
		}

	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}
}
