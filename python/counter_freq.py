''' frequency count of a string using collections, lists, dictionary etc'''

from collections import Counter
'''
import collections
a = [1,1,1,1,2,2,2,2,3,3,4,5,5]
counter=collections.Counter(a)
print(counter)
# Counter({1: 4, 2: 4, 3: 2, 5: 2, 4: 1}) 


c=Counter(a=3,b=2,c=3)
print list(c.elements())
print sum(c.values())
print list(c) '''

d=Counter("praveenpavan")
print set(d.elements())
print tuple(d.elements())
print sum(d.values())
print d.items() 
print dict(d)

