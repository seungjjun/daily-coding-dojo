import java.util.Arrays;

public class RescueBoat {
    public int solution(int[] people, int limit) {
        int rescueBoatNumber = people.length;

        int rescuedPerson = 0;

        int notRescuedPerson = people.length - 1;

        Arrays.sort(people);

        while(rescuedPerson < notRescuedPerson) {
            if(people[rescuedPerson] + people[notRescuedPerson] > limit) {
                notRescuedPerson -= 1;
                continue;
            }

            if(people[rescuedPerson] + people[notRescuedPerson] <= limit) {
                notRescuedPerson -= 1;
                rescuedPerson += 1;

                rescueBoatNumber -= 1;
            }
        }

        return rescueBoatNumber;
    }
}
