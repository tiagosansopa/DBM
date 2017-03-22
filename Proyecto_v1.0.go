package main

import (
	//"bufio"
	"fmt"
	"io/ioutil"
	"log"
	"os"
	"path/filepath"
	//"strings"
)

var num int
var input string

func main() {

	fmt.Print("Ingrese la instruccion a probar ")
	num, err := fmt.Scan(&input)
	_ = num

	if err != nil {
		fmt.Println(err)
		return
	}

	fmt.Println(input)

	if input == "CREATE" {
		createDB()
	} else if input == "ALTER" {
		alterDB()
	} else if input == "DROP" {
		dropDB()
	} else if input == "SHOW" {
		showDB()
	} else if input == "USE" {
		useDB()
	}
}

func createDB() {
	fmt.Print("CREATE DATABASE\nIngrese el nombre de la DATABASE: ")
	var input string

	num, err := fmt.Scan(&input)
	_ = num

	if err != nil {
		fmt.Println(err)
		return
	}
	os.Mkdir("."+string(filepath.Separator)+string(input), 0777)
}

func alterDB() {
	fmt.Print("ALTER DATABASE\nIngrese el nombre de la base de datos a cambiar: ")
	var input1 string
	num1, err1 := fmt.Scan(&input1)
	_ = num1

	if err1 != nil {
		fmt.Println(err1)
		return
	}

	fmt.Print("\nIngrese el nuevo nombre de la base de datos: ")
	var input2 string
	num2, err2 := fmt.Scan(&input2)
	_ = num2

	if err2 != nil {
		fmt.Println(err2)
		return
	}

	os.Rename(input1, input2)
	//os.Mkdir("." + string(filepath.Separator) + string(input),0777)
}

func dropDB() {
	fmt.Print("DROP DATABASE\nIngrese el nombre de la DATABASE: ")

	var input2 string
	num, err := fmt.Scan(&input2)
	_ = num

	if err != nil {
		fmt.Println("NO ETSISTE")
		fmt.Println(err)
		return
	}
	os.RemoveAll("." + string(filepath.Separator) + string(input2))
}

func showDB() {
	fmt.Print("SHOW DATABASE\nLas Bases de datos son: ")
	var input string
	num, err := fmt.Scan(&input)
	_ = num

	if err != nil {
		fmt.Println(err)
		return
	}
	os.Mkdir("."+string(filepath.Separator)+string(input), 0777)
}

func useDB() {
	fmt.Print("USE DATABASE\nIngrese el nombre de la base de datos a usar: ")

	/*var input string
	num, err := fmt.Scan(&input)
	_ = num

	if err != nil {
		fmt.Println(err)
		return
	}
	os.Mkdir("."+string(filepath.Separator)+string(input), 0777)*/

	file, err := os.Create("prueba.txt")

	if err != nil {
		log.Fatal(err)
	}

	file.WriteString("Primer Registro")

	file.Close()

	stream, err := ioutil.ReadFile("prueba.txt")

	if err != nil {
		log.Fatal(err)
	}

	readString := string(stream)

	fmt.Println(readString)

	f, err := os.OpenFile("prueba.txt", os.O_APPEND|os.O_WRONLY, 0600)
	if err != nil {
		panic(err)
	}

	defer f.Close()

	fmt.Print("Ingrese lo que va a agregar al archivo: ")
	num, err := fmt.Scan(&input)
	_ = num

	if err != nil {
		fmt.Println(err)
		return
	}

	if _, err = f.WriteString("\n" + input); err != nil {
		panic(err)
	}
}
