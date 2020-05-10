package org.tutorials.javatutorials.control;

public class No04_If {
	public static int conditionTest(int value){
        // ���� value�� ����Ǿ� �ִٰ� �����ϰ� �Ʒ��� �ڵ带 �ۼ��ϼ���.
		// else if ���� �߰��� value�� 4�� ����̸� ret�� 4�� �����ϴ� �ڵ带 �߰��غ�����.
        int ret = 0;
        if( value % 3 == 0 ){
            ret = 3;
        }
        else if( value % 4 == 0) ret = 4; // �� �Ʒ� �ٿ� else ������ �߰��ؼ� �ڵ带 �ϼ��ϼ���.

        // ��� üũ�� ���� �ڵ��Դϴ�.
        return ret;
    }
	
	public static void main(String[] args) {
		System.out.println(conditionTest(5));
        if(true){
            System.out.println("result : true");
        }
        if(false){
            System.out.println("result : false");
        }
        
        // step 2 if - else
        if (true) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
 
        // step 3 if - else if - else
        if (false) {
            System.out.println(1);
        } else if (true) {
            System.out.println(2);
        } else if (true) {
            System.out.println(3);
        } else {
            System.out.println(4);
        }
       
    }

}
