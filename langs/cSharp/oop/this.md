# CSharp klass, struktura, this, metid, maydon va obyekt kalit so'zlari

```csharp
class Person{
    public string name;
    public int age;
 
    public Person() : this("Неизвестно"){}
    public Person(string name) : this(name, 18){}
    public Person(string name, int age){
        this.name = name;
        this.age  = age;
    }
    public void GetInfo(){
        WriteLine($"Имя: {name}  Возраст: {age}");
    }
}
```

```csharp
Person tom = new Person { name = "Tom", age=31 };
tom.GetInfo();          // Имя: Tom  Возраст: 31
```