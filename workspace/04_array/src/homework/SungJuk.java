package homework;

import java.util.Scanner;

public class SungJuk {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("인원수 : ");
        int cnt = scan.nextInt();

        String[] name = new String[cnt];
        String[][] subject = new String[cnt][];
        int[] subjectCnt = new int[cnt];
        int[][] jumsu = new int[cnt][];
        

        int maxSubjectCount = 0;
        for (int i = 0; i < cnt; i++) {
            System.out.print("이름입력 : ");
            name[i] = scan.next();

            System.out.print("과목수 입력 : ");
            subjectCnt[i] = scan.nextInt();
            maxSubjectCount = Math.max(maxSubjectCount, subjectCnt[i]);
            subject[i] = new String[maxSubjectCount];
            jumsu[i] = new int[maxSubjectCount];
        }
            
            //jumsu[i] = new int[subjectCnt];
        for (int i = 0; i < cnt; i++) {
            for (int j = 0; j < subjectCnt[i]; j++) {
                System.out.print("과목명 입력 : ");
                subject[i][j] = scan.next();

                System.out.print(subject[i][j] + " 점수 입력 : ");
                jumsu[i][j] = scan.nextInt();
            }
   
        }

        System.out.println("---------------------");
        System.out.print(String.format("%-6s", "이름"));

        for (int i = 0; i < maxSubjectCount; i++) {
            System.out.print(String.format("%-6s", (i < subject[0].length) ? subject[0][i] : ""));
        }

        System.out.print(String.format("%-6s%-6s\n", "총점", "평균"));

        for (int i = 0; i < cnt; i++) {
            int totalScore = 0;
            System.out.print(String.format("%-6s", name[i]));

            for (int j = 0; j < maxSubjectCount; j++) {
                System.out.print(String.format("%-6d", (j < subject[i].length) ? jumsu[i][j] : 0));
                totalScore += (j < subject[i].length) ? jumsu[i][j] : 0;
            }

            double average = (double) totalScore / subjectCnt[i];
            System.out.print(String.format("%-6d%-6.2f\n", totalScore, average));
        }

        scan.close();
    }
}



/*
[문제] 성적 계산
인원수를 입력/하여 인원수만큼 데이터를 입력받고/ 총점/과 평균을 구하시오
평균은 소수이하 2째자리까지 출력

//가변길이

[실행결과]
인원수 : 2 (cnt)

이름입력 : 홍길동 (name)
과목수 입력 : 2   (subjectCnt)
과목명 입력 : 국어 (subject)
과목명 입력 : 영어
국어 점수 입력 : 95 (jumsu)
영어 점수 입력 : 100
---------------------
이름입력 : 이기자
과목수 입력 : 3
과목명 입력 : 국어
과목명 입력 : 영어
과목명 입력 : 과학
국어 점수 입력 : 95
영어 점수 입력 : 100
과학 점수 입력 : 90
---------------------

이름     국어	  영어    총점     평균
홍길동    95	  100   xxx	  xx.xx

이름		국어    영어    과학    총점     평균
이기자		95    100    90	   xxx    xx.xx
*/