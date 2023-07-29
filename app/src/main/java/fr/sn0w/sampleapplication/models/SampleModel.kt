package fr.sn0w.sampleapplication.models

/**
 * Created by Sn0w on 29/07/2023.
 */
class SampleModel(
    val text: String,
    val obj: SampleModelObj,
    val obj2: SampleModelObj2
) {

    lateinit var otherText: String

    class SampleModelObj(val text: String) {
    }

    class SampleModelObj2(val text: String) {
    }
}

// val sampleModel= SampleModel("text", SampleModel.SampleModelObj("text"), SampleModel.SampleModelObj2("text"))
// sampleModel.otherText = "text"
// val sampleModelObj = sampleModel.obj
// val sampleModelObj2 = SampleModel.SampleModelObj2("text")