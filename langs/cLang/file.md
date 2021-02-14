# C tilida fayllar bilan ishlash

```c
FILE * fopen(nomi, flag); // faylni ochish
int fclose(korsatkich); // faylni yopish
```

"w": текстовый файл открывается для записи. Если файл ранее существовал, то он пересоздается и записывается заново

"r": текстовый файл открывается для чтения

"a": текстовый файл открывается для добавления в него новых данных. Если файл существовал ранее, то данные просто добавляются

"w+": текстовый файл создается для записи/записи. Если файл ранее существовал, то при первой записи после открытия он пересоздается и записывается заново. А при последующих записях после открытия данные добавляются в него без перезаписи.

"r+": текстовый файл открывается для чтения/записи. Запись допустима в любом месте файла, кроме конца файла, то есть недопустимо увеличение размеров файла.

"a+": текстовый файл открывается или создается (при его отсутствии) для чтения/записи. В отличие от режима w+ файл при открытии не пересоздается заново, а в отличии от режима r+ можно записывать данные в конец файла

"wb": бинарный файл открывается для записи

"rb": бинарный файл открывается для чтения

"ab": бинарный файл открывается для дозаписи

"w+b": бинарный файл создается для записи/чтения

"r+b": бинарный файл открывается для чтения/записи

"a+b": бинарный файл открывается или создается (при его отсутствии) для чтения/дозаписи

misol tariqasida:

```c
#include <stdio.h>
 
void main(){
    FILE * fp = fopen("data.txt", "w");
    fclose(fp);
}
```

hatoni tekshirish:

```c
#include <stdio.h>
#include <stdlib.h>
 
void main(){
    FILE * fp;
    if((fp= fopen("D:\data28.txt", "r"))==NULL){
        perror("Error occured while opening data28.txt");
        exit(0);
    }
     
    fclose(fp);
}
```

getc() putc() - bit lar bilan ishledi

int getc(FILE *stream);

int putc(int c, FILE *stream);

```c
#include <stdio.h>
 
int write(char * filename, char message[], int n);
int read(char * filename);
 
void main(){
    char hello[] = "hello world!";
    char * filename = "D://data.txt";
     
    int n = sizeof(hello)/sizeof(hello[0]);
     
    write(filename, hello, n);
    read(filename);
}
 
int write(char * filename, char message[], int n){
    FILE * fp;
    if((fp= fopen(filename, "w"))==NULL){
        perror("Error occured while opening file");
        return 1;
    }
     
    // посимвольно записываем в файл
    for(int i=0; i<n; i++){
        putc(message[i], fp);
    }
     
    fclose(fp);
    return 0;
}
 
int read(char * filename){
    FILE * fp;
    char c;
    if((fp= fopen(filename, "r"))==NULL){
        perror("Error occured while opening file");
        return 1;
    }
    // после записи считываем посимвольно из файла
    while((c=getc(fp))!= EOF){
        printf("%c", c);
    }
     
    fclose(fp);
    return 0;
}
```

matinli fayllar bilan ishlash

```c
#include <stdio.h>
 
void main(){
    char * message = "Hello \n world!\n An apple a day keeps the doctor away";
    char * filename = "D://data5.txt";
    char cc[256];
    FILE *fp;
     
    
    if((fp= fopen(filename, "w"))==NULL){ // запись в файл
        perror("Error occured while opening file");
        return 1;
    }
    
    fputs(message, fp); // записываем строку
 
    fclose(fp);
     
    
    if((fp= fopen(filename, "r"))==NULL){ // чтение из файла
        perror("Error occured while opening file");
        return 1;
    }
    
    while((fgets(cc, 256, fp))!=NULL){ // пока не дойдем до конца, считываем по 256 байт
        printf("%s", cc);
    }
     
    fclose(fp);
}
```

fprintf()

```c
#include <stdio.h>
 
struct person{
    char name[20];
    int age;
};
void main(){
    char * filename = "D://users.dat";
    struct person people[] = { "Tom", 23, "Alice", 27, "Bob", 31, "Kate", 29 };
    int n = sizeof(people)/sizeof(people[0]);
    FILE *fp;
    if ((fp = fopen(filename, "w")) == NULL){
        perror("Error occured while opening file");
        return 1;
    }
     
    for(int i=0; i<n; i++){
        fprintf(fp, "%s     %d\n", people[i].name, people[i].age);
    }
    fclose(fp);
}
```

fscanf()

```c
#include <stdio.h>
 
struct person{
    char name[20];
    int age;
};
 
void main(){   
    char * filename = "D://users.dat";
    FILE *fp;
    char name[20];
    int age;
    if ((fp = fopen(filename, "r")) == NULL){
        perror("Error occured while opening file");
        return 1;
    }
     
    while((fscanf(fp, "%s   %d\n", &name, &age))!=EOF){
        printf("%s      %d\n", name, age);
    }
    fclose(fp);
    return 0;
}
```




