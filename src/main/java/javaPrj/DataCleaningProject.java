package javaPrj;

import java.io.*;
import java.util.*;

public class DataCleaningProject {
    public static void main(String[] args) {
        String inputFile = "C:\\eclipse\\student_data.csv";  // 원본 파일
        String outputFile = "C:\\eclipse\\cleaned_data.csv"; // 클리닝 후 저장할 파일
        String line;
        
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

            // 1. 헤더(제목 줄) 처리
            line = br.readLine();
        	line = line.replace("\"", ""); // 모든 큰따옴표 제거
            if (line != null) {
                bw.write(line); // 헤더는 그대로 복사
                bw.newLine();
            }

            // 2. 데이터 한 줄씩 읽기
            while ((line = br.readLine()) != null) {
                // CSV는 쉼표로 구분되어 있으므로 split 사용
                // -1을 넣어주면 마지막 빈 칸도 포함해서 나누어줍니다.
                String[] data = line.split(",", -1);

                // [데이터 클리닝 수행]
                boolean isValid = true;

                // 예시: 이름(0번), 나이(1번), 점수(2번) 컬럼이 있다고 가정
                String name = data[0].trim();
                String ageStr = data[1].trim();
                String scoreStr = data[2].trim();

                // 조건 1: 이름이 비어있으면 해당 행은 건너뜀 (결측치 제거)
                if (name.isEmpty()) {
                    isValid = false;
                }

                // 조건 2: 나이가 비어있으면 0으로 채움 (결측치 채우기)
                if (ageStr.isEmpty()) {
                    ageStr = "0";
                }

                // 조건 3: 점수 데이터 타입 확인 및 이상치 제거
                try {
                    int score = Integer.parseInt(scoreStr);
                    if (score < 0 || score > 100) { // 0~100점 사이가 아니면 삭제
                        isValid = false;
                    }
                } catch (NumberFormatException e) {
                    isValid = false; // 숫자가 아니면 잘못된 데이터로 간주
                }

                // 3. 깨끗한 데이터만 새 파일에 쓰기
                if (isValid) {
                    String cleanedLine = String.join(",", name, ageStr, scoreStr);
                    bw.write(cleanedLine);
                    bw.newLine();
                }
            }
            System.out.println("데이터 클리닝이 완료되었습니다!");

        } catch (IOException e) {
            System.err.println("파일을 처리하는 중 오류가 발생했습니다: " + e.getMessage());
        }
    }
}

