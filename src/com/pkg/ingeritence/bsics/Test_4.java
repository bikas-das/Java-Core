package com.pkg.ingeritence.bsics;

// Multiple Inheritance

interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

class SmartPhone implements Camera, MusicPlayer{

    @Override
    public void takePhoto() {
        System.out.println("photo captured");
    }

    @Override
    public void playMusic() {
        System.out.println("Music played");
    }
}

public class Test_4 {

    public static void main(String[] args) {
          SmartPhone sm = new SmartPhone();
          sm.takePhoto();
          sm.playMusic();
    }
}
