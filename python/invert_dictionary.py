'''
#Given a dictionary, invert the dictionary with values to keys and keys to values
'''


Dict={1:'pvn', 2:'kmr', 3:'psn', 4:'lxm'}
List=[]
List1=[]

for i in Dict:
  List.append(i)
  List1.append(Dict[i])
Dict.clear()

print List     #[1, 2, 3, 4]
print List1    #['pvn', 'kmr', 'psn', 'lxm']

Zip= zip(List,List1)
 
for values in Zip:
  print values 

for key,values in Zip:
  Dict[str(values)]=key

print Dict

