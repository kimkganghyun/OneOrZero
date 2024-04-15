package exam_0330;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int[] arr = new int[30]; // 학생 1번 ~ 30번 배열 저장
        System.out.println("제출한 과제 학생 번호 입력 :");
        // 제출한 과제 학생
        for (int i=0; i<28; i++){
            int tasked = sca.nextInt();
            arr[tasked -1] = 1; // 과제 제출한 인덱스 1 저장
        }

        // 제출하지 않은 학생 찾기
        for (int i=0; i<30; i++){
            if (arr[i] == 0){ // 인덱스 값 0 일떄 과제 제출 X
                System.out.println("학생 번호 : "+ (i + 1) );
            }
        }
    }
}
// Scanner 객체 사용해서 제출한 학생 번호를 arr 배열 저장함
// 학생 번호  인덱스 1번부터 시작함
// 제출 안한 학생은 인덱스 값 0 일때  학생 번호 알수있음.