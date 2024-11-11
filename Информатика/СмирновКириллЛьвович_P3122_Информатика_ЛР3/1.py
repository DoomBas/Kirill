import re
stringi1 = r';<\;<\;<\;<\;<\;<\a'
stringi2 = r'[];<\ hi ;;;<\\)      ;<\-;<\-;<\-<\\'
stringi3 = r'abbboooobaaaa'
stringi4 = r'   ghfgh;<shgsdgh ;<\\\\\\ '
stringi5 = r'tyt ;<\ pust;<\ota ;<\ ahaha'
regul = r';<\\'
print(len(re.findall(regul, stringi1))==6)
print(len(re.findall(regul, stringi2))==5)
print(len(re.findall(regul, stringi3))==0)
print(len(re.findall(regul, stringi4))==1)
print(len(re.findall(regul, stringi5))==3)
