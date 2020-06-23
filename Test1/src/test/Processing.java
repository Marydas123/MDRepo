package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.net.URISyntaxException;
import java.net.URL;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.converter.DefaultJobParametersConverter;
import org.springframework.batch.core.converter.JobParametersConverter;
import org.springframework.util.StringUtils;


public class Processing {
	private static String pathFile ="/config/file/BatchJob.json";
	
	public static void doProcess(String [] args) {
		
		JobParametersConverter jobparameterConverter = new DefaultJobParametersConverter();
		JobParameters batchparameters = jobparameterConverter.getJobParameters(StringUtils.splitArrayElementsIntoProperties(args, "="));
		String batchName = batchparameters.getString("Batchname");
		Processing process = new Processing();
		process.loadInitialValue(batchName);
		System.out.println(batchName);
	}

	public  void loadInitialValue(String batchname) {
		final String Job_Name ="JobName";
		JSONParser parser = new JSONParser();
		URL url = this.getClass().getResource(pathFile);
		File file;
		try {
			file = new File(url.toURI());
			FileReader  reader= new FileReader(file);
			JSONObject object = (JSONObject) parser.parse(reader);
			JSONObject batch = (JSONObject) object.get(batchname);
			String cxmlname = (String) batch.get("batchName");

			System.out.println(cxmlname);
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
	
}
