class Parent1 {
    void showMessage() {
        System.out.println("Message from Parent1");
    }
}

class Parent2 {
    void showMessage() {
        System.out.println("Message from Parent2");
    }
}

class Child extends Parent1, Parent2 {
    void display() {
        showMessage(); 
    }
}

public class NotUsed {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}