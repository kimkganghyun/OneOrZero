package exam_0409;

import java.util.Scanner;
interface FareCalculator {
    int calculateFare(int time, int distance);
}
class TaxiFareCalculator implements FareCalculator {

    private static final int N = 410;
    private static final int Additional = 2;
    private static final int KM = 210;
    @Override
    public int calculateFare(int time, int distance) {
        int totalFare = N;
        // 운행 시간에 따른 추가 요금 계산
        if (time > 600) {
            totalFare += (time - 600) * Additional;
        }
        // 운행 거리에 따른 추가 요금 계산
        if (distance > 8) {
            totalFare += (distance - 8) * KM;
        }
        return totalFare;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();
        int distance = scanner.nextInt();
        FareCalculator fareCalculator = new TaxiFareCalculator();
        int totalFare = fareCalculator.calculateFare(time, distance);
        System.out.println(totalFare+"원");

    }
}
