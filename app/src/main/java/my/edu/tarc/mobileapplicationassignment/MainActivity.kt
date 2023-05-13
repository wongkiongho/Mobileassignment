package my.edu.tarc.mobileapplicationassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.firebase.database.FirebaseDatabase
import my.edu.tarc.mobileapplicationassignment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(HomeFragment())

        binding.bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){

                R.id.home -> replaceFragment(HomeFragment())
                R.id.donation -> replaceFragment(DonationFragment())
                R.id.campaign -> replaceFragment(CampaignFragment())
                R.id.profile -> replaceFragment(ProfileFragment())

                else ->{

                }
            }
            true
        }



    }

    private fun replaceFragment(fragment: Fragment){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout ,fragment)
        fragmentTransaction.commit()
    }


}