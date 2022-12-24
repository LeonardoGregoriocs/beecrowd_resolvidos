valor = int(input())

Notas100 = int(valor / 100)
resto = valor % 100

Notas50 = int(resto / 50)
resto = resto % 50

Notas20 = int(resto / 20)
resto = resto % 20

Notas10 = int(resto / 10)
resto = resto % 10

Notas5 = int(resto / 5)
resto = resto % 5

Notas2 = int(resto / 2)
resto = resto % 2

Notas1 = int(resto / 1)

print('%d' %valor)
print('%d nota(s) de R$ 100,00' %Notas100)
print('%d nota(s) de R$ 50,00' %Notas50)
print('%d nota(s) de R$ 20,00' %Notas20)
print('%d nota(s) de R$ 10,00' %Notas10)
print('%d nota(s) de R$ 5,00' %Notas5)
print('%d nota(s) de R$ 2,00' %Notas2)
print('%d nota(s) de R$ 1,00' %Notas1)