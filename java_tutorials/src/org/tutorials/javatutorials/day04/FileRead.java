package org.tutorials.javatutorials.day04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

// ���� �б� 
public class FileRead {

	public static void main(String[] args) throws IOException {
		byte[] b = new byte[1024];
        FileInputStream input = new FileInputStream("C:\\Users\\User\\Desktop\\Workplace\\src\\org\\tutorials\\javatutorials\\day04\\test.txt");
        input.read(b);
        System.out.println(new String(b));
        input.close();

        // FileInputStream Ŭ���� �̿� 
        // byte �迭�� �̿��Ͽ� ������ �о�� �ϱ� ������ �о�� �ϴ� ��Ȯ�� ���̸� �� ��쿡�� �� ������ ���
        
        // ������ ���� ������ �б� 
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\User\\Desktop\\Workplace\\src\\org\\tutorials\\javatutorials\\day04\\Practice.txt"));
        while(true) {
            String line = br.readLine();
            if (line==null) break;
        }
        br.close();
        // BufferedReader�� readLine �޼ҵ�� ���̻� ���� ������ ���� ��� null ���� 
        // �������� while���� ���� �ݺ������� 
        // ���� ���̻����� ���� ���� ��� while �� �������� 
        
        
	}	

}
