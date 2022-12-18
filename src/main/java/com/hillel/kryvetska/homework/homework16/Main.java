package com.hillel.kryvetska.homework.homework16;

public class Main {
    public static void main(String[] args) {

        MusicStyles[] musicStyles = {
                new PopMusic("Pop Band"),
                new RockMusic("Rock Band"),
                new ClassicMusic("Classic Band")
        };

        for (MusicStyles musicStyle : musicStyles) {
        musicStyle.playMusic();
        }








    }
}
