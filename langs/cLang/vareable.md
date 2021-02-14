### O'zgaruvchilar

unsigned and signed 

```c
int number;
int x = 3;
x = 5;
printf("number: %d \n", x);
```

o'zgaruvchilar turlari:

```c
int number = 2;
int a, b;
char c ='d';
float d = -2.1345;
double f = 3.45;
```

ma'lumot hajmi

```c
#include <stdio.h>
 
void main(){
    int number = 2;
    printf("sizeof(number) = %d \n", sizeof(number));
}
```

ma'lumot sximi min max

```c
#include <stdio.h>
#include <limits.h>
 
void main(){
    printf("INT_MIN = %d \n", INT_MIN);
    printf("INT_MAX = %d \n", INT_MAX);
}
```

