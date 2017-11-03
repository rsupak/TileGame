package tilegame.tile;

import java.awt.image.BufferedImage;
import tilegame.gfx.Assets;

public class StumpTile extends Tile{
    
    public StumpTile(int id) {
        super(Assets.stump, id);
    }
    
    @Override
    public boolean isSolid() {
        return true;
    }
}
