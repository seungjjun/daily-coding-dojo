public class Rectangle {
    public int solution(int[][] sizes) {
        int cardMax = 0;
        int cardMin = 0;

        for(int i = 0; i < sizes.length; i += 1) {
            int[] size = sizes[i];

            int max = Math.max(size[0], size[1]);
            int min = Math.min(size[0], size[1]);

            cardMax = Math.max(cardMax, max);
            cardMin = Math.max(cardMin, min);
        }

        return cardMax * cardMin;
    }
}
