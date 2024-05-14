Hola, estoy programando una api con las secuencias Collatz y FizzBuzz para un número entero.

Ejecutar Prueba_Técnica con Run As -> Spring Boot App
/////////////////////////////////////////////////////////
Con POSTMAN hacer el llamado de ambas secuencias con los siguientes métodos:


////////////////7llamada con postman secuenciaCollatz /////////////////////

método POST
http://localhost:8081/api
Headers
key: numSecuenciaCollatz 
Value: 18

(Enteroasacarsecuenciacollatz ->ejemplo 18)

[
    18,
    9,
    28,
    14,
    7,
    22,
    11,
    34,
    17,
    52,
    26,
    13,
    40,
    20,
    10,
    5,
    16,
    8,
    4,
    2,
    1
]

///////////////////llamada con postman secuenciaFizzBuzz///////////////////
método POST
http://localhost:8081/api/fizzbuzz
Headers
key:numFizzBuzz
Value:15


(EnteroasacarsecuenciaFizzBuzz - ejemplo 15)

[
    "1 ",
    "2 ",
    "3 Fizz",
    "4 ",
    "5 Buzz",
    "6 Fizz",
    "7 ",
    "8 ",
    "9 Fizz",
    "10 Buzz",
    "11 ",
    "12 Fizz",
    "13 ",
    "14 ",
    "15 FizzBuzz"
]
