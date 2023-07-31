import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 과목수
        int subjectCount = scanner.nextInt();

        // 점수 입력 받기
        double[] score = new double[subjectCount];
        for (int i = 0; i < subjectCount; i++) {
            score[i] = scanner.nextInt();
        }

        // 최대값 찾기
        double maxScore = score[0];
        for (int i = 0; i < score.length; i++) {
            if (maxScore < score[i]) {
                maxScore = score[i];
            }
        }

        double[] fakeScore = new double[subjectCount];
        // 점수 조작하기
        for (int i = 0; i < subjectCount; i++) {
            fakeScore[i] = score[i] / maxScore * 100;
        }

        double sum = 0;
        // 조작된 점수 평균으로 변경하기
        for (int i = 0; i < subjectCount; i++) {
            sum += fakeScore[i];
        }
        double avg = sum / subjectCount;
        System.out.println(avg);
    }
}