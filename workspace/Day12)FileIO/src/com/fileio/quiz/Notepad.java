package com.fileio.quiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Notepad {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        // 프로그램 실행되는 동안 저장된 파일만 목록화하고 싶으면 arrayList 사용
        ArrayList<String> fileList = new ArrayList<>();
 
        while (true) {
            System.out.println("\n*** 콘솔 메모장 ***");
            System.out.println("1. 메모하기");
            System.out.println("2. 메모장 보기");
            System.out.println("3. 메모 수정하기");
            System.out.println("4. 프로그램 종료");
            System.out.print(">> ");
            String menu = sc.nextLine();
 
            if (menu.equals("1")) {
 
                System.out.println("메모 입력");
                System.out.print(">> ");
                String str = sc.nextLine();
 
                System.out.println("저장할 파일의 이름을 입력하세요.");
                System.out.print(">> ");
                String fileName = sc.nextLine();
 
                fileList.add(fileName);// arrayList(파일목록)에 리스트업
                saveFile(str, fileName); // 파일 저장 메서드 호출
 
            } else if (menu.equals("2")) {
                System.out.println("===== 저장된 메모 목록 =====");
                if (fileList.size() == 0) { // 만약 arrayList가 비어있다면
                    System.out.println("저장된 메모가 없습니다.");
                } else {
                    // 실제 경로의 목록 기준으로 파일 목록을 보여주고 싶다면 아래와 같이 접근
                    File file = new File("D:\\work\\java_workspace1\\IO");
                    String[] list = file.list();
                    for (String str : list) {
                        System.out.println(str);
                    }
 
                    // 프로그램 실행되는 동안 저장된 파일 기준으로 목록을 보여주고 싶다면 arrayList for문 돌리기
                    for (int i = 0; i < fileList.size(); i++) {
                        System.out.println(i + 1 + "." + fileList.get(i));
                    }
 
                    System.out.println("열어볼 파일의 이름을 입력하세요.");
                    System.out.print(">> ");
                    String fileName = sc.nextLine();
 
                    readFile(fileName); // 파일 읽기 메서드 호출
                }
            } else if (menu.equals("3")) {
                System.out.println("===== 저장된 메모 목록 =====");
                for (int i = 0; i < fileList.size(); i++) {
                    System.out.println(i + 1 + "." + fileList.get(i));
                }
 
                System.out.println("수정할 파일의 이름을 입력하세요.");
                System.out.print(">> ");
                String fileName = sc.nextLine();
 
                System.out.println("수정 방식을 선택하세요.");
                System.out.println("1. 덮어쓰기");
                System.out.println("2. 이어쓰기");
                System.out.print(">> ");
                String select = sc.nextLine();
 
                System.out.println("수정할 내용을 입력하세요.");
                System.out.print(">> ");
                String content = sc.nextLine();
 
                if (select.equals("1")) {
                    modifyFile(fileName, false, content);
                } else if (select.equals("2")) {
                    modifyFile(fileName, true, content);
                }
 
                System.out.println("수정 완료");
            } else if (menu.equals("4")) {
                System.out.println("프로그램 종료");
                break;
            }
        }
    }
 
    public static void saveFile(String content, String fileName) {
        try (FileWriter fw = new FileWriter(fileName, true);) {
            fw.write(content + "\n");
            fw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    public static void modifyFile(String fileName, boolean keep, String content) {
        if (keep) { // 만약 true 값이 넘어오면 이어쓰기
            try (FileWriter fw = new FileWriter(fileName, true);) {
                fw.write(content + "\n");
                fw.flush();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else { // 만약 false 값이 넘어오면 덮어쓰기
            try (FileWriter fw = new FileWriter(fileName);) {
                fw.write(content + "\n");
                fw.flush();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
 
    public static void readFile(String fileName) {
        try (FileReader fr = new FileReader(fileName); BufferedReader br = new BufferedReader(fr);) {
            String line = "";
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}