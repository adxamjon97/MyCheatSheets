# BeautifulSoup - python biblatekasi

python -m pip install bs4

```python
from bs4 import bs
soup = bs(html_doc, 'html.parser')

print(soup.prettify())
# <html>
#  <head>
# ...
```

teglarga murojat

```python
soup.title # <title>The Dormouse's story</title>

soup.title.name # u'title'

soup.title.string # u'The Dormouse's story'

soup.title.parent.name # u'head'

soup.p # <p class="title"><b>The Dormouse's story</b></p>

soup.p['class'] # u'title'

soup.a
# <a class="sister" href="http://example.com/elsie" id="link1">Elsie</a>

soup.find_all('a')
# [<a class="sister" href="http://example.com/elsie" id="link1">Elsie</a>,
#  <a class="sister" href="http://example.com/lacie" id="link2">Lacie</a>,
#  <a class="sister" href="http://example.com/tillie" id="link3">Tillie</a>]

soup.find(id="link3")
# <a class="sister" href="http://example.com/tillie" id="link3">Tillie</a>
```
get()

```python
for link in soup.find_all('a'):
    print(link.get('href'))
# http://example.com/elsie
# http://example.com/lacie
# http://example.com/tillie
```

get_text()
```python
print(soup.get_text())
# The Dormouse's story
#
# The Dormouse's story
#
# Once upon a time there were three little sisters; and their names were
# Elsie,
# Lacie and
# Tillie;
# and they lived at the bottom of a well.
#
# ...
```

fayl orqali yuklash

```python
from bs4 import bs

with open("index.html") as fp:
    soup = bs(fp, 'html.parser')

soup = bs("<html>a web page</html>", 'html.parser')
```



















