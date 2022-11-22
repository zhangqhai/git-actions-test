package main

import (
	"fmt"
	"time"
)

func main() {
	for i := 0; i <= 10; i++ {
		time.Sleep(time.Duration(1) * time.Second)
		fmt.Println("openx")
	}
}
