package org.tutorials.javatutorials.exception;

class A{
    private int[] arr = new int[3];
    A(){
        arr[0]=0;
        arr[1]=10;
        arr[2]=20;
    }
    public void z(int first, int second){
        System.out.println(arr[first] / arr[second]);
        
        // step3
        try {
            System.out.println(arr[first] / arr[second]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch(ArithmeticException e){
            System.out.println("ArithmeticException");
        } catch(Exception e){
            System.out.println("Exception");
        }
        
       // step4
        // ���ܿ� ������� try���� ������ ����Ǹ� finally�� ����ǰ� ����
        // finally: ���ܿʹ� ������� �ݵ�� ������� �ϴ� �۾��� ���� �� ���
        // ���� ���, �����ͺ��̽� ����� �� �����ͺ��̽� ������ �����ؾ� �ϴµ�
        // �̶� �����ͺ��̽� ������ ���ø����̼��� ���� ���ӻ��¸� �����ϰ� �Ǵµ�
        // �����ͺ��̽��� �����ϴ� �������� ���ܰ� �߻��ؼ� ���̻� �ļ��۾��� �����ϴ� ���� �Ұ����� ��� �߻�����
        // ���ܰ� �߻��ߴٰ� �����ͺ��̽� ������ ���� ������ �����ͺ��̽��� ������¸� �����ϰ� �ǰ� �ޱ��
        // �����ͺ��̽��� ���̻� ������ ������ �� ���� ���¿� ���� �� �ִ�
        // ������ ���� �۾��� ���� �߻����ο� ������� ������ finally���� ó���ϱ⿡ ���� �۾� 
        try {
            System.out.println(arr[first] / arr[second]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch(ArithmeticException e){
            System.out.println("ArithmeticException");
        } catch(Exception e){
            System.out.println("Exception");
        } finally {
            System.out.println("finally");
        }
    }
}
 
public class ExceptionDemo1 {
    public static void main(String[] args) {
        A a = new A();
        a.z(10, 1);
        
        // ������
        // java.lang.ArrayIndexOutOfBoundsException
        // �迭�� 3���� ���� ���� �� �ִµ�, 10��° �ε����� ȣ���ϰ� ������
        // �������� �ʴ� ���� ���������� �õ��ϰ� �ֱ� ������ ���� �߻� 
        
        // step2
        a.z(1, 0);
        // ������
        // java.lang.ArithmeticException
        // �̶���, 10�� 0���� ������ ���� ���������� �Ұ����ϱ� ������ �߻��� ����.
        
        // ���
        // ���� ���������� ��Ȳ�� ���� �ٸ� ���ܰ� �߻��� �� ����. 
        // �׷� ���� �� ���ܵ��� ó���غ���(step3)
        
        // step3
        a.z(10, 0);
        a.z(1, 0);
        a.z(2, 1);
        // ���
        // ���� catch ��
        // ���ǹ��� else if ó�� �������� catch�� �ϳ��� try�������� ��� ���� 
        
        // �غ���
        // ���� catch(Exception e) ���� ĳġ�� ���� �տ� ��ġ�ϸ�?
        // ������ ���� �߻�
        // Exception�� ArrayIndexOutOfBoundsException, ArithemeticException ���� 
        // �������� ���ܸ� �ǹ��ϱ� ������ Exception ���Ŀ� �����ϴ� catch ���� ����� �� ���� �����̱� �����̴�. 
        // ��, �ڹ� �����Ϸ��� ���ʿ��� ������ �����ϰ� �̸� �����ڿ��� �˷��ִ� ���̴�.
    }
}
