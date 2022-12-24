dados = variavel1, variavel2, variavel3 = input().split()
variavel1, variavel2, variavel3 = int(variavel1), int(variavel2), float(variavel3)


variavel4, variavel5, variavel6 = input().split()
variavel4, variavel5, variavel6 = int(variavel4), int(variavel5), float(variavel6)

total = (variavel2 * variavel3) + (variavel5 * variavel6)
print(f"VALOR A PAGAR: R$ {total:.2f}")