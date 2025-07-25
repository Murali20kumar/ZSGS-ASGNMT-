public class Main {

 public static void main (String [] args){
    MyString s1 = new MyString("HelloWorld");
        MyString s2 = new MyString("World");

        System.out.println("Original: " + s1);
        System.out.println("Length: " + s1.length());
        System.out.println("CharAt(4): " + s1.charAt(4));
        System.out.println("Equals 'HelloWorld'? " + s1.equals(new MyString("HelloWorld")));
        System.out.println("To Uppercase: " + s1.toUpperCase());
        System.out.println("To Lowercase: " + s1.toLowerCase());
        System.out.println("Substring(0,5): " + s1.substring(0,5));
        System.out.println("Concatenation: " + s1.concat(s2));
        System.out.println("Contains 'World'? " + s1.contains(s2));
        System.out.println("Index of 'W': " + s1.indexOf('W'));
        System.out.println("Replace 'o' with 'x': " + s1.replace('o','x'));

 }
}