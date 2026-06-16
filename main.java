// import javafx.application.Application;
// import javafx.fxml.FXMLLoader;
// import javafx.scene.Scene;
// import javafx.stage.Stage;

// public class Main extends Application {
//     public static void main(String[] args) {
//         launch();
//     }

//      @Override
//     public void start(Stage stage) throws Exception {

//         FXMLLoader loader = new FXMLLoader();
//         loader.setLocation(getClass().getResource("./scene_main/View.fxml"));

//         Scene scene = new Scene(loader.load());

        

//         stage.setTitle("Mini Project Shopping");
//         stage.setScene(scene);
//         stage.show();
//         // stage.getIcons().add(new javafx.scene.image.Image(getClass().getResourceAsStream("/asset/itc_logo.jpg")));
//         stage.setTitle("ITC SHOP");;
//     }
   
//     // public void start(Stage stage); 
    
// }
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("View.fxml"));

        Scene scene = new Scene(root);

        stage.setTitle("Survey Form");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

