from math import pow

numeros = [float(x) for x in input().split(" ")]

ordenados = sorted(numeros, reverse=True)
resultados = []

if ordenados[0] >= (ordenados[1] + ordenados[2]):
    resultados.append("NAO FORMA TRIANGULO")
else:
    if pow(ordenados[0], 2) == (pow(ordenados[1], 2)) + (pow(ordenados[2], 2)):
        resultados.append("TRIANGULO RETANGULO")

    if pow(ordenados[0], 2) > pow(ordenados[1], 2) + pow(ordenados[2], 2):
        resultados.append("TRIANGULO OBTUSANGULO")

    if pow(ordenados[0], 2) < (pow(ordenados[1], 2) + pow(ordenados[2], 2)):
        resultados.append("TRIANGULO ACUTANGULO")

    if ordenados[0] == ordenados[1] and ordenados[1] == ordenados[2]:
        resultados.append("TRIANGULO EQUILATERO")
    elif ordenados[0] == ordenados[1] or ordenados[0] == ordenados[2] or ordenados[1] == ordenados[2]:
        resultados.append("TRIANGULO ISOSCELES")

for resultado in resultados:
    print(resultado)