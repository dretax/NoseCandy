package dretax.nosecandy;

import org.bukkit.inventory.ItemStack;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.inventory.MaterialManager;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.inventory.SpoutShapedRecipe;
import org.getspout.spoutapi.material.MaterialData;
import org.bukkit.entity.Item;
import dretax.nosecandy.drugs.*;

public class CraftingRecipe
{
  NoseCandy plugin;

  public CraftingRecipe(NoseCandy plugin)
  {
    loadRecipes();
  }

  public void loadRecipes()
  {
    ItemStack result = new SpoutItemStack(Items.spliff, 1);
    SpoutShapedRecipe recipe = new SpoutShapedRecipe(result);
    recipe.shape(new String[] { "a", "b" });
    recipe.setIngredient('b', Items.rollingPapers);
    recipe.setIngredient('a', Items.weed);
    SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);

    ItemStack res1 = new SpoutItemStack(Items.glassPipe, 4);
    SpoutShapedRecipe rec1 = new SpoutShapedRecipe(res1);
    rec1.shape(new String[] { "AA" });
    rec1.setIngredient('A', MaterialData.glass);
    SpoutManager.getMaterialManager().registerSpoutRecipe(rec1);

    ItemStack res2 = new SpoutItemStack(Items.rollingPapers, 2);
    SpoutShapedRecipe rec2 = new SpoutShapedRecipe(res2);
    rec2.shape(new String[] { "A", "A" });
    rec2.setIngredient('A', MaterialData.paper);
    SpoutManager.getMaterialManager().registerSpoutRecipe(rec2);

    ItemStack res3 = new SpoutItemStack(Items.emptyBong, 1);
    SpoutShapedRecipe rec3 = new SpoutShapedRecipe(res3);
    rec3.shape(new String[] { "AB" });
    rec3.setIngredient('A', MaterialData.glassBottle);
    rec3.setIngredient('B', Items.glassPipe);
    SpoutManager.getMaterialManager().registerSpoutRecipe(rec3);

    ItemStack res4 = new SpoutItemStack(Items.emptySyringe, 1);
    SpoutShapedRecipe rec4 = new SpoutShapedRecipe(res4);
    rec4.shape(new String[] { "A", "B" });
    rec4.setIngredient('B', Items.glassPipe);
    rec4.setIngredient('A', MaterialData.ironIngot);
    SpoutManager.getMaterialManager().registerSpoutRecipe(rec4);

    ItemStack res5 = new SpoutItemStack(Items.loadedBong, 1);
    SpoutShapedRecipe rec5 = new SpoutShapedRecipe(res5);
    rec5.shape(new String[] { "A", "B" });
    rec5.setIngredient('B', Items.emptyBong);
    rec5.setIngredient('A', Items.weed);
    SpoutManager.getMaterialManager().registerSpoutRecipe(rec5);

    ItemStack res6 = new SpoutItemStack(Items.fertilizer, 2);
    SpoutShapedRecipe rec6 = new SpoutShapedRecipe(res6);
    rec6.shape(new String[] { "ABA", "CCC" });
    rec6.setIngredient('A', MaterialData.wheat);
    rec6.setIngredient('B', MaterialData.sugar);
    rec6.setIngredient('C', MaterialData.dirt);
    SpoutManager.getMaterialManager().registerSpoutRecipe(rec6);
    
    ItemStack res7 = new SpoutItemStack(Items.heroinSyringe, 1);
    SpoutShapedRecipe rec7 = new SpoutShapedRecipe(res7);
    rec7.shape(new String[] { "A", "B" });
    rec7.setIngredient('B', Items.heroin);
    rec7.setIngredient('A', Items.emptySyringe);
    SpoutManager.getMaterialManager().registerSpoutRecipe(rec7);
    
    ItemStack res8 = new SpoutItemStack(Items.MagicMushroom, 1);
    SpoutShapedRecipe rec8 = new SpoutShapedRecipe(res8);
    rec8.shape(new String[] { "A", "B" });
    rec8.setIngredient('B', MaterialData.brownMushroom);
    rec8.setIngredient('A', Items.BluePoison);
    SpoutManager.getMaterialManager().registerSpoutRecipe(rec8);
    
    ItemStack res9 = new SpoutItemStack(Items.Szolo, 1);
    SpoutShapedRecipe rec9 = new SpoutShapedRecipe(res9);
    rec9.shape(new String[] { "A"});
    rec9.setIngredient('A', MaterialData.vines);
    SpoutManager.getMaterialManager().registerSpoutRecipe(rec9);
    
    ItemStack res10 = new SpoutItemStack(Items.BluePoison, 1);
    SpoutShapedRecipe rec10 = new SpoutShapedRecipe(res10);
    rec10.shape(new String[] { "A", "B", "C"});
    rec10.setIngredient('A', MaterialData.waterBottle);
    rec10.setIngredient('B', MaterialData.lapisLazuli);
    rec10.setIngredient('C', MaterialData.spiderEye);
    SpoutManager.getMaterialManager().registerSpoutRecipe(rec10);
    
    ItemStack res11 = new SpoutItemStack(Items.Borsodi, 1);
    SpoutShapedRecipe rec11 = new SpoutShapedRecipe(res11);
    rec11.shape(new String[] { "A", "B", "C"});
    rec11.setIngredient('A', Items.Komlo);
    rec11.setIngredient('B', MaterialData.waterBottle);
    rec11.setIngredient('C', MaterialData.sugar);
    SpoutManager.getMaterialManager().registerSpoutRecipe(rec11);
    
    ItemStack res12 = new SpoutItemStack(Items.Komlo, 1);
    SpoutShapedRecipe rec12 = new SpoutShapedRecipe(res12);
    rec12.shape(new String[] { "A", "B", "C"});
    rec12.setIngredient('A', MaterialData.wheat);
    rec12.setIngredient('B', MaterialData.tallGrass);
    rec12.setIngredient('C', MaterialData.fern);
    SpoutManager.getMaterialManager().registerSpoutRecipe(rec12);
    
    ItemStack res13 = new SpoutItemStack(Items.Royal, 1);
    SpoutShapedRecipe rec13 = new SpoutShapedRecipe(res13);
    rec13.shape(new String[] { "A", "B", "C"});
    rec13.setIngredient('A', MaterialData.wheat);
    rec13.setIngredient('B', MaterialData.waterBottle);
    rec13.setIngredient('C', MaterialData.potatoitem);
    SpoutManager.getMaterialManager().registerSpoutRecipe(rec13);
    
    ItemStack res14 = new SpoutItemStack(Items.Tokaji, 1);
    SpoutShapedRecipe rec14 = new SpoutShapedRecipe(res14);
    rec14.shape(new String[] { "A", "B", "C"});
    rec14.setIngredient('A', Items.Szolo);
    rec14.setIngredient('B', MaterialData.sugar);
    rec14.setIngredient('C', MaterialData.waterBottle);
    SpoutManager.getMaterialManager().registerSpoutRecipe(rec14);
  }
}