# Модуль shelve

Для работы с бинарными файлами в Python может применяться еще один модуль - shelve. 
Он сохраняет объекты в файл с определенным ключом. 
Затем по этому ключу может извлечь ранее сохраненный объект из файла. 
Процесс работы с данными через модуль shelve напоминает работу со словарями, 
которые также используют ключи для сохранения и извлечения объектов.

Для открытия файла модуль shelve использует функцию open():

open(путь_к_файлу[, flag="c"[, protocol=None[, writeback=False]]])

Где параметр flag может принимать значения:

c: файл открывается для чтения и записи (значение по умолчанию). Если файл не существует, то он создается.
r: файл открывается только для чтения.
w: файл открывается для записи.
n: файл открывается для записи Если файл не существует, то он создается. Если он существует, то он перезаписывается

```
import shelve
d = shelve.open(filename)
d.close()
```

```
import shelve
 
FILENAME = "states2"
with shelve.open(FILENAME) as states:
    states["London"] = "Great Britain"
    states["Paris"] = "France"
    states["Berlin"] = "Germany"
    states["Madrid"] = "Spain"
 
with shelve.open(FILENAME) as states:
    print(states["London"])
    print(states["Madrid"])
```





















