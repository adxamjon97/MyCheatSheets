<table border="1">
	<tr>
	  <td>100</td>
	  <td>200</td>
	  <td>300</td>
	</tr>
	<tr>
	  <td>400</td>
	  <td>500</td>
	  <td>600</td>
	</tr>
</table>



<table style="width:100%">
  <tr>
    <th>Firstname</th>
    <th>Lastname</th>
    <th>Age</th>
  </tr>
  <tr>
    <td>Jill</td>
    <td>Smith</td>
    <td>50</td>
  </tr>
  <tr>
    <td>Eve</td>
    <td>Jackson</td>
    <td>94</td>
  </tr>
</table>

Чтобы границы сжимались в одну границу, добавьте border-collapse свойство CSS 

table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
