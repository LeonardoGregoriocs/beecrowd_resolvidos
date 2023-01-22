package main

import "fmt"

const (
	_ = iota + 2023
	a1
	a2
	a3
	a4
)

func main() {
	fmt.Println(a1, a2, a3, a4)
}
