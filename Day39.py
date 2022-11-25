total = 5000
setelah_diskon = total

if total < 100000 :
    diskon = total * (5 /100)
else:
    diskon = total * (10/1000)

setelah_diskon = total - diskon
print ("diskonnya yaitu : ", diskon)
print ("harga setelah di diskon", setelah_diskon)