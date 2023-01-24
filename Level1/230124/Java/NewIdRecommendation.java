import java.util.Objects;

public class NewIdRecommendation {
    public String solution(String new_id) {
        String convertedLowerId = new_id.toLowerCase();

        String convertedReplaceId = replace(convertedLowerId);

        convertedReplaceId = convertBlankString(convertedReplaceId);

        convertedReplaceId = substring(convertedReplaceId);

        if(convertedReplaceId.length() <= 2) {
            while (convertedReplaceId.length() != 3) {
                convertedReplaceId = convertedReplaceId +
                    convertedReplaceId.charAt(convertedReplaceId.length() - 1);
            }
        }

        return convertedReplaceId;
    }


    public String replace(String convertedLowerId) {
        return convertedLowerId
            .replaceAll("[^0-9a-z-_.]", "")
            .replaceAll("\\.{2,}", ".")
            .replaceAll("^[.]|[.]$", "");
    }

    public String convertBlankString(String convertedReplaceId) {
        if(Objects.equals(convertedReplaceId, "")) {
            convertedReplaceId = "a";
        }
        return convertedReplaceId;
    }

    public String substring(String convertedReplaceId) {
        if(convertedReplaceId.length() >= 16) {
            convertedReplaceId = convertedReplaceId.substring(0, 15);

            if(convertedReplaceId.charAt(convertedReplaceId.length() - 1) == '.') {
                convertedReplaceId = convertedReplaceId.replaceAll("[.]$", "");
            }
        }
        return convertedReplaceId;
    }
}
