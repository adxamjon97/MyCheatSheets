# C++ dasturlash tili

Bu dasurlash tili C tilida kelib chiqqan.

g++ kompilyator o'rnatamiz

main.cpp fayl yaratamiz

```cpp
#include<iostream>
using namespace std;

int main(){
	cout<<"Hello world"<<endl;
	return 0;
}
```

yozamiz

g++ main.cpp

yoki

g++ main.cpp -o main

teramiz

chiquvchi fayl main (yoki a.out) bo'ladi

./main

yoki

./a.out

terib ishga tushiramiz

Hello world

ekranga chiqadi.

const int number = 1; // - konstanta o'zgarmas son

```
#include<string>

string name = "Adxamjon"

cout<<name;

name.size();
name.length();

getline(cin, name)
```

```
#include <cmath>

cout << sqrt(64);
cout << round(2.6);
cout << log(2);
```

funksya 	| ma'nosi     |
------------|-------------|
abs(x)		| x ning absolyut qiymati
acos(x)		| x ning arccosinus
asin(x)		| x ning arcsinusi
atan(x) 	| x ning arctg
cbrt(x)		| Returns the cube root of x
ceil(x)		| Returns the value of x rounded up to its nearest integer
cos(x)		| x cosinus
cosh(x)		| Returns the hyperbolic cosine of x
exp(x)		| Returns the value of Ex
expm1(x)	| Returns ex -1
fabs(x)		| Returns the absolute value of a floating x
fdim(x, y)	| Returns the positive difference between x and y
floor(x)	| Returns the value of x rounded down to its nearest integer
hypot(x, y)	| sqrt(x2 +y2) gipatinuzasi
fma(x, y, z)| Returns x*y+z without losing precision
fmax(x, y)	| Returns the highest value of a floating x and y
fmin(x, y)	| Returns the lowest value of a floating x and y
fmod(x, y)	| Returns the floating point remainder of x/y
pow(x, y)	| Returns the value of x to the power of y
sin(x)		| Returns the sine of x (x is in radians)
sinh(x)		| Returns the hyperbolic sine of a double value
tan(x)		| Returns the tangent of an angle
tanh(x)		| Returns the hyperbolic tangent of a double value























