package main

import "fmt"

func main() {
	esporteFavorito := "Futebol"

	switch esporteFavorito {
	case "Basquete":
		fmt.Println("Nota +")
	case "Futebol":
		fmt.Println("Nota +++")
	case "NFL":
		fmt.Println("Nota +++")
	}
}
