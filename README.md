Command-line based Hyperskill project that uses two simple encryption algorithms for implementing the Caesar Cypher technique:

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

