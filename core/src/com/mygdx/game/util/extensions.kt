package com.mygdx.game.util

import com.badlogic.gdx.math.Vector2
import com.badlogic.gdx.math.Vector3

operator fun Vector2.plus(v : Vector2) = Vector2(x + v.x, y + v.y)

operator fun Vector2.minus(v : Vector2) = Vector2(x - v.x, y - v.y)

operator fun Vector2.unaryMinus() = Vector2(-x, -y)

operator fun Vector2.times(f : Float) = Vector2(x * f, y * f)

val Vector2.normalized: Vector2
    get() =
        if(this.isZero) Vector2.Zero
        else Vector2(this) / this.len()

val Vector2.abs get() = this.len()

operator fun Float.times(v: Vector2) = Vector2(v.x * this, v.y * this)

operator fun Vector2.div(f: Float) = Vector2(x / f, y / f)
/*
operator fun Vector2.plusAssign(v : Vector2) {
    this.x += v.x
    this.y += v.y
}

operator fun Vector2.minusAssign(v : Vector2) {
    this.x -= v.x
    this.y -= v.y
}

operator fun Vector2.timesAssign(f : Float) {
    this.x *= f
    this.y *= f
}

operator fun Vector2.divAssign(f: Float) {
    this.x /= f
    this.y /= f
}
*/
