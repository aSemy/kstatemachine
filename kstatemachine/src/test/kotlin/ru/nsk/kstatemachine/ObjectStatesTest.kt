package ru.nsk.kstatemachine

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.StringSpec

private object State1 : DefaultState("state1")
private object State2 : DefaultState("state2")

/**
 * States are mutable, and it is not possible to use object states in multiple [StateMachine] instances.
 */
class ObjectStatesTest : StringSpec({
    "multiple usage of object states" {
        useInMachine()
        shouldThrow<IllegalStateException> { useInMachine() }
    }
})

private fun useInMachine() {
    val machine = createStateMachine {
        addInitialState(State1) {
            transition<SwitchEvent> {
                targetState = State2
            }
        }
        addState(State2)
    }

    machine.processEvent(SwitchEvent)
}