import PIL
from PIL import Image
import os
os.chdir(r'C:\Users\dell\Desktop')
dogImage = Image.open('zack.jpg')


print('Image format is '+ str(dogImage.format))

print('Image format description is' + " "+ str(dogImage.format_description))
