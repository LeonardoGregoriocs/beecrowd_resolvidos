codigo, quantidade = [int(x) for x in input().split(" ")]

valores = {
    1: 4.00,
    2: 4.50,
    3: 5.00,
    4: 2.00,
    5: 1.50
}

valor_produto = valores[codigo]
total = quantidade * valor_produto

print("Total: R$ {:.2f}".format(total))