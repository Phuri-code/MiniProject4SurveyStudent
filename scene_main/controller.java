import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private DatePicker DateOfBirth;

    @FXML
    private ToggleGroup Department;

    @FXML
    private TextField StudentName;

    @FXML
    private CheckBox check_MATH;

    @FXML
    private CheckBox check_OS;

    @FXML
    private RadioButton checkbox_GTR;

    @FXML
    private Button submit_button;

    @FXML
    void on_submit(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert DateOfBirth != null : "fx:id=\"DateOfBirth\" was not injected: check your FXML file 'View.fxml'.";
        assert Department != null : "fx:id=\"Department\" was not injected: check your FXML file 'View.fxml'.";
        assert StudentName != null : "fx:id=\"StudentName\" was not injected: check your FXML file 'View.fxml'.";
        assert check_MATH != null : "fx:id=\"check_MATH\" was not injected: check your FXML file 'View.fxml'.";
        assert check_OS != null : "fx:id=\"check_OS\" was not injected: check your FXML file 'View.fxml'.";
        assert checkbox_GTR != null : "fx:id=\"checkbox_GTR\" was not injected: check your FXML file 'View.fxml'.";
        assert submit_button != null : "fx:id=\"submit_button\" was not injected: check your FXML file 'View.fxml'.";

    }

}
