package main

import (
	"fmt"
)

func main() {
	x := 200

	fmt.Printf("Decimal - %d\n", x)
	fmt.Printf("Binario - %b\n", x)
	fmt.Printf("Hexa Decimal - %#x\n", x)

	// Deslocamento de um bits para a esquerda.
	// << - esquerda
	// >> - direita
	y := x << 1

	fmt.Printf("Decimal - %d\n", y)
	fmt.Printf("Binario - %b\n", y)
	fmt.Printf("Hexa Decimal - %#x\n", y)

}
