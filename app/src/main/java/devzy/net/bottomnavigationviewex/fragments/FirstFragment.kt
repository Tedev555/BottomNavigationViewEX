package devzy.net.bottomnavigationviewex.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import devzy.net.bottomnavigationviewex.R

/**
 * Created by ted555 on 2/6/18.
 */
class FirstFragment: Fragment() {
    companion object {
        fun newInstance(): FirstFragment {
            val fragment = FirstFragment()

            return fragment
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        init(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        // Inflate the layout for this fragment
        val myView = inflater!!.inflate(R.layout.fragment_first, container, false)

        return myView
    }

    private fun init(savedInstanceState: Bundle?) {

    }

    private fun initInstances(rootView: View, savedInstanceState: Bundle) {
        // Init 'View' instance(s) with rootView.findViewById here
        // Note: State of variable initialized here could not be saved
        //       in onSavedInstanceState

    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        // Save Instance (Fragment level's variables) State here
    }

    private fun onRestoreInstanceState(savedInstanceState: Bundle) {
        // Restore Instance (Fragment level's variables) State here

    }
}