package fr.sn0w.sampleapplication.models.api

/**
 * Created by Sn0w on 29/07/2023.
 */
data class SampleResponse(val text: String, val obj: SampleResponseObj, val obj2: SampleResponseObj2) {
    data class SampleResponseObj(val text: String)
    data class SampleResponseObj2(val text: String)
}