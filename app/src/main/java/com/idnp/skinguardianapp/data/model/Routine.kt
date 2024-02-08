package com.idnp.skinguardianapp.data.model

data class Routine(
    val title: String,
    val Description: String,
    var tieneTemporizador: Boolean,
    var tiempoTemporizador: Long = 15000L,
    var isSelected: Boolean = false) {
}