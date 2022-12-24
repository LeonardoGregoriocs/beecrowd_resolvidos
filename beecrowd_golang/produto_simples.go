package main

import (
	"fmt"
)

var A, B int

func main() {
	fmt.Scan(&A)
	fmt.Scan(&B)

	prod := A * B

	fmt.Printf("PROD = %d\n", prod)
}
