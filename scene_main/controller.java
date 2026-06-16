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
    private CheckBox check_OOP;

    @FXML
    private RadioButton checkbox_GTR;

    @FXML
    private RadioButton checkbox_GIC;

    @FXML
    private RadioButton checkbox_AMS;

    @FXML
    private Button submit_button;

    @FXML
    void on_submit(ActionEvent event) {

        String name = StudentName.getText();

        String dob = "Not Selected";
        if (DateOfBirth.getValue() != null) {
            dob = DateOfBirth.getValue().toString();
        }

        String department = "Not Selected";

        if (checkbox_GTR.isSelected()) {
            department = "GTR";
        } else if (checkbox_GIC.isSelected()) {
            department = "GIC";
        } else if (checkbox_AMS.isSelected()) {
            department = "AMS";
        }

        String courses = "";

        if (check_MATH.isSelected()) {
            courses += "Math ";
        }

        if (check_OS.isSelected()) {
            courses += "OS ";
        }

        if (check_OOP.isSelected()) {
            courses += "OOP ";
        }

        System.out.println("===== Survey Result =====");
        System.out.println("Name: " + name);
        System.out.println("DOB: " + dob);
        System.out.println("Department: " + department);
        System.out.println("Courses: " + courses);

        StudentName.clear();
        DateOfBirth.setValue(null);
        check_MATH.setSelected(false);
        check_OS.setSelected(false);
        check_OOP.setSelected(false);
        Department.selectToggle(null);
    }

    @FXML
    void initialize() {

    }
}