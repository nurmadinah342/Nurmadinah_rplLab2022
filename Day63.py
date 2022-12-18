identitas = { 
    "nama" : "madinah", 
    "umur" : 19, 
    "alamat" : "majene"} 
identitas2 = { "jurusan" : "Informatika",
 "kelas" : "C", 
 "hobbi" : "membaca"}


print("identitas : ", identitas) 
print() 
print("identitas2 : ", identitas2) 
print()
hasil = dict(identitas, **identitas2) 
print("setelah di gabung : ", hasil) 
print() 

print(hasil.keys()) 
print() 
print(hasil.values())