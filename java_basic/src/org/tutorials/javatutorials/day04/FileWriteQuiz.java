package org.tutorials.javatutorials.day04;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWriteQuiz {

	public static void main(String[] args) throws FileNotFoundException {
		/*
		 * Write �ǽ�
		 * �л��� �̸�, Ű�� ��� �迭�� �־����� �� ������ ������ �����Ͻÿ� 
		 * ����ġ ���� 
		 * 
		 * */
		String[] names = {"Jack", "Rachel", "Tom", "Anna", "Jenny"};
		int[] heights = {170, 155, 180, 185, 160};
		
		PrintWriter pw = new PrintWriter("C:\\Users\\User\\Desktop\\Docs\\class.txt");
		
		pw.println("�̸� Ű");
		for (int i=0; i<names.length; i++) {
			String line = names[i] + " " +  heights[i];
			pw.println(line);
			
		}
		pw.close();

	}

}
