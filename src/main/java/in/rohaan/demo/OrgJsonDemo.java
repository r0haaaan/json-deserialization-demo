package in.rohaan.demo;

import org.json.JSONArray;
import org.json.JSONObject;

public class OrgJsonDemo {
    public static void main(String[] args) {
        String input = "{\n" +
                "  \"libraryname\": \"My Library\",\n" +
                "  \"mymusic\": [\n" +
                "    {\n" +
                "      \"Artist Name\": \"Aaron\",\n" +
                "      \"Song Name\": \"Beautiful\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Artist Name\": \"Britney\",\n" +
                "      \"Song Name\": \"Oops I did It Again\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"Artist Name\": \"Britney\",\n" +
                "      \"Song Name\": \"Stronger\"\n" +
                "    }\n" +
                "  ]\n" +
                "}";
        JSONObject jsonObject = new JSONObject(input);

        System.out.println(jsonObject.get("libraryname"));
        JSONArray musicList = jsonObject.getJSONArray("mymusic");
        for (int i = 0; i < musicList.length(); i++) {
            JSONObject obj = musicList.getJSONObject(i);
            System.out.println(obj.get("Artist Name") + " " + obj.get("Song Name"));
        }
    }
}
