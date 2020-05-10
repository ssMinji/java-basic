package org.tutorials.javatutorials.collections;

import java.util.*;

// Map 
public class MapDemo {

	public static void main(String[] args) {
		HashMap<String, Integer> a = new HashMap<String, Integer>();
		// key�� ������Ÿ�԰� value�� ������Ÿ���� ���� �������ְ� �� 
		// ù��° �Ű������� key, �ι�° �Ű����� value
		a.put("one", 1); // put�� Map �������̽��� �����ϴ� �޼ҵ� 
		a.put("two", 2); 
		a.put("three", 3);
		a.put("four", 4);
		System.out.println(a.get("one")); // 1
		System.out.println(a.get("two")); // 2
		System.out.println(a.get("three")); // 3

		iteratorUsingForEach(a);
		iteratorUsingIterator(a);
	}

	// Map�� ���� �������� ��� �ΰ���
	// 1) 
	static void iteratorUsingForEach(HashMap map){
		// Map.Entry�������̽��� Set �ȿ� ���� �� 
		// Map.Entry���� ������ API�� ����(getKey, getValue)
		// ���׸� ���� String-> getKey, Integer->getValue
		// �츮�� ���� Ű�� ��Ʈ��, ������ �����̱� ����.
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		for (Map.Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		// Map��ü���� ���ͷ����ͱ���� ���� ������ �ʿ� ����ִ� �����͸� ������ �ִ� set�� �����
		// set�� ���ִ� ������Ÿ���� Map.Entry�ΰ� 
	}
	// 2) 
	static void iteratorUsingIterator(HashMap map){
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		Iterator<Map.Entry<String, Integer>> i = entries.iterator();
		while(i.hasNext()){
			Map.Entry<String, Integer> entry = i.next();
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}
	
	// Map�� ������ �Լ��� ���α׷��� �� �� 

}
