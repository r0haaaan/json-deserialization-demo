package in.rohaan.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonDemo {
    private static ObjectMapper objectMapper = new ObjectMapper();

    public static void main(String[] args) throws JsonProcessingException {
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

        MusicLibrary musicLibrary = objectMapper.readValue(input, MusicLibrary.class);

        System.out.println(musicLibrary.getLibraryName());
        for (int i = 0; i < musicLibrary.getMymusic().size(); i++) {
            System.out.println(musicLibrary.getMymusic().get(i).getArtistName() + " " +
                               musicLibrary.getMymusic().get(i).getSongName());
        }

    }
}
