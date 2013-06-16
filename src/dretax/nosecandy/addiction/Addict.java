package dretax.nosecandy.addiction;

import java.util.Random;

public class Addict {
	Random r = new Random();
	public static int cocaineUsage;
	public static int cocaineAddiction;
	public static int weedUsage;
	public static int weedAddiction;
	public static int heroinUsage;
	public static int heroinAddiction;
	public static int vodkaUsage;
	public static int vodkaAddiction;
	public static int GarrusPlateAddiction;
	public static int GarrusPlateUsage;
	public static int MagicMushroomAddiction;
	public static int MagicMushroomUsage;
	public static int BluePoisonAddiction;
	public static int BluePoisonUsage;
	public static int RoyalAddiction;
	public static int RoyalUsage;
	public static int AdderalAddiction;
	public static int AdderalUsage;
	public static int BorsodiAddiction;
	public static int BorsodiUsage;
	public static int SzoloAddiction;
	public static int SzoloUsage;
	public static int TokajiAddiction;
	public static int TokajiUsage;
	//2013.04.12
	public static int LSDAddiction;
	public static int LSDUsage;
	public static int MethAddiction;
	public static int MethUsage;
	public static int EcstacyAddiction;
	public static int EcstacyUsage;
	//2013.06.16
	public static int JDBAddiction;
	public static int JDBUsage;
	public static int JDOAddiction;
	public static int JDOUsage;
	protected String name;

	public Addict(String player) {
		this.name = player;
	}

	public String getName() {
		return this.name;
	}

	public void newAddict() {
		Addict.cocaineUsage = 0;
		Addict.cocaineAddiction = 0;
		Addict.weedUsage = 0;
		Addict.weedAddiction = 0;
		Addict.heroinUsage = 0;
		Addict.heroinAddiction = 0;
		Addict.vodkaUsage = 0;
		Addict.vodkaAddiction = 0;
		Addict.GarrusPlateUsage = 0;
		Addict.GarrusPlateAddiction = 0;
		Addict.MagicMushroomUsage = 0;
		Addict.MagicMushroomAddiction = 0;
		Addict.BluePoisonUsage = 0;
		Addict.BluePoisonAddiction = 0;
		Addict.RoyalUsage = 0;
		Addict.RoyalAddiction = 0;
		Addict.BorsodiUsage = 0;
		Addict.BorsodiAddiction = 0;
		Addict.AdderalUsage = 0;
		Addict.AdderalAddiction = 0;
		Addict.SzoloUsage = 0;
		Addict.SzoloAddiction = 0;
		Addict.TokajiUsage = 0;
		Addict.TokajiAddiction = 0;
		//2013.04.12
		Addict.LSDUsage = 0;
		Addict.LSDAddiction = 0;
		Addict.MethUsage = 0;
		Addict.MethAddiction = 0;
		Addict.EcstacyUsage = 0;
		Addict.EcstacyAddiction = 0;
		//2013.06.16
		Addict.JDOUsage = 0;
		Addict.JDOAddiction = 0;
		Addict.JDBUsage = 0;
		Addict.JDBAddiction = 0;
	}

	public int getCocaineUse() {
		return Addict.cocaineUsage;
	}

	public void useCocaine() {
		Addict.cocaineUsage += 1;
		if (this.r.nextInt(3) == 1)
			Addict.cocaineAddiction += 1;
	}

	public int getCocaineAddiction() {
		return Addict.cocaineAddiction;
	}

	public void lowerCocaineAddiction() {
		if (Addict.cocaineAddiction > 1)
			Addict.cocaineAddiction -= 1;
	}

	public void setInfo(int cu, int ca, int wu, int wa, int hu, int ha, int vu,
			int va, int mu, int ma, int bu, int ba, int gu, int ga, int bou, int boa,
			int adu, int ada, int ru, int ra, int szu, int sza, int tou, int toa, int ecsa,
			int ecsu, int lsda, int lsdu, int metha, int methu, int jdbu, int jdba, int jdou, int jdoa) {
		Addict.cocaineUsage = cu;
		Addict.cocaineAddiction = ca;
		Addict.weedUsage = wu;
		Addict.weedAddiction = wa;
		Addict.heroinUsage = hu;
		Addict.heroinAddiction = ha;
		Addict.vodkaUsage = vu;
		Addict.vodkaAddiction = va;
		Addict.MagicMushroomUsage = mu;
		Addict.MagicMushroomAddiction = ma;
		Addict.BluePoisonUsage = bu;
		Addict.BluePoisonAddiction = ba;
		Addict.BorsodiUsage = bou;
		Addict.BorsodiAddiction = boa;
		Addict.AdderalUsage = adu;
		Addict.AdderalAddiction = ada;
		Addict.RoyalUsage = ru;
		Addict.RoyalAddiction = ra;
		Addict.SzoloUsage = szu;
		Addict.SzoloAddiction = sza;
		Addict.TokajiUsage = tou;
		Addict.TokajiAddiction = toa;
		Addict.GarrusPlateUsage = gu;
		Addict.GarrusPlateAddiction = ga;
		//2013.04.12
		Addict.MethUsage = methu;
		Addict.MethAddiction = metha;
		Addict.LSDUsage = lsdu;
		Addict.LSDAddiction = lsda;
		Addict.EcstacyUsage = ecsu;
		Addict.EcstacyAddiction = ecsa;
		//2013.06.16
		Addict.JDOUsage = jdou;
		Addict.JDOAddiction = jdoa;
		Addict.JDBUsage = jdbu;
		Addict.JDBAddiction = jdba;
	}

