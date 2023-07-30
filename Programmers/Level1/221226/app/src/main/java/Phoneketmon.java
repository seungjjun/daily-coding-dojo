import java.util.HashSet;

public class Phoneketmon {
    public int solution(int[] nums) {
        int phoneKetMonNumber = nums.length;

        HashSet<Integer> phoneKetMons = new HashSet<>();

        for (int phoneKetMon : nums) {
            phoneKetMons.add(phoneKetMon);
        }

        if(phoneKetMons.size() < phoneKetMonNumber / 2) {
            return phoneKetMons.size();
        }

        return phoneKetMonNumber / 2;
    }
}
