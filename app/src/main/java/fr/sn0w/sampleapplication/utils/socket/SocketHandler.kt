package fr.sn0w.sampleapplication.utils.socket

import io.socket.client.IO
import io.socket.client.Socket
import java.net.URISyntaxException

/**
 * Created by Sn0w on 29/07/2023.
 */
class SocketHandler {
    private var mSocket: () -> Socket = {
        try {
            IO.socket("http://sampleIP:xxxx").connect()
        } catch (e: URISyntaxException) {
            throw RuntimeException(e)
        }
    }

    fun getSocket(): Socket {
        return mSocket.invoke()
    }
}

// val mSocket = SocketHandler().getSocket()