package fr.sn0w.sampleapplication.fragments;

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.NonNull
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import fr.sn0w.sampleapplication.R

/**
 * Created by Sn0w on 29/07/2023.
 */
class SampleFragment : Fragment() {
    private lateinit var navController: NavController // pour aller d'un fragment à un autre

    @Nullable
    override fun onCreateView(
        @NonNull inflater: LayoutInflater,
        @Nullable container: ViewGroup?,
        @Nullable savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_fragment, container, false)
    }
}
