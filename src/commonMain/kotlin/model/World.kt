package model


class World(val id: String, var roomName: String, var userId: String) {
    constructor(id: String, roomName: String) : this(id, roomName, userId = "Debugging user")
}