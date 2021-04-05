
switchni php8 degi yangi qo'shimcha ko'rinishi

```php
$a = 2;
$operation = match($a){
    1 => "сложение",
    2 => "вычитание",
    default => "действие по умолчанию",
};
echo $operation;
```

boshqacha ishlatish

```php
$a = 2;
match($a){
    1 => $operation = "сложение",
    2 => $operation = "вычитание",
    default => $operation = "действие по умолчанию",
};
echo $operation;
```

```php
<?php
$words = [
	"red"   => "красный", 
	"blue"  => "синий", 
	"green" => "зеленый"
	];
 
foreach($words as $english => $russian){
    echo "$english : $russian<br />";
}
?>
```

yoki foreach($words as $word){ cods }

massiv

```php
$families = [["Tom", "Alice"], ["Bob", "Kate"]];
```

shart bo'lmagan o'zgaruvchi funksyada

```php
<?php
function displayInfo($name, $age = 18){
    echo "<div>Имя: $name <br />Возраст: $age</div><hr>";
}
 
displayInfo("Tom", 36);
displayInfo("Sam");
?>
```

parametirlarini anniq ko'rsatish

```php
<?php
function displayInfo($name, $age = 18){
    echo "<div>Имя: $name <br />Возраст: $age</div><hr>";
}
 
displayInfo(age: 23, name: "Bob");
displayInfo(name: "Tom", age: 36);
displayInfo(name: "Alice");
?>
```

bir nechta o'zgaruvchilar

```php
<?php
function sum(...$numbers){
    $result = 0;
    foreach($numbers as $number) {
        $result += $number;
    }
    echo "<p>Сумма: $result</p>";
}
sum(1, 2, 3);
sum(2, 3);
sum(4, 5, 8, 10);
?>
```

yuqoridegidan foydalanish
```php
...
$numbers = [3, 5, 7, 8];
sum(...$numbers);           // 23
?>
```

count() // massiv hajmi

```php
<?php
function welcome($message){
    $message();
}
 
welcome(function(){
    echo "Hello!";
});
?>
```




















