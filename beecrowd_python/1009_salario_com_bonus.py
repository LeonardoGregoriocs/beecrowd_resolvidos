nomeVendedor = input()
salarioFixo = float(input())
totalVendas = float(input())

comissao = totalVendas*0.15
salarioFinal = salarioFixo + comissao

print('TOTAL = R$ %.2f' %salarioFinal)