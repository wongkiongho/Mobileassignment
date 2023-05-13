package my.edu.tarc.mobileapplicationassignment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.google.firebase.database.DatabaseReference

class ProfileFragment : Fragment(R.layout.fragment_profile) {
    private lateinit var mDatabase: DatabaseReference
    private lateinit var mEditText: EditText
    private lateinit var mButton: Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}