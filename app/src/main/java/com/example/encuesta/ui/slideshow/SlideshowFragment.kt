package com.example.encuesta.ui.slideshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.encuesta.R
import kotlinx.android.synthetic.main.fragment_slideshow.*
import kotlinx.android.synthetic.main.fragment_slideshow.view.*
import java.io.Serializable

class SlideshowFragment : Fragment() {


    val mutablepreguntas = mutableListOf<String>("¿Qué le pareció nuestro servicio?")
    var contador =0
    private var root: View? = null
    private lateinit var slideshowViewModel: SlideshowViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {



        slideshowViewModel = ViewModelProviders.of(this).get(SlideshowViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_slideshow, container, false)

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let {
            val args = SlideshowFragmentArgs.fromBundle(it)
            args.preguntatoca
            mutablepreguntas.add(args.preguntatoca)
                //preguntatoca.text= args.preguntatoca
        }


        cambiarpregunta.setOnClickListener{
            if (contador < mutablepreguntas.size)
            preguntatoca.text = mutablepreguntas.get(contador)
            contador++


        }
         //   preguntatoca.text = (mutablepreguntas.get(0))



    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item!!.itemId
        if (id == R.id.guardar){
            Toast.makeText(activity, "sort", Toast.LENGTH_LONG).show()
        }
        return super.onOptionsItemSelected(item)
    }










}