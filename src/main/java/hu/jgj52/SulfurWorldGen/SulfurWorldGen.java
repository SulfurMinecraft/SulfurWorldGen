package hu.jgj52.SulfurWorldGen;

import dev.sulfurmc.Sulfur.Utils.Plugin;
import hu.jgj52.SulfurWorldGen.Listeners.JoinListener;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.generator.UnitModifier;


import static dev.sulfurmc.Sulfur.Sulfur.ic;

public class SulfurWorldGen implements Plugin {
    @Override
    public void onEnable() {
        ic.setGenerator(unit -> {
            UnitModifier modifier = unit.modifier();
            modifier.fillHeight(-64, -60, Block.BEDROCK);
            modifier.fillHeight(-60, -2, Block.DEEPSLATE);
            modifier.fillHeight(-2, 58, Block.STONE);
            modifier.fillHeight(58, 62, Block.DIRT);
            modifier.fillHeight(62, 63, Block.GRASS_BLOCK);
        });

        new JoinListener();
    }

    @Override
    public void onDisable() {

    }
}
