### Ma'lumot kiritish

scanf(farmat, argumentlar);

%c: считывает один символ

%d: считывает десятичное целое число

%i: считывает целое число в любой системе (десятичной, шестнадцатеричной, восьмеричной)

%u: считывает положительное целое число

%e: считывает число с плавающей точкой в экспоненциальной форме

%E: считывает число с плавающей точкой в экспоненциальной форме с заглавным символом экспоненты

%f: считывает число с плавающей точкой

%F: считывает число с плавающей точкой

%g: считывает число с плавающей точкой

%G: считывает число с плавающей точкой

%o: считывает восьмеричное число

%x: считывает шестнадцатеричное число

%X: считывает шестнадцатеричное число

%s: считывает строку

%%: считывает символ процента

- - -

h: для ввода значений типа short int (%hd)

l: для ввода значений типа long int (%ld) или double (%lf, %le)

L: для ввода значений типа long double (%Lf, %Le)

scanf() & belgisi orqali o'zgaruvchiga qiymatni yuboradi masalan: 

```c
#include <stdio.h>
 
void main(){
    int age;
    printf("Input your age:");
    scanf("%d", &age);
     
    printf("age = %d", age);
}
```

yoki satr kiritish

```c
#include <stdio.h>
 
void main(){
    int age;
    char name[10];
    
    // вводим возраст
    printf("Your age: ");
    scanf("%d", &age);
    
    // вводим имя
    printf("Your name: ");
    scanf("%10s", &name);
     
    printf("Name: %s \t Age = %d",name,  age);
}
```

yoki bir nechta argumentni qabul qilish

```c
#include <stdio.h>
 
void main(){
    int age;
    char name[10];
    float weight;
    
    scanf("%d %s %f", &age, &name, &weight);
     
    printf("Name: %s \t Age = %d \t Weight = %f",name,  age, weight);
}
```
