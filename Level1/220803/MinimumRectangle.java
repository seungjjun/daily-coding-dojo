public class MinimumRectangle {
  public int solution(int[][] sizes) {
    int answer = 0;

    // 최대 세로길이 가로길이로 전환
    sizes = changeLength(sizes);

    // 최대 가로 길이 찾기
    int maxRow = findMaxRowLength(sizes);

    // 최대 세로 길이 찾기
    int maxColumn = findMaxColumnLength(sizes);

    answer = maxRow * maxColumn;

    return answer;
  }

  public int[][] changeLength(int[][] sizes) {
    for(int i = 0; i < sizes.length; i += 1) {
      if(sizes[i][1] > sizes[i][0]) {
        int temp = sizes[i][0];
        sizes[i][0] = sizes[i][1];
        sizes[i][1] = temp;
      }
    }
    return sizes;
  }

  public int findMaxRowLength(int[][] sizes) {
    int maxRow = sizes[0][0];

    for(int i = 0; i < sizes.length; i += 1) {
      if(maxRow < sizes[i][0]) {
        maxRow = sizes[i][0];
      }
    }
    return maxRow;
  }

  public int findMaxColumnLength(int[][] sizes) {
    int maxColumn = sizes[0][1];

    for(int i = 0; i < sizes.length; i += 1) {
      if(maxColumn < sizes[i][1]) {
        maxColumn = sizes[i][1];
      }
    }
    return maxColumn;
  }
}
