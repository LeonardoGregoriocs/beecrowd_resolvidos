package main

import (
	"fmt"
)

var A, B int

func main() {
	fmt.Scan(&A)
	fmt.Scan(&B)

	soma := A + B

	fmt.Printf("SOMA = %d\n", soma)
}
