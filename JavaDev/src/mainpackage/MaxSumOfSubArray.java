package mainpackage;

/**
 * Created by bilalsay on 07.10.2016.
 */

class SuperClass {
    public void show() {
        System.out.println("SuperClass' show here");
    }

    public void get() {
        System.out.println("BİLALSAY");
    }
}

class SubClass extends SuperClass {
    public void show() {
        System.out.println("SubClass' show here");
    }
}


public class MaxSumOfSubArray {



    public static void main(String args[]) {
        int numberGroups[][] = new int[3][];
        numberGroups[0] = new int[]{-2,11,-4,13,-5,2};
        numberGroups[1] = new int[]{1,2,-5,4,7,-2};
        numberGroups[2] = new int[]{1,5,-3,4,-2,1};

        SuperClass sup = new SuperClass();
        SubClass sub = new SubClass();
        SuperClass supSub = new SubClass();
        supSub.get();
    }


}
