package freshteam;

import com.aspose.words.Document;
import com.aspose.words.Metered;


public class PDFConversion
{
	static String public_key = "";
	static String private_key = "";

    public static void main( String[] args ) throws Exception
    {
      if(args.length > 2) {
        initializeKeys(args);
      	setLicense();
      }
    	String dataDir = args[0];
    	Doc2PDF(dataDir, args[1]);
    }

    public static void initializeKeys(String [] args) throws Exception {
    		public_key = args[2];
    		private_key = args[3];
    }

    public static void setLicense() throws Exception {
    	Metered m = new Metered();
    	m.setMeteredKey(public_key, private_key);
    	System.out.println("License set");
    }

    public static void Doc2PDF(String dataDir, String name) throws Exception {
        // Load the document from disk.
        Document doc = new Document(dataDir + name + ".docx" );

        // Save the document in PDF format.
        dataDir = dataDir + name +".pdf";
        doc.save(dataDir);
        System.out.println("\nDocument converted to PDF successfully.\nFile saved at " + dataDir);
    }

}
