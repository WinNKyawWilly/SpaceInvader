package com.se233.spaceinvadertofu;

import javafx.scene.media.AudioClip;


public class SoundEffect {
    private AudioClip soundEffect;

    public SoundEffect(String filePath) {
        soundEffect = new AudioClip(HelloApplication.class.getResource(filePath).toExternalForm());
    }

    public void playClip() {
        soundEffect.play();
    }
}
