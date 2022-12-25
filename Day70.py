print("Tangggal Lahir Anda: (mm dd yyyy)")
Date_of_birth = input("--->")

print("Tanggal Hari ini: (mm dd yyyy)")
Todays_date = input("--->")


from datetime import date
def calculate_age(born):
    today = date.today()
    return today.year - born.year - ((today.month, today.day) < (born.month, born.day))

age = calculate_age(Date_of_birth)