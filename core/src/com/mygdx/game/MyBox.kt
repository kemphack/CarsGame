package com.mygdx.game

import com.badlogic.gdx.math.Vector2

class MyBox(
        x: Float = 0.0f,
        y: Float = 0.0f,
        var h: Float = 0.0f,
        var w: Float = 0.0f,
        rotation_angle: Double = 0.0) {

    companion object {
        const val g = 9.8f
    }

    var direction: Vector2 = Vector2(Math.cos(rotation_angle).toFloat(), Math.sin(rotation_angle).toFloat())
    var coords: Vector2 = Vector2(x, y)

    init {
        if (h < 0 || w < 0) throw Error("уккщк! ВАША ДЛИНА МЕНЬШЕ НУЛЯ))")
    }
}
