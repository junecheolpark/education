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
        // ���α׷� ����Ǵ� ���� ����� ���ϸ� ���ȭ�ϰ� ������ arrayList ���
        ArrayList<String> fileList = new ArrayList<>();
 
        while (true) {
            System.out.println("\n*** �ܼ� �޸��� ***");
            System.out.println("1. �޸��ϱ�");
            System.out.println("2. �޸��� ����");
            System.out.println("3. �޸� �����ϱ�");
            System.out.println("4. ���α׷� ����");
            System.out.print(">> ");
            String menu = sc.nextLine();
 
            if (menu.equals("1")) {
 
                System.out.println("�޸� �Է�");
                System.out.print(">> ");
                String str = sc.nextLine();
 
                System.out.println("������ ������ �̸��� �Է��ϼ���.");
                System.out.print(">> ");
                String fileName = sc.nextLine();
 
                fileList.add(fileName);// arrayList(���ϸ��)�� ����Ʈ��
                saveFile(str, fileName); // ���� ���� �޼��� ȣ��
 
            } else if (menu.equals("2")) {
                System.out.println("===== ����� �޸� ��� =====");
                if (fileList.size() == 0) { // ���� arrayList�� ����ִٸ�
                    System.out.println("����� �޸� �����ϴ�.");
                } else {
                    // ���� ����� ��� �������� ���� ����� �����ְ� �ʹٸ� �Ʒ��� ���� ����
                    File file = new File("D:\\work\\java_workspace1\\IO");
                    String[] list = file.list();
                    for (String str : list) {
                        System.out.println(str);
                    }
 
                    // ���α׷� ����Ǵ� ���� ����� ���� �������� ����� �����ְ� �ʹٸ� arrayList for�� ������
                    for (int i = 0; i < fileList.size(); i++) {
                        System.out.println(i + 1 + "." + fileList.get(i));
                    }
 
                    System.out.println("��� ������ �̸��� �Է��ϼ���.");
                    System.out.print(">> ");
                    String fileName = sc.nextLine();
 
                    readFile(fileName); // ���� �б� �޼��� ȣ��
                }
            } else if (menu.equals("3")) {
                System.out.println("===== ����� �޸� ��� =====");
                for (int i = 0; i < fileList.size(); i++) {
                    System.out.println(i + 1 + "." + fileList.get(i));
                }
 
                System.out.println("������ ������ �̸��� �Է��ϼ���.");
                System.out.print(">> ");
                String fileName = sc.nextLine();
 
                System.out.println("���� ����� �����ϼ���.");
                System.out.println("1. �����");
                System.out.println("2. �̾��");
                System.out.print(">> ");
                String select = sc.nextLine();
 
                System.out.println("������ ������ �Է��ϼ���.");
                System.out.print(">> ");
                String content = sc.nextLine();
 
                if (select.equals("1")) {
                    modifyFile(fileName, false, content);
                } else if (select.equals("2")) {
                    modifyFile(fileName, true, content);
                }
 
                System.out.println("���� �Ϸ�");
            } else if (menu.equals("4")) {
                System.out.println("���α׷� ����");
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
        if (keep) { // ���� true ���� �Ѿ���� �̾��
            try (FileWriter fw = new FileWriter(fileName, true);) {
                fw.write(content + "\n");
                fw.flush();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else { // ���� false ���� �Ѿ���� �����
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