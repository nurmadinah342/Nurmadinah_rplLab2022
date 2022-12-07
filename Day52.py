def hitung_fpb(x, y):
    if x > y:
        smaller = y
    else:
        smaller = x
     
    for i in range(1, smaller +1):
        if ((x % i == 0) and (y % i == 0)):
            fpb = i
     
    return fpb
 
num_input1 = 96
num_input2 = 24
 
print("FPB Dari {} dan {} = {}".format(num_input1, num_input2, hitung_fpb(num_input1, num_input2)))
