import PIL
from PIL import Image
import os
os.chdir(r'C:\Users\dell\Desktop')
dogImage = Image.open('zack.jpg')
print('Image size')
print(dogImage.size)
print('Image dimensions')
width,height = dogImage.size
print('image widght ' +str(width))
print('image height ' +str(height))

