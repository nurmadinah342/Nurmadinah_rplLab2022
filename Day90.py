# program menghitung penjualan tanah warisan
luas_tanah = int(input("masukkan luas tanah : "))
harga_permeter = 300000
harga_kotor = luas_tanah* harga_permeter

if harga_kotor >= 50000000 and harga_kotor < 100000000:
    pajak = 3/100 * harga_kotor
elif harga_kotor >= 100000000:
    pajak = 5/100 * harga_kotor
else:
    pajak = 1/100 * harga_kotor

harga_bersih = harga_kotor - pajak
print(harga_bersih)
