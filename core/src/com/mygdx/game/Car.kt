package com.mygdx.game

import com.badlogic.gdx.math.Vector2
import com.mygdx.game.util.*

class Car(
        val koeff: Double = 0.4,
        val mu: Double = 0.7,
        val maxAcceleration: Double = 1000.0,
        val mass: Double = 1000.0,
        var collider: MyBox = MyBox(0.0, 0.0, 7.0, 20.0),
        var speed: Vector2 = Vector2.Zero,
        var acceleration: Vector2 = Vector2.Zero) {

    fun turn(delta: Double, userForce: Double, userRotation: Double) {
        collider.x += speed.x * delta
        collider.y += speed.y * delta
        val tyaga = acceleration.nor() *
            Math.min(
                acceleration.len().toDouble(),
                maxAcceleration - koeff * Math.exp(-userForce)
            )
        acceleration = tyaga * (1 - MyBox.roundFriction) -
                Math.sin(userRotation) * mu * mass * MyBox.g * speed.nor()
        speed += delta * acceleration
    }
}
