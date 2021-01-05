package java11;

import com.sun.security.jgss.GSSUtil;

import java.lang.reflect.Field;

public class NestedAccessControl {

    class InnerClass {
        private int count = 10;
    }

    public static void main(String[] args) throws Exception {
        //Traditional method to access nested members from outer class
        NestedAccessControl.InnerClass nt = new NestedAccessControl().new InnerClass();
        System.out.println(nt.count);

        //Using reflection api (will work only in java 11)
        Field fld = InnerClass.class.getDeclaredField("count");
        fld.setInt(nt, 500); // In java 10 java.lang.IllegalAccessException,
        System.out.println(nt.count);


        //Java 11 methods
        // To get the enclosing class name
        String outer = InnerClass.class.getNestHost().getName();
        System.out.println(outer);

        // to get the nested members
        Class[] nestMembers = NestedAccessControl.class.getNestMembers();
        for(Class member: nestMembers) {
            System.out.println(member);
        }

        // checking the membership isNestmateOf()
        if(InnerClass.class.isNestmateOf(NestedAccessControl.class)) {
            System.out.println("yes this is a member");
        }

    }
}
