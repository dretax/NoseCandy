package dretax.nosecandy.addiction;

import java.util.Random;

import org.bukkit.event.EventHandler;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.getspout.spoutapi.material.MaterialData;

public class Addict {
	Random r = new Random();
	private int cocaineUsage;
	private int cocaineAddiction;
	private int weedUsage;
	private int weedAddiction;
	private int heroinUsage;
	private int heroinAddiction;
	private int vodkaUsage;
	private int vodkaAddiction;
	private int GarrusPlateAddiction;
	private int GarrusPlateUsage;
	private int MagicMushroomAddiction;
	private int MagicMushroomUsage;
	private int BluePoisonAddiction;
	private int BluePoisonUsage;
	private int RoyalAddiction;
	private int RoyalUsage;
	private int AdderalAddiction;
	private int AdderalUsage;
	private int BorsodiAddiction;
	private int BorsodiUsage;
	private int SzoloAddiction;
	private int SzoloUsage;
	private int TokajiAddiction;
	private int TokajiUsage;
	private String name;

	public Addict(String player) {
		this.name = player;
	}

	public String getName() {
		return this.name;
	}

	public void newAddict() {
		this.cocaineUsage = 0;
		this.cocaineAddiction = 0;
		this.weedUsage = 0;
		this.weedAddiction = 0;
		this.heroinUsage = 0;
		this.heroinAddiction = 0;
		this.vodkaUsage = 0;
		this.vodkaAddiction = 0;
		this.GarrusPlateUsage = 0;
		this.GarrusPlateAddiction = 0;
		this.MagicMushroomUsage = 0;
		this.MagicMushroomAddiction = 0;
		this.BluePoisonUsage = 0;
		this.BluePoisonAddiction = 0;
		this.RoyalUsage = 0;
		this.RoyalAddiction = 0;
		this.BorsodiUsage = 0;
		this.BorsodiAddiction = 0;
		this.AdderalUsage = 0;
		this.AdderalAddiction = 0;
		this.SzoloUsage = 0;
		this.SzoloAddiction = 0;
		this.TokajiUsage = 0;
		this.TokajiAddiction = 0;
	}

	public int getCocaineUse() {
		return this.cocaineUsage;
	}

	public void useCocaine() {
		this.cocaineUsage += 1;
		if (this.r.nextInt(3) == 1)
			this.cocaineAddiction += 1;
	}

	public int getCocaineAddiction() {
		return this.cocaineAddiction;
	}

	public void lowerCocaineAddiction() {
		if (this.cocaineAddiction > 1)
			this.cocaineAddiction -= 1;
	}

	public void setInfo(int cu, int ca, int wu, int wa, int hu, int ha, int vu,
			int va, int mu, int ma, int bu, int ba, int gu, int ga, int bou, int boa,
			int adu, int ada, int ru, int ra, int szu, int sza, int tou, int toa) {
		this.cocaineUsage = cu;
		this.cocaineAddiction = ca;
		this.weedUsage = wu;
		this.weedAddiction = wa;
		this.heroinUsage = hu;
		this.heroinAddiction = ha;
		this.vodkaUsage = vu;
		this.vodkaAddiction = va;
		this.MagicMushroomUsage = mu;
		this.MagicMushroomAddiction = ma;
		this.BluePoisonUsage = bu;
		this.BluePoisonAddiction = ba;
		this.BorsodiUsage = bou;
		this.BorsodiAddiction = boa;
		this.AdderalUsage = adu;
		this.AdderalAddiction = ada;
		this.RoyalUsage = ru;
		this.RoyalAddiction = ra;
		this.SzoloUsage = szu;
		this.SzoloAddiction = sza;
		this.TokajiUsage = tou;
		this.TokajiAddiction = toa;
		this.GarrusPlateUsage = gu;
		this.GarrusPlateAddiction = ga;
	}

	public int getWeedUse() {
		return this.weedUsage;
	}

	public void useWeed() {
		this.weedUsage += 1;
		if (this.r.nextInt(3) == 1)
			this.weedAddiction += 1;
	}

	public int getWeedAddiction() {
		return this.weedAddiction;
	}

	public void lowerWeedAddiction() {
		if (this.weedAddiction > 1)
			this.weedAddiction -= 1;
	}

	public int getHeroinUse() {
		return this.heroinUsage;
	}

	public void useHeroin() {
		this.heroinUsage += 1;
		if (this.r.nextInt(2) == 1)
			this.heroinAddiction += 1;
	}

	public int getHeroinAddiction() {
		return this.heroinAddiction;
	}

	public void lowerHeroinAddiction() {
		if (this.heroinAddiction > 1)
			this.heroinAddiction -= 1;
	}

	public int getVodkaUse() {
		return this.vodkaUsage;
	}

	public void useVodka() {
		this.vodkaUsage += 1;
		if (this.r.nextInt(2) == 1)
			this.vodkaAddiction += 1;
	}

	public int getVodkaAddiction() {
		return this.vodkaAddiction;
	}

	public void lowerVodkaAddiction() {
		if (this.vodkaAddiction > 1)
			this.vodkaAddiction -= 1;
	}

	public int getGarrusPlateUse() {
		return this.GarrusPlateUsage;
	}

