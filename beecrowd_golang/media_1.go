package main

import (
	"fmt"
)

var A, B float64

func main() {
	fmt.Scan(&A)
	fmt.Scan(&B)

	media := ((A * 3.5) + (B * 7.5)) / 11
	fmt.Printf("MEDIA = %.5f\n", media)
}
