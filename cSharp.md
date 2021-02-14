# C# (sharp) dasturlash tili

### Hello world

```cs
using System;

namespace Program{
  class Prog{
    static void Main(string[] args){
      Console.WriteLine("Hello world");
    }
  }
}
```

```cs
WriteLine();
Write();
ReadLine();
ReadKey();
```
[O'zgaruvchi](langs/cSharp/variable.md)

[Klas va obyekt](langs/cSharp/oop.md)

### Matin metidlari

```cs
string txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
txt.Length;
txt.ToLower();    // kichik harflarda
txt.ToUpper();    // katta harflarda
txt.IndexOf("E"); // E ni indexni qaytaradi
txt.Substring(i); // i raqamdegi indexda turgan elementni oladi
```

### Operatorlar

```cs
if(bool){code}
if(bool){code}else{code}
if(bool){code}else if(bool){code}else{code}

switch(val){case 1: code; break; default: code;};

while(bool){code}
do{code}while(bool)

for(head; bool; speed){code}
foreach(type val in arr){ code }
// break continue
```

### Massivlar

```cs
int[] arr;
int[] arr = new int[]{1,2,3};
int[] arr = {1,2,3};
arr[0];

Array.Sort(arr);

using System.Linq;

arr.Max();
arr.Min();
arr.Sum();

string[] cars = new string[4];
string[] cars = new string[4] {"Volvo", "BMW", "Ford", "Mazda"};
string[] cars = new string[] {"Volvo", "BMW", "Ford", "Mazda"};
string[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
```

### Metidlar

```cs
class Program{
  static void MyMethod(){ // e'lon qilish
    // code to be executed
  }

  static void Main(){
    MyMethod(); // chaqirish
  }
}
```

### Nom berib ketish

```cs
static void MyMethod(string country = "Norway"){
  Console.WriteLine(country);
}

static void Main(string[] args){
  MyMethod("Sweden");
  MyMethod("India");
  MyMethod();
  MyMethod("USA");
}

// Sweden
// India
// Norway
// USA
```

### Metidni qayta yuklash

```cs
int MyMethod(int x)
float MyMethod(float x)
double MyMethod(double x, double y)
```

### Fayillar bilan ishlash

```cs
using System.IO;  // include the System.IO namespace

File.SomeFileMethod();  // use the file class with methods
```

| Method         | Description          |
|----------------|----------------------|
| AppendText()   | matin qo'shadi       |
| Copy()         | Copies a file        |
| Create()       | yaratadi             |
| Delete()       | o'chiradi            |
| Exists()       | borligini tekshiradi |
| ReadAllText()  | o'qiydi              |
| Replace()      | almashtiradi         |
| WriteAllText() | yozadi               |

faylga solish va o'qish

```cs
using System.IO;  // include the System.IO namespace

string writeText = "Hello World!";
File.WriteAllText("filename.txt", writeText);
// Create a file and write the content of writeText to it

string readText = File.ReadAllText("filename.txt");
// Read the contents of the file
Console.WriteLine(readText);

// Hello World!
```

### Hatoni kuzatadi

```cs
try{
  int[] myNumbers = {1, 2, 3};
  Console.WriteLine(myNumbers[10]);
}catch(Exception e){
  Console.WriteLine(e.Message);
}
```

finally

```cs
try{
  int[] myNumbers = {1, 2, 3};
  Console.WriteLine(myNumbers[10]);
}catch (Exception e){
  Console.WriteLine("Something went wrong.");
}finally{
  Console.WriteLine("The 'try catch' is finished.");
}

// hatoni chaqiradi
// throw new ArithmeticException("You must be at least 18 years old.");
```
