package org.tutorials.javatutorials.day02;

import java.util.ArrayList;
import java.util.Arrays;

public class No01_array {

	public static void main(String[] args) {
		// �迭 ���� 
		int[] array1 = new int[4];
		System.out.println(array1.length);
		System.out.println(Arrays.toString(array1)); 
		array1[0] = 1;
		System.out.println(array1); // �ּҰ� ��� 
		System.out.println(Arrays.toString(array1)); 
	    array1[1] = 2;
	    array1[2] = 3;
	    array1[3] = 4;
	    
	    int[] array2 = new int[]{1,2,3,4,5};
	    .
	    // ���ڿ� �迭
	    String[] ex = new String[3];
	    System.out.println(Arrays.toString(ex));
	    
	    String[] weeks = {"��", "ȭ", "��", "��", "��", "��", "��"};
	    // ���� �߻� 
	    //System.out.println(weeks[7]);  // 8��° �迭���� �����Ƿ� ArrayIndexOutOfBoundsException ������ �߻��Ѵ�.
	    
	    // �迭�� ���̸� �����Ͽ� ������ ���� ������ ���� �� ���� ���߿� �����ϴ� ����̴�. 
	    //��, �� ��ó�� �ʱⰪ ���� �迭 ������ ���鶧���� �ݵ�� ���̰��� �ʿ��ϴ�. 
	    //��, ������ ���� �ڵ�� �Ұ����ϴ�.
	    //String[] weeks = new String[];    // ���̰��� �����Ƿ� ������ ������ �߻��Ѵ�.
	    
	    // Quiz 
	    // ���̰� 10�� ������ �迭 ����� 1���� 10���� ���� 
	    int [] iarray = new int[10];
	    System.out.println(iarray.length);
	    
	   //�迭�� ���� �ݺ������� �־�� �ϹǷ�, for �ݺ����� �̿��Ѵ�. 
	    for(int i = 0; i < iarray.length; i++){ 
	    //�迭�� �ε����� 0���� �����ϹǷ�, 0���� �迭�� ���̺��� �ϳ� ���������� �ݺ��ϸ� �迭�� ũ�⸸ŭ �ݺ��� �� �ִ�. 
	            iarray[i] = i + 1;  
	            System.out.println(Arrays.toString(iarray)); 
	    //�迭�� �ε����� 0�����ε� �ְ� ���� ���� 1���� ����ؾ��ϹǷ�, �ε����� 1�� ������ ���� �־��ش�. 
	    }
	    
	    // 2���� �迭
	    int[][] array4 = new int[3][4];
	    System.out.println(Arrays.deepToString(array4)); 
	    array4[0][0] = 10;
	    
	    int[][] array5 = new int[3][];
	    //���� ���� �����ϸ� array5�� 3��¥�� �迭�� �����Ѵ�. 3��¥�� �迭�� ���� �����ϴ� �迭�� ���ٴ� ���� �ǹ�.
	    System.out.println(Arrays.deepToString(array5)); 

	    array5[0] = new int[1]; //������ �ϳ� ���� �� �ִ� �迭�� �����ؼ� array5 �� 0 ��° �ε����� �����Ѵ�.  
	    System.out.println(Arrays.deepToString(array5)); 
	    array5[1] = new int[2]; //������ �ΰ� ���� �� �ִ� �迭�� �����ؼ� array5 �� 1 ��° �ε����� �����Ѵ�.  
	    array5[2] = new int[3]; //������ ���� ���� �� �ִ� �迭�� �����ؼ� array5 �� 2 ��° �ε����� �����Ѵ�.
	    
	    int[][] array6 = {{1}, {2,3}, {4,5,6}};
	    //���� ���� ������ ��� array6[0][0] �� 1�̴�. array6[1][0]�� 2�̴�. 
	    
	    // Quiz
	    int [][] array = {{1}, {1, 2}, {1, 2, 3}, {1, 2, 3, 4}};
        
        // 2���� �迭 array�� ����մϴ�.
        for(int i = 0 ; i < array.length; i++) {
            System.out.print( (i+1) + "��° ���� ����մϴ�>");
            for(int j = 0; j< array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println("");
        }
	    
        // ����Ʈ(List)
        // ����Ʈ�� �迭�� ����� �ڹ��� �ڷ������� �迭���� ���� ����� ���� ������ �ִ�.
        // �迭�� ũ�Ⱑ ������ �ִ�. ���� ��� �迭�� ũ�⸦ 10���� ���ߴٸ� 10�� �̻��� ���� ���� ���� ����.
        // List �ڷ������� ArrayList, LinkedList ���� List �������̽��� ������ �ڷ����� �ִ�. 
        // ���⼭ ���ϴ� List �ڷ����� �������̽��ε� �������̽��� ���ؼ��� �ڿ��� �ڼ��� �ٷ絵�� �Ѵ�.
        // List �ڷ��� �� ���� ������ ������ �ڷ����� ArrayList�� ���ؼ� �˾ƺ���.
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("one");
        list1.add("two");
        list1.add(2, "three");
        System.out.println(list1);
        
        // get: Ư�� �ε��� �� ����
        System.out.println(list1.get(1));
        // size: ����Ʈ ũ�� ����
        System.out.println(list1.size());
        // contains: ����Ʈ �ȿ� Ư�� ���� �ִ��� �Ǻ��Ͽ� boolean ����� ���� 
        System.out.println(list1.contains("two"));

        // remove: ����Ʈ���� �׸� ���� 
        // �Ķ����: ��ü or �ε��� 
        System.out.println(list1.remove("one"));
        System.out.println(list1.size());
        System.out.println(list1.remove(0));
	}

}
