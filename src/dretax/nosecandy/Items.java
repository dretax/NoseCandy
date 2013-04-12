package dretax.nosecandy;

import dretax.nosecandy.drugs.*;
import dretax.nosecandy.paraphernalia.EmptyBong;
import dretax.nosecandy.paraphernalia.EmptySyringe;
import dretax.nosecandy.paraphernalia.Fertilizer;
import dretax.nosecandy.paraphernalia.GlassPipe;
import dretax.nosecandy.paraphernalia.HeroinSyringe;
import dretax.nosecandy.paraphernalia.LoadedBong;
import dretax.nosecandy.paraphernalia.RollingPapers;

public class Items
{
  public static EmptyBong emptyBong;
  public static LoadedBong loadedBong;
  public static EmptySyringe emptySyringe;
  public static HeroinSyringe heroinSyringe;
  public static RollingPapers rollingPapers;
  public static Cocaine cocaine;
  public static Weed weed;
  public static Spliff spliff;
  public static GlassPipe glassPipe;
  public static Heroin heroin;
  public static Vodka vodka;
  public static Fertilizer fertilizer;
  public static GarrusPlate GarrusPlate;
  public static BluePoison BluePoison;
  public static MagicMushroom MagicMushroom;
  public static Royal Royal;
  public static Adderal Adderal;
  public static Borsodi Borsodi;
  public static Szolo Szolo;
  public static Tokaji Tokaji;
  public static Komlo Komlo;

  public Items()
  {
    emptyBong = new EmptyBong(NoseCandy.instance);
    loadedBong = new LoadedBong(NoseCandy.instance);
    emptySyringe = new EmptySyringe(NoseCandy.instance);
    heroinSyringe = new HeroinSyringe(NoseCandy.instance);
    rollingPapers = new RollingPapers(NoseCandy.instance);
    cocaine = new Cocaine(NoseCandy.instance);
    weed = new Weed(NoseCandy.instance);
    spliff = new Spliff(NoseCandy.instance);
    glassPipe = new GlassPipe(NoseCandy.instance);
    heroin = new Heroin(NoseCandy.instance);
    vodka = new Vodka(NoseCandy.instance);
    fertilizer = new Fertilizer(NoseCandy.instance);
    GarrusPlate = new GarrusPlate(NoseCandy.instance);
    MagicMushroom = new MagicMushroom(NoseCandy.instance);
    BluePoison = new BluePoison(NoseCandy.instance);
    Adderal = new Adderal(NoseCandy.instance);
    Borsodi = new Borsodi(NoseCandy.instance);
    Royal = new Royal(NoseCandy.instance);
    Szolo = new Szolo(NoseCandy.instance);
    Tokaji = new Tokaji(NoseCandy.instance);
    Komlo = new Komlo(NoseCandy.instance);
  }
}