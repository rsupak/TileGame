package tilegame.states;

import java.awt.Graphics;
import tilegame.Game;
import tilegame.Handler;
import tilegame.entities.creatures.Player;
import tilegame.gfx.Assets;
import tilegame.tile.Tile;
import tilegame.worlds.World;

public class GameState extends State{
    
    private Player player;
    private World world;
    public GameState(Handler handler) {
        super(handler);
        world = new World(handler, "res/worlds/world1.txt");
        handler.setWorld(world);
        player = new Player(handler, 175, 175);
        

    }
    
    @Override
    public void tick() {
        world.tick();
        player.tick();
    }
    
    @Override
    public void render(Graphics g) {
        world.render(g);
        player.render(g);
    }
}
