import java.util.ArrayList;

public class Phonekemon {
  public int solution(int[] nums) {
    int answer = 0;

    int selectNumber = computeSelectingNumber(nums);

    ArrayList<Integer> numberList = new ArrayList<>();

    for(int phonkemonNumber : nums) {
      if (!numberList.contains(phonkemonNumber)) {
        numberList.add(phonkemonNumber);
      }
    }

    if(numberList.size() > selectNumber) {
      answer = selectNumber;
    }

    if(numberList.size() <= selectNumber) {
      answer = numberList.size();
    }

    return answer;
  }

  public int computeSelectingNumber(int[] nums) {
    return nums.length / 2;
  }
}
