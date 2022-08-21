class MyClass {
    public static void main(String[] args) {
		System.out.println("Hello World");
    }
}

ВВод
import java.util.Scanner;
class MyClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextLine());
    }
}

import java.util.Scanner;
class MyClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        double y = sc.nextDouble();
        String s = sc.nextLine();
    }
}

import java.util.Scanner;
class MyNumber {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = x + y;
            System.out.println(z);
   }
}

import java.util.Scanner; //часы
class MySolution {
    public static void main(String[] args)
    {
     Scanner sr = new Scanner(System.in);             
int a = sr.nextInt();       
 a = a%86400;              
int w = (a /3600);
int q = ((a % 3600)/60);        
int t =((a % 3600)%60);          
System.out.format ("%02d"+":"+"%02d"+":"+"%02d", w,q,t);                              
}
}
import java.util.Scanner;
class main {
    public static void main(String[] args) {
String firstWord, secondWord;
firstWord = "Hello";
secondWord = "World";
System.out.println(firstWord + " " + secondWord + "!"); //Hello World!
	}
}

import java.util.Scanner;
class main {
    public static void main(String[] args) {
String word = "Java is strong";
int x = word.length(); // возвращает длину строки str (количество символов, включая пробелы)
System.out.println(x); // 14
	}
}

class MyProgram {
   public static void main(String[] args) {
String word1 = "Java";
String word2 = "Python";
System.out.println(word1.equals(word2)); // false

String word3 = "Ja";
String word4 = "va";
boolean result = word1.equals(word3 + word4); 
System.out.println(result); // true
   }
}

class MyProgram {
   public static void main(String[] args) {
String word = "abracadabra";
int x = word.indexOf('b');
System.out.println(x); // 1

int y = word.indexOf('Z');
System.out.println(y); // -1
}
}

class MyProgram {
   public static void main(String[] args) {
String word = "abracadabra";

char letter_0 = word.charAt(0);
System.out.println(letter_0); // a

char letter_4 = word.charAt(4);
System.out.println(letter_4); // c
}
}

class MyProgram {
   public static void main(String[] args) {
String str1 = "Hubba Bubba";
String str2 = "   ";
String str3 = "";

boolean value1 = str1.isEmpty(); // false
boolean value2 = str2.isEmpty(); // false
boolean value3 = str3.isEmpty(); // true
}
}

class MyProgram {
   public static void main(String[] args) {
String str1 = "One Two Three";
String str2 = "One";
String str3 = "Four";

boolean value1 = str1.contains(str2); // true
boolean value1 = str1.contains(str3); // false
}
}

class MyProgram {
   public static void main(String[] args) {
String s = "I'll be back";
System.out.println(s.toLowerCase()); // i'll be back
System.out.println(s.toUpperCase()); // I'LL BE BACK
}
}

class MyProgram {
   public static void main(String[] args) {
int n = 12345;                      // Это число типа int
System.out.println(n);              // 12345 

String str1 = Integer.toString(n);  // Это строка
System.out.println(str1);           // 12345

Integer num = n;                    // Это число-объект класса Integer
System.out.println(num);            // 12345

String str2 = num.toString();        // Это строка
System.out.println(str2);            // 12345
}
}

class MyProgram {
   public static void main(String[] args) {
String str = "12345";
Integer num = Integer.valueOf(str);  // num - объект класса Integer
System.out.println(num);             // 12345

int num1 = num;                      // num1 - переменная типа int
System.out.println(num1);            // 12345
}
}

class MyProgram {
   public static void main(String[] args) {
String str = "12345";

int num = Integer.parseInt(str);    //num - переменная типа int
System.out.println(num);            //12345
}
}

class MyProgram {
   public static void main(String[] args) {
String str = "Добро пожаловать в мир Java!";
System.out.println(str.substring(6));         //пожаловать в мир Java!
System.out.println(str.substring(6, 15));     //пожаловат
}
}

class MyProgram {
   public static void main(String[] args) {
String str = "Добро пожаловать в мир Java!";
System.out.println(str.replace('о', 'А')); //ДАбрА пАжалАвать в мир Java!
}
}

import java.util.Scanner;
class new_1 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        String r = ss.nextLine();
        String c = ss.nextLine();
        String cr = r + " " + c;
        int x = cr.length(); // возвращает длину строки str (количество символов, включая пробелы)
        System.out.println(cr); // 15
        System.out.println(x); // My name is John
    }
}

import java.util.Scanner;
class new_1 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int r = ss.nextInt();
        int c = ss.nextInt();
        int cr = r + c;
        String r1 = Integer.toString(r);
        String c1 = Integer.toString(c);
        System.out.println(cr); // 19
        System.out.println(r1 + c1); // 811
    }
}

import java.util.Scanner; //если первые буквы слов идут по алфавиту true иначе false
class program {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String s = sr.nextLine(); // task angel
        System.out.print(s.charAt(0)<s.charAt(s.indexOf(' ')+1)); //false
    }
}
 
class MyProgram {
   public static void main(String[] args) {

}
}