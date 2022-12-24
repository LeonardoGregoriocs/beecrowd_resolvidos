km_por_litro = 12

horas = int(input())
velocidade = int(input())

distancia_percorrida = horas * velocidade

litros_necessario = distancia_percorrida / km_por_litro

print(f"{litros_necessario:.3f}")
