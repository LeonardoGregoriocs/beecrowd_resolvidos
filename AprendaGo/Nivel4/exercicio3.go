package main

import "fmt"

func main() {
	slice := []int{10, 20, 30, 40, 50, 60, 70, 80, 90, 100}

	fmt.Println(slice[:3])  // 1º ao 3º item
	fmt.Println(slice[4:])  // 5º ao último item
	fmt.Println(slice[1:7]) // 2º ao 7º item
	fmt.Println(slice[2:9]) // 3º ao penúltimo item
	fmt.Println(slice[2 : len(slice)-1])
}
