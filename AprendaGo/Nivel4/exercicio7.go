package main

import "fmt"

func main() {
	slice := [][]string{
		{
			"Leonardo",
			"Souza",
			"Academia",
		},
		{
			"Edi",
			"Souza",
			"Academia",
		},
		{
			"Shell",
			"Souza",
			"Dormir",
		}}

	for _, v := range slice {
		for _, x := range v {
			fmt.Println(x)
		}
	}

}
