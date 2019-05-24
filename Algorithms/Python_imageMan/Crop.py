import PIL
from PIL import Image
import os
os.chdir(r'C:\Users\dell\Desktop')
dogImage = Image.open('zack.jpg')

croppedIm = dogImage.crop((335, 345, 565, 560))
croppedIm.save('crop_img.png')

Image.open('crop_img.png')
