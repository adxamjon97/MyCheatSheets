# Java dasturlash tilida dasturlash

java jdk o'rnatib olamiz.

main.java nomli fayl ochib ichiga quyidegilarni yozamiz:

```java
public class Main{
  public static void main(String[] args){
    System.out.println("hello world");
  }
}
```

[O'zgaruvchi](langs/java/vareable.md)

[matin](langs/java/string.md)

[fayl](langs/java/file.md)

### Javaning asosiy shart va takrorlanuvchi operatorlari

```java
if(false){/*code*/}else{/*code*/}
switch(x){case 1: /*code*/ break; default: /*code*/};
while(false){}
do{/*code*/}while(false);
for(;;){/*code*/}
for(type var:vars){/*code*/} // foreach :
// break continue sikldan chiqsh o'tkazish
```

- - -

### Massivlar

```java
int[] arr = {12,23}; // massiv hosil qilish
arr[0]; // massivni chaqirish
arr.length

int[][] arr={{},{},{}};
```

- - -

### Metodlar (Funksylar)

```java
static void myMethod(String name, int age){/*code*/}  // void int
Math.max(x,y) // min(x,y) sqrt(x) abs(x) random() 0,0..1,0
final // konstanta
```

### OOP (class va obyektlar)

```java
public class Car {// class yaratish
  int modelYear;
  String modelName;

  public Car(int year, String name) {
    modelYear = year;
    modelName = name;
  }

  public static void metod(String[] args) {
    Car myCar = new Car(1969, "Mustang"); // obyekt yaratish
    System.out.println(myCar.modelYear + " " + myCar.modelName);
  }
} // public private protected

public abstract void study(); // abstract tanasiga ega bo'lmedi uni avlodi ega faqat
class Student extends Main{
  public void study(){/*code*/};
} //sherda

// inkapsulatsya privat qib get set bilan olish, this.name = name;
```

### Konsoldan kiritish

```java
import java.util.Scanner;
// import package.name.Class;

Scanner myobj = new Scanner(System.in);
String userName = myobj.nextLine(); // malumot kiritng
// nextDouble() nextInt() nextChar()
```

### Shaxshiy paket yaratish

*Java paketlari papkalar strukturasiga o'xshedi*

```md
masalan
  └── root
    └── mypack
      └── MyPackageClass.java

Чтобы создать пакет, используйте package ключевое слово:
```

*MyPackageClass.java*

```java
package mypack;

class MyPackageClass {
  public static void main(String[] args) {
    System.out.println("This is my package!");
  }
}
```

Сохраните файл как MyPackageClass.java и скомпилируйте его:

```console
C:\Users\Your Name>javac MyPackageClass.java
Затем скомпилируйте пакет:

C:\Users\Your Name>javac -d . MyPackageClass.java
Это заставляет компилятор создать пакет «mypack».
```

*-d Ключевое слово указывает место для куда сохранить файл класса.
Вы можете использовать любое имя каталога, например c:/user (windows), или,
если вы хотите сохранить пакет в том же каталоге,
вы можете использовать знак точки « .», как в примере выше.*

*Примечание. Имя пакета следует писать в нижнем регистре,
чтобы избежать конфликта с именами классов.*

*Когда мы скомпилировали пакет в приведенном выше примере,
была создана новая папка с именем «mypack».*

*Чтобы запустить файл MyPackageClass.java, напишите следующее:*

```console
C:\Users\Your Name>java mypack.MyPackageClass

Результат будет:
This is my package!
```

- - -

### interfeys

```java
interface Animal{
  public void sleep();
}

class Pig implements Animal{}
// abstraksyaga o'xshedi public abstrackt
```

### enumiratsya

```java
enum Level{
  LOW,
  MEDIUM,
  HIGH,
}

Level myVar = Level.MEDIUM;

// Level.values()
// Level.MEDIUM => MEDIUM
```

### massiv

```java
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
```

### Collecsya

```java
import java.util.Collactions;

Collections.sort(arr);

import java.util.LinkedList;

LinkedList<int> arr = new LinkedList<int>(); // arrayList bilan birxil

addFirst()    // Adds an item to the beginning of the list.
addLast()     // Add an item to the end of the list
removeFirst() // Remove an item from the beginning of the list.
removeLast()  // Remove an item from the end of the list
getFirst()    // Get the item at the beginning of the list
getLast()     // Get the item at the end of the list
```

### Hato

```java
try{}catch(Exception e){}finally{}    // hatoni tekshirish
throw new ArithmeticException("asd"); // hato qaytarish
```

### Patoklar bilan ishlash

```java
public class Main extends Thread{
  public static void main(String[] args){
    Main thread = new Main();
    thread.start()
  }

  public void run(){}
}
```

### arrow function and foreach

```java
import java.util.function.Consumer;
Consumer<Interger> method = (n) -> {System.out.println(n);};

arr.forEach(method);
```

- - -