	public void useGarrusPlate() {
		this.GarrusPlateUsage += 1;
		if (this.r.nextInt(3) == 1)
			this.GarrusPlateAddiction += 1;

	}

	public int getGarrusPlateAddiction() {
		return this.GarrusPlateAddiction;
	}

	public void lowerGarrusPlateAddiction() {
		if (this.GarrusPlateAddiction > 1)
			this.GarrusPlateAddiction -= 1;
	}

	public int getMagicMushroomUse() {
		return this.MagicMushroomUsage;
	}

	public void useMagicMushroom() {
		this.MagicMushroomUsage += 1;
		if (this.r.nextInt(3) == 1)
			this.MagicMushroomAddiction += 1;

	}

	public int getMagicMushroomAddiction() {
		return this.MagicMushroomAddiction;
	}

	public void lowerMagicMushroomAddiction() {
		if (this.MagicMushroomAddiction > 1)
			this.MagicMushroomAddiction -= 1;
	}

	public int getBluePoisonUse() {
		return this.BluePoisonUsage;
	}

	public void useBluePoison() {
		this.BluePoisonUsage += 1;
		if (this.r.nextInt(3) == 1)
			this.BluePoisonAddiction += 1;

	}

	public int getBluePoisonAddiction() {
		return this.BluePoisonAddiction;
	}

	public void lowerBluePoisonAddiction() {
		if (this.BluePoisonAddiction > 1)
			this.BluePoisonAddiction -= 1;
	}
	
	//NEW DRUGS FROM HERE 2013.02.19 (Reminding)
	
	public int getRoyalUse() {
		return this.RoyalUsage;
	}

	public void useRoyal() {
		this.RoyalUsage += 1;
		if (this.r.nextInt(3) == 1)
			this.RoyalAddiction += 1;

	}

	public int getRoyalAddiction() {
		return this.RoyalAddiction;
	}

	public void lowerRoyalAddiction() {
		if (this.RoyalAddiction > 1)
			this.RoyalAddiction -= 1;
	}
	
	public int getAdderalUse() {
		return this.AdderalUsage;
	}

	public void useAdderal() {
		this.AdderalUsage += 1;
		if (this.r.nextInt(3) == 1)
			this.AdderalAddiction += 1;

	}

	public int getAdderalAddiction() {
		return this.AdderalAddiction;
	}

	public void lowerAdderalAddiction() {
		if (this.AdderalAddiction > 1)
			this.AdderalAddiction -= 1;
	}
	
	public int getSzoloUse() {
		return this.SzoloUsage;
	}

	public void useSzolo() {
		this.SzoloUsage += 1;
		if (this.r.nextInt(3) == 1)
			this.SzoloAddiction += 1;

	}

	public int getSzoloAddiction() {
		return this.SzoloAddiction;
	}

	public void lowerSzoloAddiction() {
		if (this.SzoloAddiction > 1)
			this.SzoloAddiction -= 1;
	}
	
	public int getTokajiUse() {
		return this.TokajiUsage;
	}

	public void useTokaji() {
		this.TokajiUsage += 1;
		if (this.r.nextInt(3) == 1)
			this.TokajiAddiction += 1;

	}

	public int getTokajiAddiction() {
		return this.TokajiAddiction;
	}

	public void lowerTokajiAddiction() {
		if (this.TokajiAddiction > 1)
			this.TokajiAddiction -= 1;
	}
	
	public int getBorsodiUse() {
		return this.BorsodiUsage;
	}

	public void useBorsodi() {
		this.BorsodiUsage += 1;
		if (this.r.nextInt(3) == 1)
			this.BorsodiAddiction += 1;

	}

	public int getBorsodiAddiction() {
		return this.BorsodiAddiction;
	}

	public void lowerBorsodiAddiction() {
		if (this.BorsodiAddiction > 1)
			this.BorsodiAddiction -= 1;
	}

	@EventHandler
	public void onDrinkMilk(PlayerInteractEvent event) {
		if ((event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) && event.getPlayer().getItemInHand() == MaterialData.milk) {
			if (this.BluePoisonAddiction > 1)
				this.BluePoisonAddiction -= 1;
			if (this.MagicMushroomAddiction > 1)
				this.MagicMushroomAddiction -= 1;
			if (this.GarrusPlateAddiction > 1)
				this.GarrusPlateAddiction -= 1;
			if (this.vodkaAddiction > 1)
				this.vodkaAddiction -= 1;
			if (this.heroinAddiction > 1)
				this.heroinAddiction -= 1;
			if (this.weedAddiction > 1)
				this.weedAddiction -= 1;
			if (this.AdderalAddiction > 1)
				this.AdderalAddiction -= 1;
			if (this.BorsodiAddiction > 1)
				this.BorsodiAddiction -= 1;
			if (this.RoyalAddiction > 1)
				this.RoyalAddiction -= 1;
			if (this.SzoloAddiction > 1)
				this.SzoloAddiction -= 1;
			if (this.TokajiAddiction > 1)
				this.TokajiAddiction -= 1;
		}
	}

	public void setInfo(int int1, int int2, int int3, int int4, int int5,
			int int6, int int7, int int8, int int9, int int10, int int11,
			int int12, int int13) {
		// TODO Auto-generated method stub
		
	}
}