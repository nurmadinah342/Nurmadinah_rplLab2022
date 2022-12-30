#PENJUMLAHAN LIST
print('##  Program Python Penjumlahan List / Array  ##')
print('===============================================')
print()
  
n = int(input('Input jumlah element list: '))
print()
 
print('Input',n,'angka (dipisah dengan enter): ');
 
# simpan setiap angka yang diinput ke dalam list
x = []
for i in range(n):
  print('Angka ke-',i+1,': ',sep='',end='')
  x.append(int(input()))
 
print()
 
# cari total semua element list
total = 0
for i in range(n):
  total = total+x[i];
 
print('Total penjumlahan dari',n,'angka tersebut adalah:',total);