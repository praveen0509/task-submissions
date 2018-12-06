s="praveenpavan"
d={}
for i in s:
  if i in d:
    d[i]+=1
  else:
    d[i]=1
print dict(d)
print list(d)
print sum(d.values())
print d.items()
print dict(d.key)