	public int getWeedUse() {
		return Addict.weedUsage;
	}

	public void useWeed() {
		Addict.weedUsage += 1;
		if (this.r.nextInt(3) == 1)
			Addict.weedAddiction += 1;
	}

	public int getWeedAddiction() {
		return Addict.weedAddiction;
	}

	public void lowerWeedAddiction() {
		if (Addict.weedAddiction > 1)
			Addict.weedAddiction -= 1;
	}

	public int getHeroinUse() {
		return Addict.heroinUsage;
	}

	public void useHeroin() {
		Addict.heroinUsage += 1;
		if (this.r.nextInt(2) == 1)
			Addict.heroinAddiction += 1;
	}

	public int getHeroinAddiction() {
		return Addict.heroinAddiction;
	}

	public void lowerHeroinAddiction() {
		if (Addict.heroinAddiction > 1)
			Addict.heroinAddiction -= 1;
	}

	public int getVodkaUse() {
		return Addict.vodkaUsage;
	}

	public void useVodka() {
		Addict.vodkaUsage += 1;
		if (this.r.nextInt(2) == 1)
			Addict.vodkaAddiction += 1;
	}

	public int getVodkaAddiction() {
		return Addict.vodkaAddiction;
	}

	public void lowerVodkaAddiction() {
		if (Addict.vodkaAddiction > 1)
			Addict.vodkaAddiction -= 1;
	}

	public int getGarrusPlateUse() {
		return Addict.GarrusPlateUsage;
	}

	public void useGarrusPlate() {
		Addict.GarrusPlateUsage += 1;
		if (this.r.nextInt(3) == 1)
			Addict.GarrusPlateAddiction += 1;

	}

	public int getGarrusPlateAddiction() {
		return Addict.GarrusPlateAddiction;
	}

	public void lowerGarrusPlateAddiction() {
		if (Addict.GarrusPlateAddiction > 1)
			Addict.GarrusPlateAddiction -= 1;
	}

	public int getMagicMushroomUse() {
		return Addict.MagicMushroomUsage;
	}

	public void useMagicMushroom() {
		Addict.MagicMushroomUsage += 1;
		if (this.r.nextInt(3) == 1)
			Addict.MagicMushroomAddiction += 1;

	}

	public int getMagicMushroomAddiction() {
		return Addict.MagicMushroomAddiction;
	}

	public void lowerMagicMushroomAddiction() {
		if (Addict.MagicMushroomAddiction > 1)
			Addict.MagicMushroomAddiction -= 1;
	}

	public int getBluePoisonUse() {
		return Addict.BluePoisonUsage;
	}

	public void useBluePoison() {
		Addict.BluePoisonUsage += 1;
		if (this.r.nextInt(3) == 1)
			Addict.BluePoisonAddiction += 1;

	}

	public int getBluePoisonAddiction() {
		return Addict.BluePoisonAddiction;
	}

	public void lowerBluePoisonAddiction() {
		if (Addict.BluePoisonAddiction > 1)
			Addict.BluePoisonAddiction -= 1;
	}
	
	//NEW DRUGS FROM HERE 2013.02.19 (Reminding)
	
	public int getRoyalUse() {
		return Addict.RoyalUsage;
	}

	public void useRoyal() {
		Addict.RoyalUsage += 1;
		if (this.r.nextInt(3) == 1)
			Addict.RoyalAddiction += 1;

	}

	public int getRoyalAddiction() {
		return Addict.RoyalAddiction;
	}

	public void lowerRoyalAddiction() {
		if (Addict.RoyalAddiction > 1)
			Addict.RoyalAddiction -= 1;
	}
	
	public int getAdderalUse() {
		return Addict.AdderalUsage;
	}

