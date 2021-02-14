## C dasturlash tili

C - kompyuterga eng yaqin, past darajali va kompilatsya bo'luvchi dasturlash tili.

GCC kompilyator kerek

sudo apt-get install gcc

main.c fayli yaratamiz va ichiga quyidegilarni yozamiz:

```c
#include "stdio.h"
void main(){
	printf("hello world");
}
```

```console
gcc main.c -o main

./main

hello world
```

chiqadi konsolda.

#include <stdio.h> deb yossekham bo'laveradi

Mavzu larga o'tish:

[O'zgaruvchi](langs/cLang/vareable.md)
	
[Struktura](langs/cLang/struct.md)
	
[Header](langs/cLang/header.md)
	
[Funksya](langs/cLang/function.md)
	
[Fayl](langs/cLang/file.md)
	
[Konsol](langs/cLang/console.md) - to'g'ridan to'g'ri kiritish chiqarish
	
[scanf](langs/cLang/consoleIn.md) - konsoldan kiritish funksyasi
	
[Printf](langs/cLang/consoleOut.md) - konsolga chiqarish funksyasi

### Konstanta

```c
#include <stdio.h>
 
const int number = 2; // glabal
void main(){
    printf("number = %d \n", number);
    // number = 55;  эта строка работать не будет, так как number - это константа
}
```

### Arefmitik amallar

+ - * / %

/ da 5.0/2 bo'lsa 2.5 chiqadi 5/2 da 4 chiqadi

++a - prefeks incriment
a++ - postfeks incriment

--a - prefeks dekriment
a-- - postfeks dekriment

solishtirish amallari

== > < <= >= !=

! && ||

<< >>

& | ^ ~

^ - o'xshashlikni inkor qiladi, modulli qo'shish

+= -= *= /= %= <<= >>= &= |= ^=

### 1 tipdan 2-tipga o'tkazish

```c
int a = 10;
int b = 4;
int c = a / b;                      // 2
double d = a / b;                   // 2.00000
double e = (double)a / (double)b;   // 2.50000
printf("c = %d \n", c);
printf("d = %f \n", d);
printf("e = %f \n", e);
```

char -> short -> int -> long

unsigned char -> unsigned short -> unsigned int -> unsigned long

float -> double -> long double

### C operatorlari

if(bool) code;

if(bool) code1; else code2;

if(bool1) code1; else if(bool2) code2; else code3;

switch(value){
	case val1: code1; break;
	case val2: code2; break;
	
	default: codeN;
}

int a = 4>3 ? 4 : 3; // 1 ta satrda o'zgaruvchiga if shartini qisqacha yozsa bo'ladi

for(head; bool; loop){
	code;
}

do{
	code;
}while(bool);

while(bool){
	code;
}

break - siklni to'xtatadi

continue - siklni 1ta tashlab o'tadi

### Massivlar

int massiv[n];

int i[3];
i[0] = 3;

int j[] = {1,2,3,4};

int numbers[5] = { 10, 12}; // 10, 12, 0, 0, 0

int numbers[3][2] = { {1, 2}, {4, 5}, {7, 8} };

char welcome[] = "Hello";

### Ko'rsatkich

```c
#include <stdio.h>
 
int main(void){
    int x = 10;		// определяем переменную
    int *p;			// определяем указатель
    p = &x;			// указатель получает адрес переменной
    printf("%p \n", p);     // 0060FEA8
}
```
































