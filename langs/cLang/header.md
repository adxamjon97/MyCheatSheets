### (# belgisi) bilan bajariluvchi amallar

#define: определяет макрос или препроцессорный идентификатор

#undef: отменяет определение макроса или идентификатора

#ifdef: проверяет, определен ли идентификатор

#ifndef: проверяет неопределенности идентификатор

#include: включает текст из файла

#if: проверяет условие выражение (как условная конструкция if)

#else: задает альтернативное условие для #if

#endif: окончание условной директивы #if

#elif: задает альтернативное условие для #if

#line: меняет номер следующей ниже строки

#error: формирует текст сообщения об ошибке трансляции

#pragma: определяет действия, которые зависят от конкретной реализации компилятора

#: пустая директива, по сути ничего не делает

#include <имя_файла>  // имя файла в угловых скобках

#include "имя_файла"  // имя файла в кавычках

#include <stdio.h> // printf() scanf() lar uchun

assert.h: отвечает за диагностику программ

complex.h: для работы с комплексными числами

ctype.h: отвечает за преобразование и проверку символов

errno.h: отвечает за проверку ошибок

fenv.h: для доступа к окружению, которое управляет операциями с числами с плавающей точкой

float.h: отвечает за работу с числами с плавающей точкой

inttypes.h: для работы с большими целыми числами

iso646.h: содержит ряд определений, которые расширяют ряд логических операций

limits.h: содержит предельные значения целочисленных типов

locale.h: отвечает за работу с локальной культурой

math.h: для работы с математическими выражениями

setjmp.h: определяет возможности нелокальных переходов

signal.h: для обработки исключительных ситуаций

stdalign.h: для выравнивания типов

stdarg.h: обеспечивает поддержку переменного числа параметров

stdatomic.h: для выполнения атомарных операций по разделяемым данным между потоками

stdbool.h: для работы с типом _Bool

stddef.h: содержит ряд вспомогательных определений

stdint.h: для работы с целыми числами

stdio.h: для работы со средствами ввода-вывода

stdlib.h: содержит определения и прототипы функций общего пользования

stdnoreturn.h: содержит макрос noreturn

string.h: для работы со строками

tgmath.h: подключает math.h и complex.h плюс добавляет дополнительные возможности по работе с математическими вычислениями

threads.h: для работы с потоками

time.h: для работы с датами и временем

uchar.h: для работы с символами в кодировке Unicode

wchar.h: для работы с символами

wctype.h: содержит дополнительные возможности для работы с символами

dasturni bir nechta fayllarga bo'lib tuzamiz

main.c

```c
int number = 5;
```

main2.c

```c
#include <stdio.h>
#include "main.c"
 
void main(){
    printf("%d", number);   // 5
}
```

```c
#define BEGIN {
#define END }
#define N 23
 
void main()
BEGIN
    int x = N;
END

// #undef N  bu o'chiradi N o'zgaruvchisini
```

```c
#include <stdio.h>
 
#define HELLO printf("Hello World! \n")
#define FOR for(int i=0; i<4; i++)
 
void main(){
    FOR HELLO;
}
```

```c
#include <stdio.h>
#define print(a) printf("%d \n", a)
 
void main(){
    int x = 10;
    print(x);
    int y =20;
    print(y);
    print(22);
}
```

```c
#include <stdio.h>
 
#define t int
#define swap(t, x, y) { t temp = x; x = y; y=temp;}
 
void main(){
    t x = 4;
    t y = 10;
    swap(t, x, y)
    printf("x=%d \t y=%d", x, y);
}
```

```c
#include <stdio.h>
#define min(a,b) (a < b ? a : b)
 
void main(){
    int x = 23;
    int y = 14;
    int z = min(x,y);
    printf("min = %d", z);  // min = 14
}
```

 # va ## belgilari
 
```c
#include <stdio.h>
#define print_int(n) printf(#n"=%d \n",n);
 
void main(){
    int x = 23;
    print_int(x);       // x=23
    int y = 14;
    print_int(y);       // y=14
    int number = 203;
    print_int(number);  // number=203
}
```

```c
#include <stdio.h>
#define print(a,b,c) printf("%d", a##b##c);
 
void main(){
    print(2, 81, 34);   // 28134
}
```

```c
#include <stdio.h>
#define unite(a,b,c) a##b##c;
 
void main(){
    int x = unite(2, 81, 34);   // 28134
    printf("%d \n", x);
}
```

 #if - shart asosida kodni qo'shadi

```c
#include <stdio.h>
#define N 24
 
void main(){
#if N==22
    printf("N = 22");
#elif N==24
    printf("N=24");
#else
    printf("N is undefined");
#endif
}
```

#ifdef - define bor yo'qligiga qarab kodni qo'shadi

```c
#include <stdio.h>
#define DEBUG
 
void main(void){
#ifdef DEBUG
    printf("Debug mode");
#endif
}
```

