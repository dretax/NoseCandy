package dretax.nosecandy.paraphernalia;

import dretax.nosecandy.Config;
import dretax.nosecandy.NoseCandy;

public class EmptyBong extends BaseParaphernalia
{
  public EmptyBong(NoseCandy plugin)
  {
    super(NoseCandy.instance, Config.emptyBongName, Config.emptyBongTex);
  }
}