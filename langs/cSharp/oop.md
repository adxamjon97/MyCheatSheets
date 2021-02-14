# OOP (obyekt class modulelar) (yoqtirgan narsalarimdan biri)

prog2.cs va prog.cs yaratamiz ...

```cs
// prog2.cs
class Car{
  public string color = "red";
}

// prog.cs
class Program{
  static void Main(string[] args){
    Car myObj = new Car();
    Console.WriteLine(myObj.color);
  }
}
```

### Obyekt yaratish

```cs
class Car{
  string model;
  string color;
  int year;

  static void Main(string[] args){
    Car Ford = new Car(); // 1-obyekt
    Ford.model = "Mustang";
    Ford.color = "red";
    Ford.year = 1969;

    Car Opel = new Car(); // 2-obyekt
    Opel.model = "Astra";
    Opel.color = "white";
    Opel.year = 2005;

    Console.WriteLine(Ford.model);
    Console.WriteLine(Opel.model);
  }
}
```

```cs
class Car{
  public string model;  // model o'zgaruvchi yaratildi
  public Car(){
    model = "Mustang"; // qiymat berildi
  }

  static void Main(string[] args){
    Car Ford = new Car(); // obyekt yaratildi
    Console.WriteLine(Ford.model);  // qiymat chop etildi
  }
}
```

public private protected internal

```cs
// get set
class Person{
  private string name; // field
  public string Name{
    get { return name; }   // get method
    set { name = value; }  // set method
  }
}
```

### Nasil olish

```cs
class Vehicle{// class bobo classi yaratildi
  public string brand = "Ford";
  public void honk(){
    Console.WriteLine("Tuut, tuut!");
  }
}

class Car : Vehicle{ // class farzandi
  public string modelName = "Mustang";  // Car field
}

class Program{
  static void Main(string[] args){
    Car myCar = new Car(); // obyekti
	myCar.honk();
    Console.WriteLine(myCar.brand + " " + myCar.modelName);
  }
}
```

virtual va override kalit so'zlari

```cs
class Animal{
  public virtual void animalSound(){
    Console.WriteLine("The animal makes a sound");
  }
}

class Pig : Animal{
  public override void animalSound(){
    Console.WriteLine("The pig says: wee wee");
  }
}

class Dog : Animal{
  public override void animalSound(){
    Console.WriteLine("The dog says: bow wow");
  }
}

class Program{
  static void Main(string[] args){
    Animal myAnimal = new Animal();  // Create a Animal object
    Animal myPig    = new Pig();  // Create a Pig object
    Animal myDog    = new Dog();  // Create a Dog object

    myAnimal.animalSound();
    myPig.animalSound();
    myDog.animalSound();
  }
}

// The animal makes a sound
// The pig says: wee wee
// The dog says: bow wow
```

```cs
// Abstract class
abstract class Animal{
  // Abstract method (does not have a body)
  public abstract void animalSound();
  // Regular method
  public void sleep(){
    Console.WriteLine("Zzz");
  }
}

// Derived class (inherit from Animal)
class Pig : Animal{
  public override void animalSound(){
    // The body of animalSound() is provided here
    Console.WriteLine("The pig says: wee wee");
  }
}

class Program{
  static void Main(string[] args){
    Pig myPig = new Pig(); // Create a Pig object
    myPig.animalSound();  // Call the abstract method
    myPig.sleep();  // Call the regular method
  }
}
```

### Interfeys (eng yoqqani manga)

```cs
// Interface
interface IAnimal{
  void animalSound(); // interface method (does not have a body)
}

// Pig "implements" the IAnimal interface
class Pig : IAnimal{
  public void animalSound(){
    // The body of animalSound() is provided here
    Console.WriteLine("The pig says: wee wee");
  }
}

class Program{
  static void Main(string[] args){
    Pig myPig = new Pig();  // Create a Pig object
    myPig.animalSound();
  }
}
```

### Enumiratsya (ajoyib narsa)

```cs
class Program{
  enum Level{
    Low,
    Medium,
    High
  }

  static void Main(string[] args){
    Level myVar = Level.Medium;
    Console.WriteLine(myVar);
  }
}
// Результат будет:
// Medium
