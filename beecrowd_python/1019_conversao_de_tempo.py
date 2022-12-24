tempo_duracao = int(input())

horas = int(tempo_duracao/3600)
minutos = int(tempo_duracao%3600/60)
segundos = int(tempo_duracao%60)

print(f"{horas}:{minutos}:{segundos}")
