package com.itbank.javatutorials.day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class StreamDemo2 {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in);
		char[] b = new char[3];
//		reader.read(b);
//		
//		System.out.println(b);
		
		// ��������: ������ ���̷θ� ��Ʈ���� �о�� ��
		// ����ڰ� ����Ű�� �Է��� ������ �Է��� ���� �޾Ƶ��̷���
		//BufferedReader
		// ��ü ������ �������� �Է°� �ʿ� 
		BufferedReader br = new BufferedReader(reader);
//		String a = br.readLine();
//		System.out.println(a);
		
		// ����
		// 1. InputStream : byte
		// 2. InputStreamReader : character
		// 3. BufferedReader : String 
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println(sc.next());
		
		// next : �ܾ� �Է�
		// nextInt: ����
		
		//�ܼ� ���
		System.out.println(); // ���ڿ���� or ����� 
		System.err.println(); // �����޽��� ��� -> ����� �� ��� 
	}
}
