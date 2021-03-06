package openblocks.common.block;

import openblocks.Config;
import openblocks.OpenBlocks;
import openblocks.common.tileentity.TileEntityAutoAnvil;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;

public class BlockAutoAnvil extends OpenBlock {

	public BlockAutoAnvil() {
		super(Config.blockAutoAnvilId, Material.anvil);
        setStepSound(soundAnvilFootstep);
		setupBlock(this, "autoanvil", TileEntityAutoAnvil.class);
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}

	@Override
	public boolean isBlockSolidOnSide(World world, int x, int y, int z, ForgeDirection side) {
		return false;
	}

	@Override
	public int getRenderType() {
		return OpenBlocks.renderId;
	}
}
