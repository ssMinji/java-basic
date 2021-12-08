package org.tutorials.javatutorials.day04;

import java.io.FileOutputStream;
import java.io.IOException;

// ������ �̿��� ����� ��� 
public class FileWrite {

	public static void main(String[] args) throws IOException {
		FileOutputStream output = new FileOutputStream("C:\\Users\\User\\Desktop\\Workplace\\src\\org\\tutorials\\javatutorials\\day04\\test.txt");
		output.close();
		// �����غ��� ���ο� ���� ������ 
		// �������� �Է����� ���ϸ� �Ѱ��־�� �� 
		// output.close(); -> ����� ���� ��ü�� �ݾ��ִ� ��. 
		// ��� �̰��� �����ص� �Ǵµ�, �ڹ����α׷��� �����Ҷ� ����� ���� ��ü�� �ڵ����� �ݾ��ֱ� ����
		// ������ ���� ����� ������ �ݾ��ִ� ���� ����. 
		// ������ ���� �ʰ� �ٽ� ����Ϸ��� �� ��쿡�� ���� �߻� ���� 


		FileOutputStream output = new FileOutputStream("C:\\Users\\User\\Desktop\\Workplace\\src\\org\\tutorials\\javatutorials\\day04\\test.txt");
		for(int i=1; i<11; i++) {
			String data = i+" ��° ���Դϴ�.\r\n";
			output.write(data.getBytes());
		}
		output.close();

		// OutputStream�� ���� ����Ʈ ������ ������ ó���ϴ� Ŭ����. 
		// FileOutputStream�� OutputStream��ӹ޾� ���� Ŭ�����ε� ���� ����Ʈ ������ ������ ó��
		// ���� String�� byte�迭�� �ٲ��ִ� getBytes() �޼ҵ� ���
		//\r\n�� �ٹٲ޹��� 
		// ���������� ��� \r\n ó�� \r ���ڸ� �߰��ؾ� ��Ʈ�е� ���� �����Ϳ��� �ٹٲ��� ����� ǥ�õǾ� ���δ�.)

		// ����Ʈ �迭�� ��ȯ�ؾ� �ϴ� �� ����
		FileWriter fw = new FileWriter("c:/out.txt");
		for(int i=1; i<11; i++) {
			String data = i+" ��° ���Դϴ�.\r\n";
			fw.write(data);
		}
		fw.close();

		// FileWriter �̿��ϸ� ���ڿ� ���� ���Ͽ� ���� ���� 

		// \r\n�ؾ��ϴ� ������ ���� 
		PrintWriter pw = new PrintWriter("c:/out.txt");
		for(int i=1; i<11; i++) {
			String data = i+" ��° ���Դϴ�.";
			pw.println(data);
		}
		pw.close();
		// println �޼ҵ� ��� 

		// ���� for���� �� 
		for(int i=1; i<11; i++) {
			String data = i+" ��° ���Դϴ�.";
			System.out.println(data);
		}
		// ù���� ����� �ִܼ�ſ� ���Ϸ� ����ϴ� ����� �� 

		// ���Ͽ� ���� �߰��ϱ� 
		// �̹� �ۼ��� ������ �ٽ� �߰����� ����� �� 
		FileWriter fw = new FileWriter("c:/out.txt");
		for(int i=1; i<11; i++) {
			String data = i+" ��° ���Դϴ�.\r\n";
			fw.write(data);
		}
		fw.close();

		FileWriter fw2 = new FileWriter("c:/out.txt", true);
		for(int i=11; i<21; i++) {
			String data = i+" ��° ���Դϴ�.\r\n";
			fw2.write(data);
		}
		fw2.close();
		// �ι�° �Է°� true �߰��� �ԷµǾ� ������ 
		// boolean �Է� �Ķ���ʹ� �߰����(apppend)�� ���������� ���� ���а� 
		// true�� ����ϸ�, ���� ������ ���� ���ĺ��� ������ �������� ��

		// �ٸ� ��� 
		PrintWriter pw = new PrintWriter("c:/out.txt");
		for(int i=1; i<11; i++) {
			String data = i+" ��° ���Դϴ�.";
			pw.println(data);
		}
		pw.close();

		// PrintWriter�� �������� �Է����� ���ϸ��� �߰����� ���� FileWrited�� ��ü ����ϸ� �� 
		PrintWriter pw2 = new PrintWriter(new FileWriter("c:/out.txt", true));
		for(int i=11; i<21; i++) {
			String data = i+" ��° ���Դϴ�.";
			pw2.println(data);
		}
		pw2.close();

	}

}
