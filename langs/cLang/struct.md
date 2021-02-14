# Struktura

strukturani ko'rinishi:

```c
struct name{
    komponentlar;
};
```

misol tariqasida:

```c
struct person{
    int age;
    char * name;
};

// ...

struct person tom;
// or 
struct person tom = {23, "Tom"};
```

kodni to'liq ko'rinishi

```c
#include "stdio.h"

struct person{
    int age;
    char * name;
};
 
void main(){
    struct person tom = {23, "Tom"};
    printf("Age: %d \t Name: %s", tom.age, tom.name);
}
```

yoki boshqa bir misol

```c
#include <stdio.h>
 
struct person{
    int age;
    char name[20];
};

void main(){
    struct person tom = {23, "Tom"};
    printf("Enter name: ");
    scanf("%s", &tom.name);
    printf("Enter age: ");
    scanf("%d", &tom.age);
    printf("Name:%s \t Age: %d", tom.name, tom.age);
}
```

nomini oldindan berib o'tsak bo'ladi:

```c
#include <stdio.h>
 
struct person{
    int age;
    char * name;
} tom, bob, alice;
 
void main(){
    tom.name ="Tom";
    tom.age = 23;
    
    bob.name ="Bob";
    bob.age = 15;
    
    alice.name = "Alice";
    alice.age=25;
    
    printf("Name:%s \t Age: %d", tom.name, tom.age);
}
```

yoki qisqacha qilib defineda ham ko'rsatsak bo'ladi

```c
#include <stdio.h>
 
#define PERSON struct {int age; char name[20];}
 
void main(){
    PERSON tom = {23, "Tom"};
    printf("Name:%s \t Age: %d", tom.name, tom.age);
    return 0;
}
```

ichma ich ham ko'rsatsek bo'ladi strukturalarni:

```c
#include <stdio.h>
 
struct company{
    char name[20];
    char country[30];
};
struct smartphone{
    char title[20];
    int price;
    struct company manufacturer;
};
 
void main(){
    struct smartphone phone = {"iPhone 8", 56000, "Apple", "USA"};
     
    printf("\n Phone: %s", phone.title);
    printf("\n Price: %d", phone.price);
    printf("\n Manufacturer: %s", phone.manufacturer.name);
}
```
strukturali massivlar:

```c
#include <stdio.h>
 
struct person {
    int  age;
    char name[20];
};
 
void main(){
    struct person people[] = {23, "Tom", 32, "Bob", 26, "Alice", 41, "Sam"};
    int n = sizeof(people)/sizeof(people[0]);
    for(int i=0; i<n; i++){
        printf("Name:%s \t Age: %d \n", people[i].name, people[i].age);
    }
}
```

struktura funksya:

```c
#include <stdio.h>
 
struct time{
    int hour;
    int minute;
    int second;
};

struct time addminutes(struct time, int); // прототип функции

void main(){
    struct time current_time = {17, 38, 10};
    int minutes = 21;
     
    struct time result_time = addminutes(current_time, minutes);
    printf("%d:%d:%d \n", result_time.hour, result_time.minute, result_time.second);
     
    result_time = addminutes(current_time, 23);
    printf("%d:%d:%d \n", result_time.hour, result_time.minute, result_time.second);
     
    result_time = addminutes(current_time, 382);
    printf("%d:%d:%d \n", result_time.hour, result_time.minute, result_time.second);
}

struct time addminutes(struct time t, int minutes){
    struct time result ={t.hour, t.minute, t.second};
    int h, d;
    result.minute += minutes; // прибавляем минуты
    if(result.minute >=60){ // если минут больше 59, делим на 60
        h = result.minute / 60;
        result.minute -= 60 * h; // от минут вычитаем 60 * h
        result.hour +=h;  // к часам прибавляем h
    }
 
    if(result.hour >=24){ // если часов больше 23, делим на 24
        d = result.hour / 24;
        result.hour -= 24 * d; // от часов вычитаем d * 24
    }
    return result;
}
```

















