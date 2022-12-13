import statistics
data = [90, 84, 88, 83, 87, 85, 83, 71]
rerata = statistics.mean(data)
list_varian = []
for bilangan in data:
  list_varian.append(
    (bilangan - rerata) ** 2
  )
varian = sum(list_varian) / (len(data) - 1)
list_varian = [(bilangan - rerata) ** 2 for bilangan in data]
varian = sum(list_varian) / (len(data) - 1)
simpangan_baku = statistics.sqrt(varian)

print(f'data \t\t -> {data}')
print(f'simpangan baku \t -> {simpangan_baku}')