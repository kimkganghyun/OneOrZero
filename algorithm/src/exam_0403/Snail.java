package exam_0403;

import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int A = sca.nextInt(); // 낮 올라가는 거리
        int B = sca.nextInt(); // 밤 미끄러지는 거리
        int V = sca.nextInt(); // 나무 막대 높이

        int n = 0; // 현 위치
        int days = 0; // 걸린 일수

        while (true){
            days++; // 하루 증가
            n += A; // 낮에만 이동함
            if (n >= V) // 목표 높이 도달하면 끝
                break;
            n -= B; // 밤에는 미끄러짐
        }
        System.out.println(days + " 일");
    }
}
// 1. 2
// 2. 2 -> 1 -> 3
// 3. 3 -> 2 -> 4
// 4. 4 -> 1 -> 5



