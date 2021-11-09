package main

import (
	"bufio"
	"fmt"
	"io"
	"os"
	"strconv"
	"strings"
)

/*
 * https://www.hackerrank.com/challenges/plus-minus/problem
 */

func plusMinus(arr []int32) {
	var positives, negatives, zeros int
	for _, val := range arr {
		if val == 0 {
			zeros++
		} else if val > 0 {
			positives++
		} else {
			negatives++
		}
	}
	total := len(arr)
	positivesRatio := float64(positives) / float64(total)
	negativesRatio := float64(negatives) / float64(total)
	zerosRatio := float64(zeros) / float64(total)
	fmt.Printf("%f\n%f\n%f\n", positivesRatio, negativesRatio, zerosRatio)

}

func main() {
	reader := bufio.NewReaderSize(os.Stdin, 16*1024*1024)

	nTemp, err := strconv.ParseInt(strings.TrimSpace(readLine(reader)), 10, 64)
	checkError(err)
	n := int32(nTemp)

	arrTemp := strings.Split(strings.TrimSpace(readLine(reader)), " ")

	var arr []int32

	for i := 0; i < int(n); i++ {
		arrItemTemp, err := strconv.ParseInt(arrTemp[i], 10, 64)
		checkError(err)
		arrItem := int32(arrItemTemp)
		arr = append(arr, arrItem)
	}

	plusMinus(arr)
}

func readLine(reader *bufio.Reader) string {
	str, _, err := reader.ReadLine()
	if err == io.EOF {
		return ""
	}

	return strings.TrimRight(string(str), "\r\n")
}

func checkError(err error) {
	if err != nil {
		panic(err)
	}
}
