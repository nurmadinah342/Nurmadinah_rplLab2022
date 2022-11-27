email = input("Masukkan email Anda: ").strip()
username = email[:email.index("@")]
domain_name = email[email.index("@")+1:]
format_ = (f"Nama pengguna Anda adalah '{username}' domain Anda adalah '{domain_name}'")
print(format_)