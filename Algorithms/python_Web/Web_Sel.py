from selenium import webdriver

options = webdriver.ChromeOptions()
options.add_argument('--ignore-certificate-errors')
options.add_argument("--test-type")
options.binary_location = "/usr/bin/chromium"
browser = webdriver.Chrome(chrome_options=options)

browser.get('https://accounts.google.com/ServiceLogin/identifier?flowName=GlifWebSignIn&flowEntry=AddSession')

emailElem = browser.find_element_by_id('Email or phone')

emailElem.send_keys('not_my_real_email')

passwordElem = browser.find_element_by_id('submit')

passwordElem.submit()


