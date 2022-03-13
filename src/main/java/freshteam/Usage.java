package freshteam;

import java.util.HashSet;
import com.aspose.words.Metered;

public class Usage {
	static String public_key = "";
	static String private_key = "";
	static HashSet<String> existingFonts;

	public static void main(String[] args) throws Exception {
		public_key = args[0];
		private_key = args[1];
		Metered m = new Metered();
		m.setMeteredKey(public_key, private_key);
		System.out.println("ASPOSE License is set");
		System.out.println("Freshteam ASPOSE Credit : {Metered.GetConsumptionCredit()}");
		System.out.println("Freshteam ASPOSE Consumption quantity : {Metered.GetConsumptionQuantity()}");

	}
}
