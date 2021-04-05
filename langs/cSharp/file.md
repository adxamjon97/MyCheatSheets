fayllar bilan ishlash

``` cs
using System;
using System.IO; // fayllar oqimi bilan ishlash

public class Sum{
  private static void Main(){
    StreamReader sr = new StreamReader("input.txt"); // o'qish
    StreamWriter sw = new StreamWriter("output.txt"); // yozish

    string[] s = sr.ReadLine().Split(); // qabul
    sw.WriteLine(int.Parse(s[0])+int.Parse(s[1])); // jo'natish

    sr.Close(); // yopish
    sw.Close();
  }
}
```
