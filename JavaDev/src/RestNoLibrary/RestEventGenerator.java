package RestNoLibrary;

import sun.jvmstat.perfdata.monitor.MonitorDataException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.io.OutputStream;

import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by bilalsay on 20/02/2017.
 */
public class RestEventGenerator {
    private static final String USER_AGENT = "Mozilla/5.0";
    private static final String targetURL = "http://localhost:9999/HelloWorld/data.json";

    private static void sendJSON(String json) throws MonitorDataException, IOException {

        URL url = new URL(targetURL);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setDoInput(true);
        con.setDoOutput(true);

        con.setRequestProperty("Content-Type", "application/json;");
        con.setRequestProperty("Accept", "application/json, text/plain");
        con.setRequestProperty("Method", "POST");

        OutputStream os = con.getOutputStream();
        os.write(json.toString().getBytes("UTF-8"));
        os.close();

        StringBuilder sb = new StringBuilder();
        int HttpResult = con.getResponseCode();
        if (HttpResult == HttpURLConnection.HTTP_OK) {
            BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"));
            String line = null;
            while ((line = br.readLine()) != null)
                sb.append(line + "\n");

            br.close();
            System.out.println(sb.toString());

        } else {
            System.out.println(con.getResponseCode());
            System.out.println(con.getResponseMessage());

        }

    }

    public static void main(String args[]) {
        try {
            RestEventGenerator.sendJSON("{\"room\":\"4\" , \"occupation\":\"5\"}");
        } catch (MonitorDataException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
