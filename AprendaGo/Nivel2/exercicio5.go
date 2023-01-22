package main

import "fmt"

func main() {
	rawString := `Testando\nraw\tstring`
	fmt.Printf("Raw string -> %v\n", rawString)

	interpretedString := "Testando\ninterpreted\tstring"
	fmt.Printf("Interpreted string -> %v\n", interpretedString)
}

// Raw string -> Cadeia bruta.
// Interpreted string -> Cadeia interpreted.
