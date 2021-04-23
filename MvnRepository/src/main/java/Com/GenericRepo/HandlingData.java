package Com.GenericRepo;

import java.io.FileInputStream;
import java.util.Properties;

public class HandlingData 
{
	public String readdata(String key) throws Exception 
	{
		FileInputStream fil = new FileInputStream(Papa.prppath);
		Properties pj = new Properties();
        pj.load(fil);
		return pj.getProperty(key);
	}
}
