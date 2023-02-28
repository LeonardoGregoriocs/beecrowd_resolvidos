package main

import "fmt"

func main() {
	test := map[string][]string{
		"souza_leonardo": {"Academia", "Run"},
		"souza_edivane":  {"Academia", "estudar"},
		"souza_shell":    {"Dormir", "Comer", "Brincar"},
	}

	test["souza_gatin"] = []string{"Dormir", "Comer", "Brincar"}

	delete(test, "souza_leonardo")

	for k, v := range test {
		fmt.Printf("Chave: %s\n", k)
		for x, v := range v {
			fmt.Printf("\t%d: %s\n", x, v)
		}
	}

}
