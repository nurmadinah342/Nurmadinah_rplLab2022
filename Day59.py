u = [6,1,4]
# vektor v
v = [2,0,-3]
print("ini merupakan vektor u",u)
print("ini merupakan vektor v ",v)
udotv = []
for i in range (3):
  hasil = u[i] * v[i]
  udotv.append(hasil)
sudut = sum (udotv)
print ("maka hasilnya adalah = ",sudut)
if (sudut < 0):
    print("jadi = u dan v membentuk sudut lancip")
elif(sudut > 0):
    print("jadi = u dan v membentuk sudut tumpul")
else:
    print("jadi = u dan v membentuk sudut ortogonal")