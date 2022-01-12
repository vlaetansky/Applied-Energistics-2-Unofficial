package appeng.client.render;

import appeng.api.util.DimensionalCoord;

// taken from McJty's McJtyLib
public class BlockPosHighlighter
{
    private static DimensionalCoord hilightedBlock;
    private static long expireHilight;

    public static void hilightBlock(DimensionalCoord c, long expireHilight) {
        hilightedBlock = c;
        BlockPosHighlighter.expireHilight = expireHilight;
    }

    public static DimensionalCoord getHilightedBlock() {
        return hilightedBlock;
    }

    public static long getExpireHilight() {
        return expireHilight;
    }
}
