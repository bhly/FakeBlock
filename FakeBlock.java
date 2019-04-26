import javafx.scene.layout.BorderPane;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.ImageCursor;
import javafx.scene.text.Text;
import javafx.geometry.Pos;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DialogPane;
import javafx.scene.media.AudioClip;
import javafx.scene.input.MouseEvent;
import javafx.event.EventHandler;
//import java.util.Random;
import java.text.*;
import java.lang.*;


public class FakeBlock extends Application {
	
	private Image mallet;
	private AudioClip sound1;
	private AudioClip sound2;
	//private Random rand;
	
	public void start(Stage stage){
		stage.setTitle("FakeBlock");
		stage.getIcons().add(new Image("file:icon.png"));
		
		BorderPane pane = new BorderPane();
		
		Scene scene = new Scene(pane, 500, 600);
		
		BackgroundImage bg = new BackgroundImage(new Image("file:bg.png", 1000, 1000, false, true), 
			BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
		
		pane.setBackground(new Background(bg));
		
		mallet = new Image("mallet.png");
		ImageCursor cursor = new ImageCursor(mallet);
		scene.setCursor(cursor);
		cursor.getBestSize(577, 355);
		
		sound1 = new AudioClip("file:sound1.wav");
		sound2 = new AudioClip("file:sound2.wav");
		
		
		
		 pane.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent me) {
				if(Math.random() < 0.5)
					sound1.play();
				else
					sound2.play();
            }
        });
		
		stage.setScene(scene);
		stage.show();
		
		
            
			
		 
	}
}