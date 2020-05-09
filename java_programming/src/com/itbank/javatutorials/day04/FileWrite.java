package com.itbank.javatutorials.day04;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

// ������ �̿��� ����� ��� 
public class FileWrite {

	public static void main(String[] args) throws IOException {
		FileOutputStream output = new FileOutputStream("C:\\Users\\KGITBANK\\Desktop\\docs\\test.txt");
		//output.close();
		
		// ���ο� ���� ������
		// ��ü ������ �������� �Է����� ���ϸ� �Ѱ���� ��
		// output.close() -> ����� ���� ��ü�� �ݾ��ִ� ���� 
		// ��������. �ڹ����α׷��� ����� �� ����� ���� ��ü�� �ڵ����� �ݾ��ֱ� ����
		// ���� ����� ���Ͽ� ���� �۾��� ������ �� �����ڰ� close�̿��� �ݾ��ִ� ���� ����
		// ��ü�� �ݾ����� �ʰ� �ٽ� ����Ϸ� �ϴ� ���, ���� �߻� 
		
		for (int i=1; i<=10; i++) {
			String data = i + "��° ���Դϴ�.\r\n";
			output.write(data.getBytes());
		}
		output.close();
		
		// \r\n�� �ٹٲ� ����
		// FileOutputStream : byte������ �����͸� ó���ϴ� ũ���� 
		// String�� byte�迭�� �ٲ��ִ� getBytes() �޼ҵ� ����ؾ� �� 
		
		// byte�� ��ȯ�ؾ� �ϴ� �� ����
		FileWriter fw = new FileWriter("C:\\Users\\KGITBANK\\Desktop\\docs\\test2.txt");
		
		for (int i=1; i<=10; i++) {
			String data = i + "��° ���Դϴ�.\r\n";
			fw.write(data);
		}
		fw.close();
		
		// \r\n�ؾ��ϴ� ������ ����
		PrintWriter pw = new PrintWriter("C:\\Users\\KGITBANK\\Desktop\\docs\\test3.txt");
		for(int i=1; i<=10; i++) {
			String data = i + "��° ���Դϴ�.";
			pw.println(data);
		}
		pw.close();
		
		// ���Ͽ� ���� �߰��ϱ� 
		FileWriter fw2 = new FileWriter("C:\\Users\\KGITBANK\\Desktop\\docs\\test3.txt", true);
		for (int i=11; i<=20; i++) {
			String data = i + "��° ���Դϴ�\r\n";
			fw2.write(data);
		}
		fw2.close();
		// �ۼ��� ������ �߰����� ������ boolean �Ķ���͸� true�� ����
		// ���� ������ ���� ���ĺ��� ������ �ۼ��� 
		
		// �ٸ� ���
		// PrintWritedr�� �������� �Է�: ���ϸ� ��� �߰����� ���� FileWriter��ü�� ���
		PrintWriter pw2 = new PrintWriter(new FileWriter("C:\\Users\\KGITBANK\\Desktop\\docs\\test3.txt", true));
		for (int i=21; i<=30; i++) {
			String data = i + "��° ���Դϴ�";
			pw2.println(data);
		}
		pw2.close();

	}

}
