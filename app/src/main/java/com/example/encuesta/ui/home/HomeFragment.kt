package com.example.encuesta.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation
import com.example.encuesta.R
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.view.*

class HomeFragment : Fragment() {

    private var root: View? = null
    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(






        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?): View? {



        homeViewModel = ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)

        homeViewModel.text.observe(this, Observer {
        })

        root!!.encuestaimagen.setImageResource(R.drawable.questions)
        return root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        addquestion.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_nav_home_to_nav_gallery))
        begininterview.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_nav_home_to_nav_slideshow))
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item!!.itemId

        return super.onOptionsItemSelected(item)
    }
}