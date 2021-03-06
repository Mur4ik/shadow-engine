package net.fourbytes.shadow.blocks;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.Array;
import net.fourbytes.shadow.Block;
import net.fourbytes.shadow.Coord;
import net.fourbytes.shadow.Images;
import net.fourbytes.shadow.Shadow;
import net.fourbytes.shadow.map.IsSaveable;

public class BlockGrass extends BlockType {

	public TextureRegion tex;

	@IsSaveable
	public int hasGrassTop = -1;

	public BlockGrass() {
	}
	
	@Override
	public TextureRegion getTexture(int id) {
		return tex == null ? tex = Images.getTextureRegion("block_grass") : tex;
	}

	@Override
	public void init() {
		dynamic = false;
		blending = false;
		if (hasGrassTop == -1) {
			hasGrassTop = Shadow.rand.nextInt(3);
		}
		if (hasGrassTop == 0) {
			Array<Block> blocks = layer.get(Coord.get(pos.x, pos.y-1f));
			if (blocks == null || blocks.size == 0) {
				Block grasstop = BlockType.getInstance("BlockGrassTop", pos.x, pos.y-1f, layer);
				grasstop.layer.add(grasstop);
			}
		}
	}
	
}
