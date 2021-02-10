// java dasturlash tilida dasturlash
// java jdk o'rnatib olamiz.

public class Main{
	public static void main(String[] args){
		System.out.println("hello world");
	}
}

// ma'lumotlar turlari
String  name = "Adxamjon";	
int     age = 24;
float   myFloatNum = 5.99f;
char    myLetter = 'D';
boolean myBool = true;

// qanday ma'lumot xotradan qancha joy egallashi
// byte		1 byte	Stores whole numbers from -128 to 127
// short	2 bytes	Stores whole numbers from -32,768 to 32,767
// int		4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
// long		8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
// float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
// double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
// boolean	1 bit	Stores true or false values
// char		2 bytes	Stores a single character/letter or ASCII values

// Расширение приведения (автоматически) - преобразование меньшего типа в больший размер
// byte-> short-> char-> int-> long-> float->double

// Narrowing Casting (вручную) - преобразование шрифта большего размера в тип меньшего размера
// double-> float-> long-> int-> char-> short->byte

// 1-tipdan 2-tipga o'tkazish
int myInt = 9;
double myDouble = myInt;

double myDouble2 = 9.78;
int myInt = (int) myDouble2;

// matinlar uchun metdlar
String txt = "matin 'text'"; 	
txt.length();
txt.toUpperCase() txt.toLowerCase()
txt.indexOf('text') // text boshlanish indexnini qaytaradi.

// matinni ("") ichida ishlatiluvchi simvollar
// \'	'	Single quote
// \"	"	Double quote
// \\	\	Backslash

// \n	New Line	
// \r	Carriage Return	
// \t	Tab	
// \b	Backspace	
// \f	Form Feed

Math.max(x,y) // min(x,y) sqrt(x) abs(x) random() 0,0..1,0
if(false){/*code*/}else{/*code*/}
switch(x){case 1: /*code*/ break; default: /*code*/};
while(false){}
do{/*code*/}while(false);
for(;;){/*code*/}
for(type var:vars){/*code*/} // foreach :
// break continue
int[] arr = {12,23}; // massiv hosil qilish
arr[0]; // massivni chaqirish
arr.length

int[][] arr={{},{},{}};
static void myMethod(String name, int age){/*code*/}  // void int 
final // konstanta

Main myObj = new Main(); // obyekt class Main(){}
	

public class Car {
  int modelYear;
  String modelName;

  public Car(int year, String name) {
    modelYear = year;
    modelName = name;
  }

  public static void metod(String[] args) {
    Car myCar = new Car(1969, "Mustang");
    System.out.println(myCar.modelYear + " " + myCar.modelName);
  }
} // public private protected

public abstract void study(); // abstract tanasiga ega bo'lmedi uni avlodi ega faqat
class Student extends Main{ public void study(){};} //sherda

// inkapsulatsya privat qib get set bilan olish, this.name = name;
import package.name.Class;
import java.util.Scanner;
Scanner myobj = new Scanner(System.in);
String userName = myobj.nextLine(); // malumot kiritng

// Пользовательские пакеты
// Чтобы создать свой собственный пакет, вы должны понимать, 
// что Java использует каталог файловой системы для их хранения. 
// Как и папки на вашем компьютере:

// пример
// └── root
//   └── mypack
//     └── MyPackageClass.java
// Чтобы создать пакет, используйте packageключевое слово:

MyPackageClass.java
package mypack;
class MyPackageClass {
  public static void main(String[] args) {
    System.out.println("This is my package!");
  }
}

// Сохраните файл как MyPackageClass.java и скомпилируйте его:

// C:\Users\Your Name>javac MyPackageClass.java
// Затем скомпилируйте пакет:

// C:\Users\Your Name>javac -d . MyPackageClass.java
// Это заставляет компилятор создать пакет «mypack».

// -d Ключевое слово указывает место для куда сохранить файл класса. 
// Вы можете использовать любое имя каталога, например c: / user (windows), или, 
// если вы хотите сохранить пакет в том же каталоге, 
// вы можете использовать знак точки « .», как в примере выше.

// Примечание. Имя пакета следует писать в нижнем регистре, 
// чтобы избежать конфликта с именами классов.

// Когда мы скомпилировали пакет в приведенном выше примере, 
// была создана новая папка с именем «mypack».

// Чтобы запустить файл MyPackageClass.java , напишите следующее:

// C:\Users\Your Name>java mypack.MyPackageClass
// Результат будет:

// This is my package!
// =====================

interface Animal{
	public void sleep();
}
	
class Pig implements Animal{}
// abstraksyaga o'xshedi public abstrackt

enum Level{
	LOW,
	MEDIUM,
	HIGH,
}

{Level myVar = Level.MEDIUM;} // Level.values() // Level.MEDIUM => MEDIUM

// nextDouble() nextInt() nextChar()

import java.time.LocalDate;
LocalDate myObj = LocalDate.now();

import java.util.ArrayList;
ArrayList<String> arr = new ArrayList<String>();
arr.add("text");
arr.get(0);
arr.set(0, "text2");
arr.remove(0);
arr.clear();
arr.size(); // length

import java.util.Collactions;

Collections.sort(arr);

import java.util.LinkedList; 

LinkedList<int> arr = new LinkedList<int>(); // arrayList bilan birxil

addFirst()		// Adds an item to the beginning of the list.	
addLast()		// Add an item to the end of the list	
removeFirst()	// Remove an item from the beginning of the list.	
removeLast()	// Remove an item from the end of the list	
getFirst()		// Get the item at the beginning of the list	
getLast()		// Get the item at the end of the list

try{}catch(Exception e){}finally{}
throw new ArithmeticException("asd");

public class Main extends Thread{
	public static void main(String[] args){
		Main thread = new Main();
		thread.start()
	}
	
	public void run(){}
}


import java.util.function.Consumer;
Consumer<Interger> method = (n) -> {System.out.println(n);};

arr.forEach(method);



































