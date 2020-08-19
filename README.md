Command-line based Hyperskill project that uses two simple encryption algorithms for implementing the Caesar Cipher technique:

1. Shift Algorithm replaces each letter by a given number of positions down the alphabet.
2. Unicode algorithm adds a fixed ASCII (Unicode) value of each character of a message. 

Optional command line arguments (can be entered in different positions): 

-mode 

Implements the program's mode ("enc" for encryption and "dec" for decryption)

-key 

An integer key used to modify the message 

-data

A text or ciphertext to encrypt or decrypt.

-in

The full name - passed in quotes - of a file used to read data from 

-out

The full name - passed in quotes - of a file used to write data to 

-alg 

Select the preferred algorithm to implement the Caesar Cypher: "shift" for the shift algorithm and "unicode" for the unicode algorithm.

Rules:

1. If there is no -mode, the program works in enc mode.
2. If there is no -key, its default value is 0.
3. If there is no -data, and there is no -in the program defaults data to an empty string.
4. If there is no -out argument, the program prints data to the standard output.
5. If there are both -data and -in arguments, the program defaults to -data over -in.
6. If there is no -alg, the program defaults to shift.

When a non-standard situation (an input file does not exist or an argument doesn’t have a value) occur, the program displays a message about the problem and stops successfully.

Example 1

java Main -mode enc -in road_to_treasure.txt -out protected.txt -key 5 -alg unicode

This command must get data from the file road_to_treasure.txt, encrypt the data with the key 5, create a file called protected.txt and write ciphertext to it.

Example 2

Input:

java Main -mode enc -key 5 -data "Welcome to hyperskill!" -alg unicode

Output:

\jqhtrj%yt%m~ujwxpnqq&

Example 3

Input:

java Main -key 5 -alg unicode -data "\jqhtrj%yt%m~ujwxpnqq&" -mode dec

Output:

Welcome to hyperskill!

Example 4:

Input:

java Main -key 5 -alg shift -data "Welcome to hyperskill!" -mode enc

Output:

Bjqhtrj yt mdujwxpnqq!

Example 5:

Input:

java Main -key 5 -alg shift -data "Bjqhtrj yt mdujwxpnqq!" -mode dec

Output:

Welcome to hyperskill!

