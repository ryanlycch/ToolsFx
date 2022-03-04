package me.leon.ext

interface IClassical {

    fun encrypt(raw: String, params: MutableMap<String, String>): String

    fun decrypt(raw: String, params: MutableMap<String, String>): String

    fun paramsCount(): Int = 0

    fun paramsHints(): List<String> = listOf("", "")

    fun isIgnoreSpace(): Boolean = true
}
