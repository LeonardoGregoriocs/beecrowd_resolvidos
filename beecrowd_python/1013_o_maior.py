valor = input().split(" ")

a, b, c = valor

maior_AB = (int(a) + int(b) + abs(int(a) - int(b))) / 2
resultado  = (maior_AB + int(c) + abs (maior_AB - int(c))) / 2

print(f"{int(resultado)} eh o maior")