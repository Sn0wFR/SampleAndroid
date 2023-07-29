package fr.sn0w.sampleapplication.models.api

/**
 * Created by Sn0w on 29/07/2023.
 */
data class SampleRequest(val text: String, val obj: SampleRequestObj, val obj2: SampleRequestObj2) {
    data class SampleRequestObj(val text: String)
    data class SampleRequestObj2(val text: String)
}

// val sampleRequest = SampleRequest("text", SampleRequest.SampleRequestObj("text"), SampleRequest.SampleRequestObj2("text"))
