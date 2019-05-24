import bs4 

import requests as rq

res = rq.get('http://www.inventwithpython.com')

#print(res.text)

soup = bs4.BeautifulSoup(res.text)

elems = soup.select('h1')

print(elems[0].getText())
