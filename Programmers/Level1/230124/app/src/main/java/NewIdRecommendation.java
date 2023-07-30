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

/*

자바의 메모리 영역에 대해 설명
메모리 영역은 크게 메서드 영역, 스택 영역, 힙 영역으로 나눠지고 데이터의 타입에 따라 할당이 됩니다.
메서드 영역에는 전역변수와 스태틱 변수를 저장하며, 프로그램의 시작부터 끝까지 메모리 영역에 남아 있습니다.
스택 영역에는 지역변수와 매개변수가 저장되는 곳이며, 메서드가 호출될때 메모리에 할당이되고 메서드가 종료되면 메모리가 해제됩니다.
힙 영역에는 new키워드로 생성되는 객체와 배열 등이 힙 영역에 저장되며 GC에 의해 메모리가 관리되는 곳입니다.

 */