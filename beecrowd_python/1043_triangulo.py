A, B, C = [float(x) for x in input().split(" ")]

if (A + B) > C and (B + C) > A and (A + C) > B:
    perimetro = A + B + C
    print("Perimetro = {:.1f}".format(perimetro))
else:
    area = (A + B) * C / 2
    print("Area = {:.1f}".format(area))
