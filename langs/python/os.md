
| def      | ma'nosi              |
|----------|----------------------|
| mkdir()  | создает новую папку  |
| rmdir()  | удаляет папку        |
| rename() | переименовывает файл |
| remove() | удаляет файл         |

# Создание и удаление папки

Для создания папки применяется функция mkdir(), 
в которую передается путь к создаваемой папке:

``` python
import os

os.mkdir("hello") # путь относительно текущего скрипта

os.mkdir("c://somedir") # абсолютный путь
os.mkdir("c://somedir/hello")
```

Для удаления папки используется функция rmdir(), 
в которую передается путь к удаляемой папке:

``` python

import os

os.rmdir("hello") # путь относительно текущего скрипта
os.rmdir("c://somedir/hello") # абсолютный путь
```

# Переименование файла

``` python
import os
 
os.rename("C://SomeDir/somefile.txt", "C://SomeDir/hello.txt")
```

# Удаление файла

``` python
import os
 
os.remove("C://SomeDir/hello.txt")
```

# Существование файла

``` python
filename = input("Введите путь к файлу: ")
if os.path.exists(filename): print("Указанный файл существует") 
else:                        print("Файл не существует") 
```








