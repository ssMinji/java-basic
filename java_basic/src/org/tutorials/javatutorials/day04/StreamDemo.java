package org.tutorials.javatutorials.day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

//�ڹ��� ����Ŭ���� �� InputStream Ŭ���� �� System.in�� �̿��ϸ� �ܼ� �Է��� ���� �� �ִ�.
//java.lang ��Ű���� ���� ���� ���� Ŭ������ �׻� import�ؼ� ����ؾ� �Ѵ�. 
//System�̳� String ���� Ŭ������ java.lang ��Ű���� �����ִ� Ŭ�����̹Ƿ� import �ʿ������. 

public class StreamDemo {

	public static void main(String[] args) throws IOException {
		// System.in�� InputStream�� ��ü���� �� �� �ִ�. 
		InputStream in = System.in;

        int a;
        a = in.read(); // read�޼ҵ�� 1byte�� ������� �Է��� �޾Ƶ��δ�. 
        
        // �� ��, read�޼ҵ�� ���� 1byte�� �����ʹ� byte �ڷ������� ����Ǵ� ���� �ƴ϶� int �ڷ������� ����� 
        // ����Ǵ� int ���� 0-255 ������ ���������� �ƽ�Ű�ڵ尪�̴� 
        // �̱�ǥ�رⱸ���� ���� ���ڸ� ǥ���ϴ� �ⱸ 
        // ��ǻ���� ���� �ᱹ �����̱� ������ ��ǻ�Ϳ��� ���ڿ� ��ȣ�� �ش� ���� ǥ������ ��ȯ�Ǿ�� �ϴ� �ʿ�. 
        // ��, ���ڷ� ���ڸ� ǥ���ϱ� ���� ������ ���
        // 0-9, a-z, A-Z, Ư������
        // 0�̶�� ���ڿ� �ش�Ǵ� �ƽ�Ű�ڵ尪�� 48, a��� ���ڿ� �ش�Ǵ� �ƽ�Ű�ڵ尪�� 97�̴�.
        

        System.out.println(a);	
        // ���α׷� ������� �ʰ� ������� �Է� ��� 
        //  �Է� �� �����ľ� ���α׷� ���� 
        
        // a �Է��ϸ� 97, abc�Է��ص� 97
        // ������ read�޼ҵ�� 1 byte�� �б� ����
        // ���� 3byte�� �����͸� ���������� ���α׷����� 1byte�� ���� ��. 
        
        // ���
        // ��ó�� ����ڰ� ������ 1byte �Ǵ� 3byte�� �����͸� �Է� ��Ʈ���̶� �� 
        // ��Ʈ���� �̾����ִ� ������(byte)�� ���¶�� �����ϸ� �� 
        // Stream - ����������� ��������  ��, ���� �帧ó�� �����͸� �޾ƿ� ����ִ°�
//        ���� ������ (������ �� ���۰� ���� �ִ� �������� ��Ʈ���̴�.)
//        HTTP ���� ������ (�������� ��û�ϰ� ������ �����ϴ� HTTP ���� �����͵� ��Ʈ���̴�.)
//        Ű���� �Է� (����ڰ� Ű����� �Է��ϴ� ���ڿ��� ��Ʈ���̴�.)
        
        
        // 3byte�д� �� 
        int x;
        int y;
        int z;

        x = in.read();
        y = in.read();
        z = in.read();

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        // ������ ��� -> ���̰� 3�� ����Ʈ�迭����� �� 

        byte[] d = new byte[3];
        in.read(d);
        
        System.out.println(d[0]);
        System.out.println(d[1]);
        System.out.println(d[2]);
        
        // for������ ������ 
        for (byte k : d) {
        	System.out.println(k);
        }
        
        // ������ �̷��� �ƽ�Ű�ڵ�� �ؼ��ؾ� �ϴ� ����� �����ϴ�
        // �Է°��� �״�� ����غ� ���� ������?
        // ����Ʈ ��� ���ڷ� �Է� ��Ʈ���� �������� InputStreamReader�� ���
        
        // InputStreamReader��ü �����Ҷ��� �������� �Է� �ʿ� 
        InputStreamReader reader = new InputStreamReader(in);
        char[] a = new char[3];
        reader.read(a);

        System.out.println(a);
        // abc (�Է�)
        // abc (���)
        
        // ���絵 ��������: ������ ���̷θ� ��Ʈ���� �о�� �Ѵٴ� �� 
        // ����ڰ� ����Ű�� �Է��� ������ ������� �Է� ���� �޾Ƶ��̷���?
        // BufferedReader 
        // ���� ��ü ������ �������� �Է°� �ʿ� 
        BufferedReader br = new BufferedReader(reader);

        String a = br.readLine();
        System.out.println(a);
//        HelloWorld (�Է�)
//        HelloWorld (���)
        
        // ����
//        InputStream - byte
//        InputStreamReader - character
//        BufferedReader - String

        // �̺��� �� �ܼ��Է� ���� ó���ϴ� ��?
        // Scanner 
        // �������� �Է����� System.in �� �ܼ��Է��� InputStream �ʿ����
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.next());
        
//        next - �ܾ�
//        nextLine - ����
//        nextInt - ����
        
        // ���������� �ܼ����?
        System.out.println();
        // �Ʊ �õ��� System.out�� PrintStream�� ��ü�̴�. 
        // ���߿����� ����: ���ڿ� ��� or �����
        System.err.println();// �����޽��� ��� 
        
       
	}

}
