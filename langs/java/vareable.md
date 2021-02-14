### Ma'lumotlar turlari

```Java
String  name       = "Adxamjon";
int     age        = 24;
float   myFloatNum = 5.99f;
char    myLetter   = 'D';
boolean myBool     = true;
```

- - -

### Qanday ma'lumot xotradan qancha joy egallashi

| type    | xotira  | hajm                        |
|---------|---------|-----------------------------|
| byte    | 1 byte  | +-127                       |
| short   | 2 bytes | +-32 767                    |
| int     | 4 bytes | +-2 147 483 647             |
| long    | 8 bytes | +-9 223 372 036 854 775 807 |
| float   | 4 bytes | (,) keyin 6 to 7            |
| double  | 8 bytes | (,) keyin 15                |
| boolean | 1 bit   | true false                  |
| char    | 2 bytes | ASCII                       |

- - -

### 1 turdan 2-turga o'tkazish

byte -> short -> char -> int -> long -> float -> double

double -> float -> long -> int -> char -> short -> byte

```java
int myInt = 9;
double myDouble = myInt;

double myDouble2 = 9.78;
int myInt = (int) myDouble2;
```
