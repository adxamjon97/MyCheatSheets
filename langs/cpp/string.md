# Satirlar

```cpp
#include <string>
#include <iostream>
using namespace std;

int main(){
    string s1;             // пустая строка
    string s2 = "hello";   // hello
    string s3("welcome");  // welcome
    string s4(5, 'h');     // hhhhh
    string s5 = s2;        // hello
     
    cout << s1 << "\n";
    cout << s2 << "\n";
    cout << s3 << "\n";
    cout << s4 << "\n";
    cout << s5 << "\n";
    return 0;
}
```

s1.size() // length
s1.empty() // "" true

```cpp
#include <iostream>
#include <string>
using namespace std;
int main(){   
    string name;
    cout << "Input your name: ";
    getline(cin, name);
    cout << "Your name: " << name << endl;
    return 0;
}
```

bir nechta satrli ma'lumot kiritlsa " " ochiq joy bilan, getline(cin, name) ishlatiladi
