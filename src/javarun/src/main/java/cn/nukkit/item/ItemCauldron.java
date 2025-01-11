package cn.nukkit.item;

import cn.nukkit.block.Block;

/**
 * @author CreeperFace
 * Nukkit Project
 */
public class ItemCauldron extends Item {

    public ItemCauldron() {
        this(0, 1);
    }

    public ItemCauldron(Integer meta) {
        this(meta, 1);
    }

    public ItemCauldron(Integer meta, int count) {
        super(CAULDRON, meta, count, "Cauldron");
        this.block = Block.get(CAULDRON_BLOCK);
    }
}