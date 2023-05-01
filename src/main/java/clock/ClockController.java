package clock;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.util.Duration;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ClockController {

    @FXML
    private Label clockLabel;

    @FXML
    private void initialize() {
        final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        Timeline timeline = new Timeline(new KeyFrame(Duration.ZERO, e ->
                clockLabel.setText(LocalTime.now().format(formatter))
        ), new KeyFrame(Duration.seconds(1)));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }

}