	public void useAdderal() {
		Addict.AdderalUsage += 1;
		if (this.r.nextInt(3) == 1)
			Addict.AdderalAddiction += 1;

	}

	public int getAdderalAddiction() {
		return Addict.AdderalAddiction;
	}

	public void lowerAdderalAddiction() {
		if (Addict.AdderalAddiction > 1)
			Addict.AdderalAddiction -= 1;
	}
	
	public int getSzoloUse() {
		return Addict.SzoloUsage;
	}

	public void useSzolo() {
		Addict.SzoloUsage += 1;
		if (this.r.nextInt(3) == 1)
			Addict.SzoloAddiction += 1;

	}

	public int getSzoloAddiction() {
		return Addict.SzoloAddiction;
	}

	public void lowerSzoloAddiction() {
		if (Addict.SzoloAddiction > 1)
			Addict.SzoloAddiction -= 1;
	}
	
	public int getTokajiUse() {
		return Addict.TokajiUsage;
	}

	public void useTokaji() {
		Addict.TokajiUsage += 1;
		if (this.r.nextInt(3) == 1)
			Addict.TokajiAddiction += 1;

	}

	public int getTokajiAddiction() {
		return Addict.TokajiAddiction;
	}

	public void lowerTokajiAddiction() {
		if (Addict.TokajiAddiction > 1)
			Addict.TokajiAddiction -= 1;
	}
	
	public int getBorsodiUse() {
		return Addict.BorsodiUsage;
	}

	public void useBorsodi() {
		Addict.BorsodiUsage += 1;
		if (this.r.nextInt(3) == 1)
			Addict.BorsodiAddiction += 1;

	}

	public int getBorsodiAddiction() {
		return Addict.BorsodiAddiction;
	}

	public void lowerBorsodiAddiction() {
		if (Addict.BorsodiAddiction > 1)
			Addict.BorsodiAddiction -= 1;
	}
	
	/*
	 * 2013.04.12
	 */
	
	public int getLSDUse() {
		return Addict.LSDUsage;
	}

	public void useLSD() {
		Addict.LSDUsage += 1;
		if (this.r.nextInt(3) == 1)
			Addict.LSDAddiction += 1;

	}

	public int getLSDAddiction() {
		return Addict.LSDAddiction;
	}

	public void lowerLSDAddiction() {
		if (Addict.LSDAddiction > 1)
			Addict.LSDAddiction -= 1;
	}
	
	public int getMethUse() {
		return Addict.MethUsage;
	}

	public void useMeth() {
		Addict.MethUsage += 1;
		if (this.r.nextInt(3) == 1)
			Addict.MethAddiction += 1;

	}

	public int getMethAddiction() {
		return Addict.MethAddiction;
	}

	public void lowerMethAddiction() {
		if (Addict.MethAddiction > 1)
			Addict.MethAddiction -= 1;
	}
	
	public int getEcstacyUse() {
		return Addict.EcstacyUsage;
	}

	public void useEcstacy() {
		Addict.EcstacyUsage += 1;
		if (this.r.nextInt(3) == 1)
			Addict.EcstacyAddiction += 1;

	}

	public int getEcstacyAddiction() {
		return Addict.EcstacyAddiction;
	}

	public void lowerEcstacyAddiction() {
		if (Addict.EcstacyAddiction > 1)
			Addict.EcstacyAddiction -= 1;
	}
	
	/*
	 * 2013.06.16
	 */
	
	public int getJDOUse() {
		return Addict.JDOUsage;
	}

	public void useJDO() {
		Addict.JDOUsage += 1;
		if (this.r.nextInt(3) == 1)
			Addict.JDOAddiction += 1;

	}

	public int getJDOAddiction() {
		return Addict.JDOAddiction;
	}

	public void lowerJDOAddiction() {
		if (Addict.JDOAddiction > 1)
			Addict.JDOAddiction -= 1;
	}
	
	//VALASZTOVONAL
	
	public int getJDBUse() {
		return Addict.JDBUsage;
	}

	public void useJDB() {
		Addict.JDBUsage += 1;
		if (this.r.nextInt(3) == 1)
			Addict.JDBAddiction += 1;

	}

	public int getJDBAddiction() {
		return Addict.JDBAddiction;
	}

	public void lowerJDBAddiction() {
		if (Addict.JDBAddiction > 1)
			Addict.JDBAddiction -= 1;
	}
	
	public void setInfo(int int1, int int2, int int3, int int4, int int5,
			int int6, int int7, int int8, int int9, int int10, int int11,
			int int12, int int13, int int14, int int15, int int16, int int17, int int18) {
		// TODO Auto-generated method stub
		
	}
}