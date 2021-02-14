## Funksyalar

```c
#include <stdio.h>
 
void hello(){
    printf("Hello!\n");
}
 
void main(){   
    hello();
    hello();
    return 0;
}
```

yoki

```c
#include <stdio.h>

void hello(); // описание
 
void main(){
    hello();
    hello();
    return 0;
}

void hello(){ // определение
    printf("Hello!\n");
}
```

rekursivli va qiymat qaytaruvchi funksya

```c
#include <stdio.h>
 
int factorial(int n){
    if (n == 1) return 1;
    else return n * factorial(n - 1);
}

void main(){
    int result = factorial(6);
    printf("%d \n", result);    // 720
}
```

static qiymat

```c
#include <stdio.h>
 
void display(){
    static int i = 0;
    i++;
    printf("i=%d \n", i);
}
 
void main(){
    display(); // 1
    display(); // 2
    display(); // 3
}
```

register int x = 8;
И к параметрам функции:

void display(register int a){
    printf("a=%d \n", a);
}

tezlatishi mumkin ekan

