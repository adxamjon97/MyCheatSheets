# Console - konsol orqali kiritish-chiqarish

Стандартный поток ввода stdin

Стандартный поток вывода stdout

Стандартный поток вывода сообщений об ошибках stderr

getchar(): ввод с клавиатуры одного символа

putchar(): вывод на консоль одного символа

gets(): ввод одной строки

puts(): вывод одной строки на консоль

scanf(): ввод с форматированием данных

printf(): вывод с форматированием данных

```c
#include <stdio.h>
 
void main(){
    char name[20];
    puts("Enter name:");
     
    gets(name);
    printf("Your name: %s", name);
}
```

```c
#include <stdio.h>
 
void main(){
    printf("1");
    getchar(); // ожидание ввода символа
    printf("2");
    getchar(); // ожидание ввода символа
    printf("3");
}
```

```c
#include <stdio.h>
 
void main(){
    int c;
     
    while((c=getchar())!=EOF){
        putchar(c);
    }
}
```





























