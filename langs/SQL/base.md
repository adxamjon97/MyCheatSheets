sql jadval yaratish

```sql
CREATE TABLE months (
	id int, 
	name varchar(10), 
	days int
	);
```

Jadvalga ma'lumot qo'shish

```sql
INSERT INTO months 
VALUES (1,'January',31);
```

# ma'lumotlarni jadvaldan qabul qiladi

barchasini qabul qiladi

```sql
SELECT * 
FROM characters
```

name weapon ustunlarini chiqaradi

```sql
SELECT name, weapon 
FROM characters
```

```sql
SELECT name, weapon 
FROM characters 
ORDER BY name DESC
```

weapon ustinida da pistol kalit so'zi orqali qidiradi
va barcha ustinlarin chiqaradi

```sql
SELECT * 
FROM characters
WHERE weapon = 'pistol';
```

bir nechta and/or shartlari bilan tekshirish

```sql
SELECT * 
FROM albums 
WHERE genre = 'rock' AND sales_in_millions <= 50 
ORDER BY released
```

in birortasi/ betwen oraliqda/ like shablon %-ixtiyoriy
```sql
SELECT * FROM albums WHERE genre IN ('pop','soul');
SELECT * FROM albums WHERE released BETWEEN 1975 AND 1985;
SELECT * FROM albums WHERE album LIKE '%R%';
```

COUNT() - возвращает число строк
SUM() 	- возвращает сумму всех полей с числовыми значениями в них
AVG() 	- возвращает среднее значение среди строк
MIN()/MAX() - возвращает минимальное/максимальное значение среди строк


minimum released ni qaytaradi

```sql
SELECT MIN(released) FROM albums;
```

```sql
SELECT name, avg(age) FROM students;
```

o'zgartirish

```sql
UPDATE tv_series 
SET genre = 'drama' 
WHERE name = 'Game of Thrones';
```

jadvaldan o'chirish
```sql
DELETE FROM tv_series 
WHERE id = 4;
```

Jadvaldagi barcha ma'lumotni o'chirish

```sql
TRUNCATE TABLE table_name;
```

Jadvalni o'chirish

```sql
DROP TABLE table_name;
```






