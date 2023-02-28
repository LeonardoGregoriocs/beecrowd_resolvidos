package main

import (
	"fmt"
)

func main() {
	x := []int{42, 43, 44, 45, 46, 47, 48, 49, 50, 51}

	y := []int{}
	y = append(y, x[0:3]...)  // Pegamos da posição 0 até a "cabeça" da posição 3º, ou seja a 2º.
	y = append(y, x[6:10]...) // Pegamos da posição 6 até a "cabeça" da posição 10º, ou seja a 9º.

	fmt.Printf("%v\n", y)
}
