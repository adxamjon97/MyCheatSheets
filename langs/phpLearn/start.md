# php learn starter

<?php ?> bloklari ichida html matnini ichida php scriptni yozsa bo'ladi

php ni htm/html ni ichidaham yozsa bo'ladi.

<?php
	echo "hello world";
?>

bu html ga echo ichidagini jo'natadi

o'zgaruvchilar

$x
$n=34;

echo "$n" 34ni chop etadi
echo '$n' $n chop etadi

$a." - ".$b; satrlarni birlashtirish

operatorlar

if(){}elseif(){}else{}

shart operatorini boshqa turi

```php
$a = 5;
if($a > 0):
    echo "Переменная a больше нуля";
elseif($a < 0):
    echo "Переменная a меньше нуля";
else:
    echo "Переменная a равна нулю";
endif
```

html da yozish boshqa turi

```php
<!DOCTYPE html>
<html>
<head>
<title>METANIT.COM</title>
<meta charset="utf-8" />
</head>
<body>
<?php
$a = 0;
?>
 
<?php if ($a > 0): ?>
<h2>Переменная a больше нуля</h2>
<?php elseif($a < 0): ?>
<h2>Переменная a меньше нуля</h2>
<?php else: ?>
<h2>Переменная a равна нулю</h2>
<?php endif; ?>
</body>
</html>
```

qisqa if else

```php
$a = 1;
$b = 2;
$z = $a < $b ? $a + $b : $a - $b;
echo $z;
```

```php
$a = 3;
switch($a){
    case 1: echo "сложение";  break;
    case 2: echo "вычитание"; break;
    case 3: echo "умножение"; break;
    case 4: echo "деление";	  break;
}
```