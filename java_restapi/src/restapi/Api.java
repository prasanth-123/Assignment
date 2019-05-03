package restapi;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


@Path("/getData")
public class Api {
	
	
	@GET 
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/json")
	public JSONObject sendJSONObject()
	{
		
		String resp=
				"{\n" + 
				"\n" + 
				"\"coord\": {\n" + 
				"\n" + 
				"\"lon\": -0.13,\n" + 
				"\n" + 
				"\"lat\": 51.51\n" + 
				"\n" + 
				"},\n" + 
				"\n" + 
				"\"weather\": [\n" + 
				"\n" + 
				"{\n" + 
				"\n" + 
				"\"id\": 701,\n" + 
				"\n" + 
				"\"main\": \"Mist\",\n" + 
				"\n" + 
				"\"description\": \"mist\",\n" + 
				"\n" + 
				"\"icon\": \"50n\"\n" + 
				"\n" + 
				"},\n" + 
				"\n" + 
				"{\n" + 
				"\n" + 
				"\"id\": 500,\n" + 
				"\n" + 
				"\"main\": \"Rain\",\n" + 
				"\n" + 
				"\"description\": \"light rain\",\n" + 
				"\n" + 
				"\"icon\": \"10n\"\n" + 
				"\n" + 
				"}\n" + 
				"\n" + 
				"],\n" + 
				"\n" + 
				"\"base\": \"stations\",\n" + 
				"\n" + 
				"\"main\": {\n" + 
				"\n" + 
				"\"temp\": 272.14,\n" + 
				"\n" + 
				"\"pressure\": 1016,\n" + 
				"\n" + 
				"\"humidity\": 74,\n" + 
				"\n" + 
				"\"temp_min\": 269.15,\n" + 
				"\n" + 
				"\"temp_max\": 275.15\n" + 
				"\n" + 
				"},\n" + 
				"\n" + 
				"\"visibility\": 10000,\n" + 
				"\n" + 
				"\"wind\": {\n" + 
				"\n" + 
				"\"speed\": 2.6,\n" + 
				"\n" + 
				"\"deg\": 230\n" + 
				"\n" + 
				"},\n" + 
				"\n" + 
				"\"clouds\": {\n" + 
				"\n" + 
				"\"all\": 36\n" + 
				"\n" + 
				"},\n" + 
				"\n" + 
				"\"dt\": 1456379732,\n" + 
				"\n" + 
				"\"sys\": {\n" + 
				"\n" + 
				"\"type\": 1,\n" + 
				"\n" + 
				"\"id\": 5091,\n" + 
				"\n" + 
				"\"message\": 0.0172,\n" + 
				"\n" + 
				"\"country\": \"GB\",\n" + 
				"\n" + 
				"\"sunrise\": 1456383302,\n" + 
				"\n" + 
				"\"sunset\": 1456421582\n" + 
				"\n" + 
				"},\n" + 
				"\n" + 
				"\"id\": 2643743,\n" + 
				"\n" + 
				"\"name\": \"London\",\n" + 
				"\n" + 
				"\"cod\": 200\n" + 
				"\n" + 
				"}";
		JSONParser parser = new JSONParser(); 
		JSONObject json = null;
		try {
			json  = (JSONObject) parser.parse(resp);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return json;
	}	
	

}
