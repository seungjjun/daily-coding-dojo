import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BestAlbum {
    public int[] solution(String[] genres, int[] plays) {
        List<Integer> answer = new ArrayList<>();

        Map<String, Integer> genresPlayNumber = new HashMap<>();
        Map<Integer, Integer> music = new HashMap<>();

        for (int i = 0; i < plays.length; i += 1) {
            music.put(i, plays[i]);
        }

        for (int i = 0; i < genres.length; i += 1) {
            genresPlayNumber.put(genres[i], genresPlayNumber.getOrDefault(genres[i], 0) + plays[i]);
        }

        List<String> listGenreKey = new ArrayList<>(genresPlayNumber.keySet());
        listGenreKey.sort((value1, value2) -> genresPlayNumber.get(value2).compareTo(genresPlayNumber.get(value1)));

        List<Integer> listPlayKey = new ArrayList<>(music.keySet());
        listPlayKey.sort((value1, value2) -> music.get(value2).compareTo(music.get(value1)));

        for (String genre : listGenreKey) {
            int count = 1;

            for (int index : listPlayKey) {
                if (genres[index].equals(genre) && count < 3) {
                    count += 1;
                    answer.add(index);
                }
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}
