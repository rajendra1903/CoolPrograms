import requests


res = requests.get('https://automatetheboringstuff.com/files/rj.txt')
 
res.raise_for_status()
 
NewFile = open('RomAndJul.txt', 'wb')
 
for chunk in res.iter_content(100000):
    NewFile.write(chunk)


NewFile.close()
