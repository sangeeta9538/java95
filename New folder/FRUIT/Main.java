// Parent class
class ParentClass {
    protected int parentVariable1;
    protected String parentVariable2;

    public ParentClass(int parentVariable1, String parentVariable2) {
        this.parentVariable1 = parentVariable1;
        this.parentVariable2 = parentVariable2;
    }

    public void parentMethod1() {
        System.out.println("Parent Method 1");
    }

    public void parentMethod2() {
        System.out.println("Parent Method 2");
    }
}

// Child class 1
class ChildClass1 extends ParentClass {
    private double childVariable1;
    private boolean childVariable2;

    public ChildClass1(int parentVariable1, String parentVariable2, double childVariable1, boolean childVariable2) {
        super(parentVariable1, parentVariable2);
        this.childVariable1 = childVariable1;
        this.childVariable2 = childVariable2;
    }

    public void childMethod1() {
        System.out.println("Child 1 Method 1");
    }

    public void childMethod2() {
        System.out.println("Child 1 Method 2");
    }
}

// Child class 2
class ChildClass2 extends ParentClass {
    private char childVariable1;
    private long childVariable2;

    public ChildClass2(int parentVariable1, String parentVariable2, char childVariable1, long childVariable2) {
        super(parentVariable1, parentVariable2);
        this.childVariable1 = childVariable1;
        this.childVariable2 = childVariable2;
    }

    public void childMethod1() {
        System.out.println("Child 2 Method 1");
    }

    public void childMethod2() {
        System.out.println("Child 2 Method 2");
    }
}

public class Main {
    public static void main(String[] args) {
        // Example 1
        ParentClass example1 = new ParentClass(10, "Example 1");
        example1.parentMethod1();
        example1.parentMethod2();

        // Example 2
        ChildClass1 example2 = new ChildClass1(20, "Example 2", 3.14, true);
        example2.parentMethod1();
        example2.parentMethod2();
        example2.childMethod1();
        example2.childMethod2();

        // Example 3
        ChildClass2 example3 = new ChildClass2(30, "Example 3", 'A', 123456789L);
        example3.parentMethod1();
        example3.parentMethod2();
        example3.childMethod1();
        example3.childMethod2();
    }
}
