package spaceshipapplication.overview;

import javafx.scene.control.Button;
import javafx.scene.media.AudioClip;

public class ButtonWithClickAudio extends Button {
    private AudioClip clip = null;

    public ButtonWithClickAudio(String text) {
        super(text);
        this.setOnAction((e) -> {
            clip().play();
            System.out.println("Button CLICKED!!! ");
        });

    }

    private AudioClip clip(){
        if (clip == null) {
            String src = getClass().getResource("button.m4a").toString();
            System.out.println("src: " + src);
            clip = new AudioClip(src);
        }
        return clip;
    }
}
