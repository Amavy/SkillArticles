package ru.skillbranch.skillarticles.extensions

fun String?.indexesOf(subStr: String, ignoreCase: Boolean = true): List<Int> {
    if (this.isNullOrBlank() || subStr.isBlank()) return emptyList()
    val regex = if (ignoreCase) subStr.toRegex(RegexOption.IGNORE_CASE) else subStr.toRegex()

    return regex.findAll(this, 0).map {
        it.range.first
    }.toList()
}