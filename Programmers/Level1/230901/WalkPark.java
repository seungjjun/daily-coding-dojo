public class WalkPark {
    public int[] solution(String[] park, String[] routes) {
        int[] location = new int[2];

        for (int i = 0; i < park.length; i += 1) {
            for (int j = 0; j < park[i].length(); j += 1) {
                if (park[i].charAt(j) == 'S') {
                    location[0] = i;
                    location[1] = j;
                }
            }
        }

        for (String route : routes) {
            String[] directionAndDistance = route.split(" ");
            String direction = directionAndDistance[0];
            int distance = Integer.parseInt(directionAndDistance[1]);

            if (direction.equals("E")) {
                if (location[1] + distance >= park[location[1]].length()) {
                    continue;
                }

                for (int j = 0; j < distance; j += 1) {
                    if (park[location[0]].charAt(location[1] + 1) == 'X') {
                        location[1] = location[1] - j;
                        break;
                    }

                    location[1] += 1;
                }

                continue;
            }

            if (direction.equals("S")) {
                if (location[0] + distance >= park.length) {
                    continue;
                }

                for (int j = 0; j < distance; j += 1) {
                    if (park[location[0] + 1].charAt(location[1]) == 'X') {
                        location[0] = location[0] - j;
                        break;
                    }

                    location[0] += 1;
                }

                continue;
            }

            if (direction.equals("W")) {
                if (location[1] - distance < 0) {
                    continue;
                }

                for (int j = 0; j < distance; j += 1) {
                    if (park[location[0]].charAt(location[1] - 1) == 'X') {
                        location[1] = location[1] + j;
                        break;
                    }

                    location[1] -= 1;
                }

                continue;
            }

            if (direction.equals("N")) {
                if (location[0] - distance < 0) {
                    continue;
                }

                for (int j = 0; j < distance; j += 1) {
                    if (park[location[0] - 1].charAt(location[1]) == 'X') {
                        location[0] = location[0] + j;
                        break;
                    }

                    location[0] -= 1;
                }
            }
        }

        return location;
    }
}
