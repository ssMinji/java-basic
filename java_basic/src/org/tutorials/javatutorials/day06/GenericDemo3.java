package org.tutorials.javatutorials.day06;

// �� abstract�� �ʿ�� ������..
abstract class Info{
    public abstract int getLevel();
}

class EmployeeInfo extends Info{
    public int rank;
    EmployeeInfo(int rank){ this.rank = rank; }
    public int getLevel(){
        return this.rank;
    }
}

//step2
interface Info{
  int getLevel();
}
class EmployeeInfo implements Info{
    public int rank;
    EmployeeInfo(int rank){ this.rank = rank; }
    public int getLevel(){
        return this.rank;
    }
}

class Person<T extends Info>{
    public T info;
    Person(T info){
    	this.info = info;
    	
    	// step3
    	info.getLevel(); 
    	// �̰��� extendsŰ���� ������ ������ 
	}
}

public class GenericDemo3 {

	public static void main(String[] args) {
		Person p1 = new Person(new EmployeeInfo(1));
        Person<String> p2 = new Person<String>("����");

	}

}
