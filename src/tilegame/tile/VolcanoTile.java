package tilegame.tile;

import tilegame.gfx.Assets;

public class VolcanoTile extends Tile{
    
    public VolcanoTile(int id) {
        super(Assets.volcano, id);
    }
    
    @Override
    public boolean isSolid() {
        return true;
    }
}
