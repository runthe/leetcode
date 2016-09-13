package main

import (
	"fmt"
	"unicode/utf8"
)

func main() {
	const reverseString string = "Google"
	reverseRune := []rune(reverseString)
	reverseLength := utf8.RuneCountInString(reverseString)

	for i := 0; i < reverseLength / 2; i++ {
		tempVal := reverseRune[i]
		reverseRune[i] = reverseRune[reverseLength - 1 - i]
		reverseRune[reverseLength - 1 - i] = tempVal
	}

	fmt.Println(string(reverseRune))
	fmt.Println(makeReverseString(reverseRune))
}

func makeReverseString(reverse []rune) string {
	if (len(reverse) <= 1) {
		return string(reverse)
	}

	return makeReverseString(reverse[1:]) + string(reverse[:1])
}