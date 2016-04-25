import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class parsing {

    private static JSONTokener jsonOut;

    public String main(int id) throws JSONException, IOException {

        File f = new File("\\Users\\Ruba\\Desktop\\uni\\web service\\COMP4382-master\\users.json");
        String jsonString = readFile(f.getPath());
        StringBuilder res = new StringBuilder();
        jsonOut = new JSONTokener(jsonString);
        JSONObject output = new JSONObject(jsonOut);
        
        int id1 = output.getJSONObject("feature1").getInt("id");
        int id2 = output.getJSONObject("feature2").getInt("id");
        int id3 = output.getJSONObject("feature3").getInt("id");
        
        JSONObject docs1 = output.getJSONObject("user1");
        JSONObject docs2 = output.getJSONObject("user2");
        JSONObject docs3 = output.getJSONObject("user3");

        String name1 = docs1.getString("email");
        String name2 = docs2.getString("email");
        String name3 = docs3.getString("email");

        String pass1 = docs1.getString("password");
        String pass2 = docs2.getString("password");
        String pass3 = docs3.getString("password");
        
        res.append(id1);
        res.append(name1);
        res.append(pass1);
        res.append("\n");
        res.append(id2);
        res.append(name2);
        res.append(pass2);
        res.append("\n");
        res.append(id3);
        res.append(name3);
        res.append(pass3);
        
        return res.toString();

    }

    private static String readFile(String file) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = null;
        StringBuilder stringBuilder = new StringBuilder();
        String ls = System.getProperty("line.separator");

        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line);
            stringBuilder.append(ls);
        }

        return stringBuilder.toString();
    }

}