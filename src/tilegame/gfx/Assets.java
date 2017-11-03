package tilegame.gfx;

import java.awt.image.BufferedImage;

public class Assets {
    
    private static int width = 75, height = 75;
    
    public static BufferedImage player, dirt, grass, stone, stump, water, volcano;
    public static BufferedImage[] player_down;
//    public static BufferedImage[] moving_grass;
    
    public static void init() {
        SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/landtile3.png"));
        
        player_down = new BufferedImage[11];//# of down animations
//        moving_grass = new BufferedImage[6];//moving grass
//        
//        moving_grass[0] = ImageLoader.loadImage("/textures/grass4_1.png");
//        moving_grass[1] = ImageLoader.loadImage("/textures/grass4_2.png");
//        moving_grass[2] = ImageLoader.loadImage("/textures/grass4_3.png");
//        moving_grass[3] = ImageLoader.loadImage("/textures/grass4_4.png");
//        moving_grass[4] = ImageLoader.loadImage("/textures/grass4_5.png");
//        moving_grass[5] = ImageLoader.loadImage("/textures/grass4_6.png");
        
        player_down[0] = ImageLoader.loadImage("/textures/link_down_0.png");
        player_down[1] = ImageLoader.loadImage("/textures/link_down_1.png");
        player_down[2] = ImageLoader.loadImage("/textures/link_down_2.png");
        player_down[3] = ImageLoader.loadImage("/textures/link_down_3.png");
        player_down[4] = ImageLoader.loadImage("/textures/link_down_4.png");
        player_down[5] = ImageLoader.loadImage("/textures/link_down_5.png");
        player_down[6] = ImageLoader.loadImage("/textures/link_down_6.png");
        player_down[7] = ImageLoader.loadImage("/textures/link_down_7.png");
        player_down[8] = ImageLoader.loadImage("/textures/link_down_8.png");
        player_down[9] = ImageLoader.loadImage("/textures/link_down_9.png");
        player_down[10] = ImageLoader.loadImage("/textures/link_down_10.png");
                
                
        player = ImageLoader.loadImage("/textures/player.png");
        dirt = ImageLoader.loadImage("/textures/dirt.png");
        grass = ImageLoader.loadImage("/textures/grass4.gif");
        stone = ImageLoader.loadImage("/textures/stone.png");
        stump = ImageLoader.loadImage("/textures/stump.png");
        water = ImageLoader.loadImage("/textures/deepwater.png");
        volcano = ImageLoader.loadImage("/textures/volcano.png");
    }
}
