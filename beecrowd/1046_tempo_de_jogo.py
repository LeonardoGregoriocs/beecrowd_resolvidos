A, B = [int(x) for x in input().split(" ")]

if A == B:
    print(f"O JOGO DUROU 24 HORA(S)")
elif A > B:
    tempo = (24 - A) + B
    print(f"O JOGO DUROU {tempo} HORA(S)")
else:
    tempo = B - A
    print(f"O JOGO DUROU {tempo} HORA(S)")
