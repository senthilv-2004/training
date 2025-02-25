
abstract class AbstractClass {
    public final void display() {
        System.out.println("This is a final method in AbstractClass.");
    }
    
    public abstract void performAction();
}

class DerivedClass1 extends AbstractClass {
    public void performAction() {
        System.out.println("Performing action in DerivedClass1.");
    }
}

class DerivedClass2 extends AbstractClass {
    
    public void performAction() {
        System.out.println("Performing action in DerivedClass2.");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        AbstractClass obj1 = new DerivedClass1();
        obj1.display();
        obj1.performAction(); 
        
        AbstractClass obj2 = new DerivedClass2();
        obj2.display();
        obj2.performAction();
    }
}
