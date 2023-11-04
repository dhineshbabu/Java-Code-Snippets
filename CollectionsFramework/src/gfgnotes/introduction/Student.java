package gfgnotes.introduction;

import java.util.ArrayList;

public class Student {
    void print() {
        System.out.println("Student");
    }
}

class EngineeringStudent  extends Student{
    void print() {
        System.out.println("Engg Student");
    }
}

class MgmtStudent extends Student {
    void print() {
        System.out.println("Mgmt Student");
    }
}

class Test {
    static void printStudent(ArrayList<? extends Student> al) {
        for(Student s: al){
            s.print();
        }
    }

    public static void main(String[] args) {
        ArrayList<EngineeringStudent> al1 = new ArrayList<>();
        al1.add(new EngineeringStudent());
        al1.add(new EngineeringStudent());
        ArrayList<MgmtStudent> al2 = new ArrayList<>();
        al2.add(new MgmtStudent());
        al2.add(new MgmtStudent());
        printStudent(al1);
        printStudent(al2);

    }
}

