package main

import "fmt"

var A, B int

func main() {
	fmt.Scanln(&A)
	fmt.Scanln(&B)
	soma := A + B

	fmt.Printf("X = %v", soma)
}
