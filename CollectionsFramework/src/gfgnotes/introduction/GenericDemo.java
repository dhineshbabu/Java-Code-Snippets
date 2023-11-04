package gfgnotes.introduction;

public class GenericDemo <T, S>{
    T x;
    S y;

    // Generic function
    // Telling compiler that 'T' is type of argument that the function take below
    public static <T> int count(T arr[], T x) {
        int res = 0;
        for(T e: arr) {
            if (e.equals(x))
                res++;

        }
        return res;
    }

    public static void main(String[] args) {
        GenericDemo<Integer, String> g = new GenericDemo<>();
        g.x = 12;
        g.y = "kani";
        // The below line will give compiler error
        // String str = (String) g.x;

        // using generic method
        Integer[] arr = {1,2,3,3, 4};
        System.out.println(count(arr, 3));
    }
}


