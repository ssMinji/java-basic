package org.tutorials.javatutorials.exception;

// throw �˾ƺ��� 
public class ExceptionDemo2 {

	public static void main(String[] args) {
		BufferedReader bReader = new BufferedReader(new FileReader("out.txt"));
        String input = bReader.readLine();
        System.out.println(input); 
        
        // ������
        // Unhandled exception type FileNotFoundException
        // new FileReader("out.txt") �� ���� ����ó���� �ʿ��ϴٴ� �� 
        // FileReader��� Ŭ������ API�������� ã�ƺ���. 
        // oracleȨ������ ���� ã�ƺ��� Throws �κ��� ����
        
        // Throws�� �ѱ���δ� '������'�� �����ȴ�. 
        // ���� ������ ������ FileReader�� ���� fileName�� ���� �ش��ϴ� ������ ���丮�̰ų� 
        // � ������ ����� �� ���ٸ� FileNotFoundException�� �߻���Ų�ٴ� �ǹ̴�.
        // �̰��� FileReader�� �����ڰ� ������ �� ������ �� �� ���� ��찡 ���� �� �ְ�, 
        //�̷� ��� ������ FileReader������ �� ������ ó���� �� ���� ������ �̿� ���� ó���� �������� ����ڿ��� �����ϰڴٴ� �ǹ̴�. 
        //�װ��� ������(throw)�� ǥ���ϰ� �ִ�.
        //���� API�� ����� �ʿ����� ���ܿ� ���� ó���� �ݵ�� �ؾ� �Ѵٴ� �ǹ̴�. 
        //���� �Ʒ��� ���� �ؾ� FileReader Ŭ������ ����� �� �ִ�.
        // �Ʒ��� ���� �� �� �ذ��غ���. 
        try {
            BufferedReader bReader = new BufferedReader(new FileReader("out.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        // step2
        // �Ʒ� �ڵ� �߰��غ���.
        try{
            String input = bReader.readLine();
        } catch (IOException e){
            e.printStackTrace();
        }  
        // ������ ���� �ڵ�� �����ϵ��� ����
        // bReader�� try�� �߰�ȣ �ȿ��� ����Ǿ� �ֱ� ������ ó���� bReader�� ������ bReader�� ���� �ٸ� �߰�ȿ
        // ���� ���⼭�� ���� ����� bReader�� ���ٺҰ�. --> �������� ���� 

	}

}
