package ru.nsk.kstatemachine

object Testing {
    /**
     * Method for testing purpose. It allows starting machine from particular [state]
     */
    fun StateMachine.startFrom(state: IState) = (this as InternalStateMachine).startFrom(state)
}