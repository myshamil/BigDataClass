import sys
paths= sys.path #pythonpath
print(paths)
sys.path.append("c:\\Python_modules")

import calc2
c = calc2.add(4,5)
print(c)