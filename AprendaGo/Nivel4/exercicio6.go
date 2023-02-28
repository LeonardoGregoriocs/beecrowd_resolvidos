package main

import "fmt"

func main() {

	estadosBrasil := make([]string, 26, 26)

	estadosBrasil = []string{
		"Acre",
		"Alagoas",
		"Amapá",
		"Amazonas",
		"Bahia",
		"Ceará",
		"Espírito Santo",
		"Goiás",
		"Maranhão",
		"Mato Grosso",
		"Mato Grosso do Sul",
		"Minas Gerais",
		"Pará",
		"Paraíba",
		"Paraná",
		"Pernambuco",
		"Piauí",
		"Rio de Janeiro",
		"Rio Grande do Norte",
		"Rio Grande do Sul",
		"Rondônia",
		"Roraima",
		"Santa Catarina",
		"São Paulo",
		"Sergipe",
		"Tocantins",
	}

	for i := 1; i < len(estadosBrasil); i++ { // Acostumar a usar o len para conferir o tamanho, sendo que geralmente não vamos saber o tamanho exato.
		fmt.Printf("Estado: %v\n", estadosBrasil[i])
	}

	fmt.Println(len(estadosBrasil)) // Verifica o tamanho do nosso slice usando o make.
	fmt.Println(cap(estadosBrasil)) // Verifica a capacidade do nosso slice, lembrando, que caso passamos a capacidade, o próprio Go dobra a cap pra gente.
}
