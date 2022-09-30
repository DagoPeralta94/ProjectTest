package com.example.myapplication

class ProviderQuote {
    companion object{
        val quotesList = listOf<RandomQuote>(
            RandomQuote(
                0,
                "Hola mundo"
            ),
            RandomQuote(
                1,
                "Hora de aventura"
            ),
            RandomQuote(
                2,
                "Frase aleatoria"
            )
        )
    }
}