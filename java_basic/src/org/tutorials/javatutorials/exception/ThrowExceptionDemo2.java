package org.tutorials.javatutorials.exception;
import java.io.*;

class B{
    void run(){
        BufferedReader bReader = null;
        String input = null;
        try {
            bReader = new BufferedReader(new FileReader("out.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try{
            input = bReader.readLine();
        } catch (IOException e){
            e.printStackTrace();
        }       
        System.out.println(input); 
    }
    
    // step2
    // B�� ����ó���� ���� �ʰ� ���� ����� C.run���� �ѱ� �� �ִ�. 
    void run() throws IOException, FileNotFoundException{
        BufferedReader bReader = null;
        String input = null;
        bReader = new BufferedReader(new FileReader("out.txt"));
        input = bReader.readLine();
        System.out.println(input); 
    }
    
}
class C{
    void run(){
        B b = new B();
        b.run();
        
        // step2
        b.run(); // ���� �̰Ϳ� ������ ��
        // B�� run����ڿ��� ����ó���� �����ϴ� �� 
        // �ذ�
        try {
            b.run();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    // step3
    // ������� main���� å�� �ѱ��
    void run() throws IOException, FileNotFoundException{
        B b = new B();
        b.run();
    }
    
}
public class ThrowExceptionDemo {
    public static void main(String[] args) {
         C c = new C();
         c.run();
         
         // step3
         try {
             c.run();
         } catch (FileNotFoundException e) {
             System.out.println("out.txt ������ ���� ���� �Դϴ�. �� ������ ������Ʈ ��Ʈ ���丮�� �����ؾ� �մϴ�.");
         } catch (IOException e) {
             e.printStackTrace();
         }
         
         // �߰�: IOException�� FileNotFoundException�� �����ϰ� ����
         // �� IOException�� ������ �а��� ��� �Ϳ� ���� ����ó��
         // ���� IOException������ FileNotFoundException�� �����ص� �� 
         
         // out.txt ������ ã�� �� ���� ��Ȳ�� B.run ���忡���� ��� �� �� �ִ� ���� �ƴϴ�. 
         //���������� ���ø����̼��� ����ڰ� out.txt ������ ��Ʈ ���丮�� ��ġ���Ѿ� �ϴ� �����̱� ������
         // ���ø����̼��� �������� �޼ҵ� main���� å���� �ѱ�� �ִ�.
         
         // �߰�
         try(FileReader fReader = new FileReader("a")){
        	 fReader.read();
         }catch(IOException e) {
        	 throw new RuntimeException();
         }
         
    }   
}
