package main

import (
	"fmt"
)

func main() {
	x := []int{42, 43, 44, 45, 46, 47, 48, 49, 50, 51}

	x = append(x, 52)
	x = append(x, 53, 54, 55)

	fmt.Printf("%v\n", x)

	y := []int{56, 57, 58, 59, 60}

	x = append(x, y...) // Esses 3 pontinhos é UNFURL (Desenrolar) ou Enumeration, serve para pegarmos os itens de um slice ou array.
	// Isso -> x = append(x, y[0], y[1], y[2], y[3]) é igual o que temos acima.

	fmt.Printf("%v\n", x)
}
