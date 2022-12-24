hora_inicial, minuto_inicial, hora_final, minuto_final = [int(x) for x in input().strip(" ").split(" ")]

if hora_inicial == hora_final and minuto_inicial == minuto_final:
    print(f"O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)")

elif hora_inicial > hora_final:
    hora = (24 - hora_inicial) + hora_final
    minutos = (60 - minuto_inicial) + minuto_final
    if minutos < 0:
        minutos = 60 + minutos
    print(f"O JOGO DUROU {hora} HORA(S) E {minutos} MINUTO(S)")

else:
    hora = hora_final - hora_inicial
    minutos = minuto_final - minuto_inicial

    if minutos < 0:
        hora = 0
        minutos = 60 + minutos
    print(f"O JOGO DUROU {hora} HORA(S) E {minutos} MINUTO(S)")
