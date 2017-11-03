package tilegame;

import tilegame.display.Display;

public class Launcher {

    public static void main(String[] args) {
       Game game = new Game("DED", 640,480);
       game.start();
    }
    
}
