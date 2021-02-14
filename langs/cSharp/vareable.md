### O'zgaruvchilarni turlari

```cs
int    myNum       = 5;
double myDoubleNum = 5.99D;
char   myLetter    = 'D';
bool   myBool      = true;
string myText      = "Hello";
```

// const type var = value; // o'zgarmas qiymat beriladi const yordamida

| tur    | xotira  | hajmi                       |
|--------|---------|-----------------------------|
| int    | 4 bytes | +-2 147 483 647             |
| long   | 8 bytes | +-9 223 372 036 854 775 807 |
| float  | 4 bytes | (,) keyin 7ta               |
| double | 8 bytes | (,) keyin 15ta              |
| bool   | 1 bit   | true false                  |
| char   | 2 bytes | 1ta simvol                  |

### 1 turdan 2-turga o'tkazish

char   -> int   -> long -> float -> double - anniq emas

double -> float -> long -> int   -> char   - anniq

```cs
int myInt = 9;
double myDouble = myInt;

double myDouble = 9.78;
int myInt = (int) myDouble;
```

```cs
Convert.ToString(myInt);    // convert int to string
Convert.ToDouble(myInt);    // convert int to double
Convert.ToInt32(myDouble);  // convert double to int
Convert.ToString(myBool);	// convert bool to string
```

mat   + - * / % ++ --

equal = += -= *= /= %= &= |= ^= >>= <<=

equal2 == != < > <= >=

Logic && || !

Math.Max(x,y); // Min(x,y) Sqrt(x) Abs(x) Round(X) - yaxlitlash

