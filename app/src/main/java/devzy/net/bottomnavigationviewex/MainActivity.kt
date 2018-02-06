package devzy.net.bottomnavigationviewex

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import devzy.net.bottomnavigationviewex.fragments.FirstFragment
import devzy.net.bottomnavigationviewex.fragments.SecondFragment
import devzy.net.bottomnavigationviewex.fragments.ThirdFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Blinding BottomNavigationView
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        //By default fist time show FirstFragment
        selectFragment(FirstFragment.newInstance())

        bottomNav.setOnNavigationItemSelectedListener( { item ->
            when (item.itemId) {
                R.id.action_home -> selectFragment(FirstFragment.newInstance())
                R.id.action_learn -> selectFragment(SecondFragment.newInstance())
                R.id.action_profile -> selectFragment(ThirdFragment.newInstance())
            }
            true
        })
    }

    //Function to transaction fragment by use fragment from parameter
    private fun selectFragment(fragment: Fragment) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment_container, fragment)
        fragmentTransaction.commit()
    }
}
