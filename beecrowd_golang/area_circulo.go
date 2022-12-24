package main

import (
	"fmt"
)

var raio float64
var n float64 = 3.14159

func main() {
	fmt.Scanln(&raio)

	area := n * (raio * raio)
	fmt.Printf("A=%.4f", area)
}
