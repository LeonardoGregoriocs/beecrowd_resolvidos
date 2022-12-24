A, B = [int(x) for x in input().split(" ")]

if B > A:
    conta = B // A
    resultado = conta * A
    if resultado == B:
        print("Sao multiplos")
    else:
        print("Nao sao multiplos")
else:
    conta = A // B
    resultado = conta * B
    if resultado == A:
        print("Sao multiplos")
    else:
        print("Nao sao multiplos")
