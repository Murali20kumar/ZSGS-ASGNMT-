class Base {
    private void privateMethod() {
        System.out.println("Base: private method");
    }

    public final void finalMethod() {
        System.out.println("Base: final method");
    }

    public static void staticMethod() {
        System.out.println("Base: static method");
    }

    public void normalMethod() {
        System.out.println("Base: normal method");
    }
}

class Derived extends Base {
    // This method won't override
    private void privateMethod() {
        System.out.println("Derived: private method");
    }

    // Method hiding - not overriding
    public static void staticMethod() {
        System.out.println("Derived: static method");
    }

    // This is actual overriding
    @Override
    public void normalMethod() {
        System.out.println("Derived: overridden normal method");
    }
}

public class Example {
    public static void main(String[] args) {
        Base obj = new Derived();

        // Calls Base's static method due to static binding
        Base.staticMethod();    

        // Calls Derived's overridden method due to dynamic dispatch
        obj.normalMethod();     

        // finalMethod is inherited, but can't be overridden
        obj.finalMethod();      

    }
}