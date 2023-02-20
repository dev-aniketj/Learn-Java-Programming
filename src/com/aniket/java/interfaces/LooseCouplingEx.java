package com.aniket.java.interfaces;

import java.util.Scanner;

interface VideoPlayer {
    void play(String file);
}

class MP4Player implements VideoPlayer {
    @Override
    public void play(String file) {
        System.out.println("MP4Player playing the file - " + file);
    }
}

class MOVPlayer implements VideoPlayer {
    @Override
    public void play(String file) {
        System.out.println("MOVPlayer playing the file - " + file);
    }
}

class PlayerFactor {
    public static VideoPlayer getPlayer(String file) {
        if (file.endsWith(".mp4") || file.endsWith(".mp3"))      {
            return (new MP4Player());
        } else if (file.endsWith(".mov")) {
            return (new MOVPlayer());
        }
        return null;
    }
}

public class LooseCouplingEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file you want to play : ");
        String fileName = scanner.nextLine();

        VideoPlayer videoPlayer;
        videoPlayer = PlayerFactor.getPlayer(fileName);
        if (videoPlayer == null) {
            System.out.println("could not find the player for the given file");
        } else {
            videoPlayer.play(fileName);
        }


    }
}
