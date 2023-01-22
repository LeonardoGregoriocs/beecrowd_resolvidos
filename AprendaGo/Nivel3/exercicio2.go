package main

import "fmt"

// Tabela ASCII -> Código Padrão Americano para o Intercâmbio de Informação

func main() {
	for i := 65; i <= 90; i++ {
		fmt.Printf("%v:\n", i)
		for j := 0; j < 3; j++ {
			fmt.Printf("\t%U\t'%c'\n", i, i)
		}
	}
}
