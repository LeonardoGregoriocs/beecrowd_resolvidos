package main

import "fmt"

func main() {
	nota := 3

	if nota == 10 {
		fmt.Println("O melhor!")
	} else if nota >= 5 && nota <= 9 {
		fmt.Println("Tá na média!")
	} else if nota > 10 {
		fmt.Println("Nota errada!")
	} else {
		fmt.Println("Ruim!")
	}
}
