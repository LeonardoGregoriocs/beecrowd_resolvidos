package main

import "fmt"

func main() {
	for i := 10; i <= 100; i++ {
		x := i % 4
		fmt.Println(x)

		// Ou podemos fazer o modulo direto dentro do Println.
	}
}
