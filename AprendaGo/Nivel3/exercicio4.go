package main

import "fmt"

func main() {
	anoQueNasceu := 1997
	anoAtual := 2023

	// Deixamos a condição dentro do for através de um if.

	for {
		if anoQueNasceu > anoAtual {
			break
		}
		fmt.Println(anoQueNasceu)
		anoQueNasceu++
	}
}
