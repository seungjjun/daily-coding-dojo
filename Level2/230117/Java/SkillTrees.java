import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class SkillTrees {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        String[] skills = skill.split("");

        Queue<String> skillQueue = new LinkedList<>(Arrays.asList(skills));

        for (String skill_tree : skill_trees) {
            for (int j = 0; j < skill_tree.length(); j += 1) {
                String skillAlphabet = String.valueOf(skill_tree.charAt(j));

                if (skillQueue.isEmpty()) {
                    answer += 1;
                    break;
                }

                if (!skillQueue.peek().equals(skillAlphabet) && skillQueue.contains(skillAlphabet)) {
                    break;
                }

                if (j == skill_tree.length() - 1) {
                    answer += 1;
                }

                if (!skillQueue.contains(skillAlphabet)) {
                    continue;
                }

                skillQueue.poll();
            }

            skillQueue.clear();

            skillQueue.addAll(Arrays.asList(skills));
        }

        return answer;
    }
}
