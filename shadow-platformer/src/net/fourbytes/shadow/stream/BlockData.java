package net.fourbytes.shadow.stream;

import net.fourbytes.shadow.Entity;
import net.fourbytes.shadow.GameObject;
import net.fourbytes.shadow.Block;

/**
 * BlockData contains all needed {@link Data} to send {@link Block}s thru {@link IStream}s.
 */
public class BlockData extends GameObjectData<Block> {

	public BlockData() {
		super();
	}

	@Override
	public GameObjectData<Block> pack(Block go) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GameObject unpack() {
		// TODO Auto-generated method stub
		return null;
	}

}