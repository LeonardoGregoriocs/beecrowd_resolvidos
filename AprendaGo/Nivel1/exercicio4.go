package main

import (
	"fmt"
)

type meuTipo int

var x meuTipo

func main() {
	fmt.Printf("%v\n", x)
	fmt.Printf("%T\n", x)

	x = 42

	fmt.Printf("%v\n", x)
}

// Criamos nosso próprio tipo, mas existe um tipo subjacente por trás.
