package main

import "fmt"

var x int
var y string
var z bool

func main() {
	fmt.Printf("%v\n%v\n%v\n", x, y, z)
}

// Quando não inicializamos uma variável, o compilador atribui o valor zero.
// int -> 0
// string -> vazio
// bool -> False
