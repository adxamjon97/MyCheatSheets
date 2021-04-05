<input type="text">		Displays a single-line text input field
<input type="radio">	Displays a radio button (for selecting one of many choices)
<input type="checkbox">	Displays a checkbox (for selecting zero or more of many choices)
<input type="submit">	Displays a submit button (for submitting the form)
<input type="button">	Displays a clickable button

<label> forАтрибут <label>тега должен быть равен 
id атрибуту <input> элемента, чтобы связать их вместе.

<form action="/action_page.php" target="_blank">

_blank		The response is displayed in a new window or tab
_self		The response is displayed in the current window
_parent		The response is displayed in the parent frame
_top		The response is displayed in the full body of the window
framename	The response is displayed in a named iframe

<form action="/action_page.php" method="post"> // get

<form action="/action_page.php" autocomplete="on">
<form action="/action_page.php" novalidate>

<input>
<label>
<select>
<textarea>
<button>
<fieldset>
<legend>
<datalist>
<output>
<option>
<optgroup>

```html
<label for="cars">Choose a car:</label>
<select id="cars" name="cars">
  <option value="volvo">Volvo</option>
  <option value="saab">Saab</option>
  <option value="fiat">Fiat</option>
  <option value="audi">Audi</option>
</select>
```

```html
<textarea name="message" rows="10" cols="30">
The cat was playing in the garden.
</textarea>
```

```html
<button type="button" onclick="alert('Hello World!')">Click Me!</button>
```

bo'limga ajratib turadi +-bo'lim----+ qib

```html
<form action="/action_page.php">
  <fieldset>
    <legend>Personalia:</legend>
    
    <label for="fname">First name:</label><br>
    <input type="text" id="fname" name="fname" value="John"><br>
    
    <label for="lname">Last name:</label><br>
    <input type="text" id="lname" name="lname" value="Doe"><br><br>
    
    <input type="submit" value="Submit">
  </fieldset>
</form>
```

```php
<form action="/action_page.php">
  <input list="browsers">
  <datalist id="browsers">
    <option value="Internet Explorer">
    <option value="Firefox">
    <option value="Chrome">
    <option value="Opera">
    <option value="Safari">
  </datalist>
</form>
```












