package exam_0404;

public class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        // 카드 배열 확인 [ 초기 상태 ]
        if (canFormSequence(cards1, cards2, goal, 0, 0, 0)) {
            return "Yes";
        } else {
            return "No";
        }
    }
    private boolean canFormSequence(String[] cards1, String[] cards2, String[] goal, int index1, int index2, int goalIndex) {
        // goal의 모든 단어를 사용했다면 true 반환
        if (goalIndex == goal.length) {
            return true;
        }
        // 첫 번째 카드 뭉치에 카드를 사용할 수 있는 경우
        if (index1 < cards1.length && cards1[index1].equals(goal[goalIndex])) {
            if (canFormSequence(cards1, cards2, goal, index1 + 1, index2, goalIndex + 1)) {
                return true;
            }
        }
        // 두 번째 카드 뭉치에 카드를 사용할 수 있는 경우
        if (index2 < cards2.length && cards2[index2].equals(goal[goalIndex])) {
            if (canFormSequence(cards1, cards2, goal, index1, index2 + 1, goalIndex + 1)) {
                return true;
            }
        }
        return false;
    }
}
