package main

import "fmt"

func main() {
	x := 100

	fmt.Printf("Decimal - %d\n", x)
	fmt.Printf("Binario - %b\n", x)
	fmt.Printf("Hexa Decimal - %#x\n", x)
}

// Por convenção utilizamos o # na hora de imprimir o hexa decimal, para ele trazer a sintaxe 0x antes do número.
