package dretax.nosecandy.crops;

import dretax.nosecandy.NoseCandy;
import org.getspout.spoutapi.block.design.BlockDesign;
import org.getspout.spoutapi.block.design.GenericBlockDesign;
import org.getspout.spoutapi.block.design.Quad;
import org.getspout.spoutapi.block.design.Texture;

public class CropDesign extends GenericBlockDesign
{
  public CropDesign(NoseCandy plugin, Texture texture, int[] textureId)
  {
    setTexture(plugin, texture.getTexture()).setMinBrightness(1.0F).setMaxBrightness(1.0F);
    setQuadNumber(6);
    setBoundingBox(0.0F, 0.0F, 0.0F, 0.15F, 0.6F, 0.6F);

    Quad bottom = new Quad(0, texture.getSubTexture(textureId[0]));
    bottom.addVertex(0, 0.0F, 1.0F, 0.0F);
    bottom.addVertex(1, 0.0F, 0.0F, 0.0F);
    bottom.addVertex(2, 1.0F, 0.0F, 0.0F);
    bottom.addVertex(3, 1.0F, 1.0F, 0.0F);

    Quad side1 = new Quad(1, texture.getSubTexture(textureId[0]));
    side1.addVertex(0, 0.4F, 0.4F, 0.0F);
    side1.addVertex(1, 0.4F, 0.4F, 0.4F);
    side1.addVertex(2, 0.6F, 0.6F, 0.4F);
    side1.addVertex(3, 0.6F, 0.6F, 0.0F);

    Quad side2 = new Quad(1, texture.getSubTexture(textureId[0]));
    side1.addVertex(0, 0.4F, 0.4F, 0.0F);
    side1.addVertex(1, 0.4F, 0.4F, 0.4F);
    side1.addVertex(2, 0.6F, 0.6F, 0.4F);
    side1.addVertex(3, 0.6F, 0.6F, 0.0F);

    Quad side3 = new Quad(1, texture.getSubTexture(textureId[0]));
    side1.addVertex(0, 0.4F, 0.4F, 0.0F);
    side1.addVertex(1, 0.4F, 0.4F, 0.4F);
    side1.addVertex(2, 0.6F, 0.6F, 0.4F);
    side1.addVertex(3, 0.6F, 0.6F, 0.0F);

    Quad side4 = new Quad(1, texture.getSubTexture(textureId[0]));
    side1.addVertex(0, 0.4F, 0.4F, 0.0F);
    side1.addVertex(1, 0.4F, 0.4F, 0.4F);
    side1.addVertex(2, 0.6F, 0.6F, 0.4F);
    side1.addVertex(3, 0.6F, 0.6F, 0.0F);

    Quad top = new Quad(1, texture.getSubTexture(textureId[0]));
    side1.addVertex(0, 0.4F, 0.4F, 0.0F);
    side1.addVertex(1, 0.4F, 0.4F, 0.4F);
    side1.addVertex(2, 0.6F, 0.6F, 0.4F);
    side1.addVertex(3, 0.6F, 0.6F, 0.0F);
  }
}