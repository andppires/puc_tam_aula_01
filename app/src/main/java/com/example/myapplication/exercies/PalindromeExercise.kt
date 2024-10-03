package com.example.myapplication.exercies

class PalindromeExercise {
    fun isPalindrome(word: String): Boolean {
        val reversed = word.reversed()  // Inverte a palavra
        return word.equals(reversed, ignoreCase = true)  // Compara ignorando maiúsculas e minúsculas
    }
}
