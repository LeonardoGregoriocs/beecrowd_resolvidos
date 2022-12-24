import math

A, B, C = [float(x) for x in input().split(" ")]

try:
    delta = B * B - 4 * A * C

    r1 = (-B + math.sqrt(delta)) / (2 * A)
    r2 = (-B - math.sqrt(delta)) / (2 * A)

    print("R1 = {:.5f}".format(r1))
    print("R2 = {:.5f}".format(r2))

except:
    print("Impossivel calcular")