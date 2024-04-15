package exam_0329;

import java.util.Scanner;
public class Examination {
    public static void main(String[] args) {
        System.out.print("세준이가 시험 본 과목의 개수 : ");
        Scanner scanner = new Scanner(System.in);
        int j = scanner.nextInt(); // 시험 본 과목의 개수
        int[] scores = new int[j]; // 세준이의 현재 성적

        System.out.print("현재 성적 입력하기 : ");
        // 세준이의 현재 성적 입력하기
        for (int i = 0; i < j; i++) {
            scores[i] = scanner.nextInt();
        }
        // 최댓값 찾기
        int maxscore = 0;
        for (int score : scores) {
            maxscore = Math.max(maxscore, score);
        }
        // 새로운 성적으로 변환하고 총합 계산
        double sum = 0;
        for (int score : scores) {
            double newScore = (double) score / maxscore * 100; // 각 성적을 최대값으로 나누고 100을 곱하여 새로운 성적을 계산함
            sum += newScore; // 새로운 성적 총합 계산
        }
        // 평균 계산
        double newaverage = sum / j; // 새로운 성적의 총합을 시험 본 과목의 개수로 나누어 평균을 계산함
        System.out.println("평균값 : "+newaverage);

    }
}
// Scanner 클래스 이용해서 사용자 입력 받음
// 세준이가 시험 본 과목의 개수(j)를 입력 받아서 각 과목마다 배열 scores에 입력 받음
// scores 배열에서 최대값을 찾고 각 성적 최대값 나눈 후 100 곱해서 새로운 성적 계산 함
// 새로운 성적 총합 계산해서 시험 본 과목의 개수 나눠서 평균 계산 한 후 새로운 평균 출력함.
