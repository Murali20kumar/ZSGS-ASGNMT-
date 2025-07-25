public class MyString {

  private char [] data;

  public MyString(char[] input){
    data = new char[input.length];
    for(int i=0; i < input.length; i++){
     data[i] = input[i];
    }
  }
   
  public MyString(String input){
    data = new char[input.length()];
    for(int i =0; i < input.length(); i++){
     data[i] = input.charAt(i);
    }
  }

  public int length() {
    return data.length;
  }
  
  public char charAt(int index){
    if(index < 0 || index >= data.length) throw new IndexOutOfBoundsException();
    return data[index];
  }

  public boolean equals(MyString other){
    if(this.length () != other.length()) return false;
    for(int i=0; i < data.length; i++){
      if(this.data[i] != other.data[i]){
        return false;
      }
    }
    return true;
  }


 public MyString toUpperCase() {
   char[] upper = new char[data.length];
        for (int i = 0; i < data.length; i++) {
            char ch = data[i];
            upper[i] = (ch >= 'a' && ch <= 'z') ? (char)(ch - 32) : ch;
        }
    return new MyString(upper);
 }

 public MyString toLowerCase(){

   char[] lower = new char[data.length];
        for (int i = 0; i < data.length; i++) {
            char ch = data[i];
            lower[i] = (ch >= 'A' && ch <= 'Z') ? (char)(ch + 32) : ch;
        }
   return new MyString(lower);

 }

public MyString substring(int start, int end){
  if(start < 0  || end > data.length || start > end) throw new IndexOutOfBoundsException();
  char[] sub = new char[end - start];
        for (int i = start; i < end; i++) {
            sub[i - start] = data[i];
        }
  return new MyString(sub);

}

public MyString concat (MyString other){
  char[] concatenation = new char[this.length() + other.length()];
  for(int i=0; i < this.length(); i++){
   concatenation[i] = this.data[i];
  }
  for(int j=0 ; j < other.length(); j++){
    concatenation[this.length() + j] = other.data[j];
  }

 return new MyString(concatenation);
}


public boolean contains(MyString sub){
  
   int n = this.length();
   int m = sub.length();

   if(m > n) return false;

   for(int i=0; i <= n-m; i++){

    boolean match = true;
    for(int j=0; j < m; j++){
     if(this.data[i+j] != sub.data[j]){
       match = false;
       break;
     }
    }
    if(match) return true;
   }
  return false;
}

public int indexOf(char ch) {
   for (int i = 0; i < data.length; i++) {
            if (data[i] == ch) return i;
        }
        return -1;
}

public MyString replace(char oldChar, char newChar){
  char[] replaced = new char[data.length];
        for (int i = 0; i < data.length; i++) {
            replaced[i] = (data[i] == oldChar) ? newChar : data[i];
        }
   return new MyString(replaced);
}

 public String toString() {
        StringBuilder sb = new StringBuilder();
        for (char c : data) {
            sb.append(c);
        }
    return sb.toString();
 }
}