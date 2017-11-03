package tilegame.entities.creatures;

import java.awt.Color;
import java.awt.Graphics;
import tilegame.Game;
import tilegame.Handler;
import tilegame.gfx.Animation;
import tilegame.gfx.Assets;

public class Player extends Creature {
    
    //Animations
    private Animation animDown;
    
    public Player(Handler handler, float x, float y) {
        super(handler, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);
    
        bounds.x = 12;
        bounds.y = 18;
        bounds.width = 13;
        bounds.height = 16;
        
        //Animations
        animDown = new Animation(100, Assets.player_down);
    }

    @Override
    public void tick() {
        //Animations
        animDown.tick();
        
        //Movements
        getInput();
        move();
        handler.getGameCamera().centerOnEntity(this);
    }
    
    private void getInput() {
        xMove = 0;
        yMove = 0;
        
        if(handler.getKeyManager().up)
            yMove = -speed;
        if(handler.getKeyManager().down)
            yMove = speed;
        if(handler.getKeyManager().left)
            xMove = -speed;
        if(handler.getKeyManager().right)
            xMove = speed;
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(animDown.getCurrentFrame(), (int) (x- handler.getGameCamera().getxOffset()), 
                (int) (y - handler.getGameCamera().getyOffset()), width, height, null);
//        g.setColor(Color.red);
//        g.fillRect((int) (x + bounds.x - handler.getGameCamera().getxOffset()),
//                (int) (y + bounds.y - handler.getGameCamera().getyOffset()),
//                bounds.width, bounds.height);
        
    }
    
}
