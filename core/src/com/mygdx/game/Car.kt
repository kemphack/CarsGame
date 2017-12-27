package com.mygdx.game

import com.badlogic.gdx.math.Vector2
import com.mygdx.game.util.*

class Car(
        val mu: Float = 0.7f,
        val maxSpeed: Float = 10f,
        val mass: Float = 1.0f,
        var collider: MyBox = MyBox(0.0f, 0.0f, 7.0f, 20.0f),
        private var rotationSpeed: Float = 0.0f,
        private var speed: Vector2 = Vector2(Vector2.Zero),
        private var acceleration: Vector2 = Vector2(Vector2.Zero)) {

    fun turn(delta: Float, userForce: Float, userRotation: Double) {
        val tyaga = userForce * maxSpeed / mass

        acceleration = (collider.direction * tyaga - 0.2f * speed) / mass
        speed += delta * acceleration
        collider.coords += speed * delta
    }
}
