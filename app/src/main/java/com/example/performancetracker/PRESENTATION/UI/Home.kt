package com.example.performancetracker.PRESENTATION.UI

import android.app.AlertDialog
import android.content.DialogInterface
import android.os.Bundle
import android.view.*
import android.widget.*
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import com.example.performancetracker.R
import java.text.SimpleDateFormat
import java.util.*
import android.widget.ArrayAdapter as ArrayAdapter


class Home : Fragment(), AdapterView.OnItemSelectedListener {

    lateinit var H_PopUpMenuButton: ImageButton
    lateinit var H_PopMenu: PopupMenu

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val languages = resources.getStringArray(R.array.HomeOption)

/*
        */
        /**
         * View management : by Day or by month
         */

        val spinner: Spinner = view.findViewById<Spinner>(R.id.spinner)
        spinner
        // Create an ArrayAdapter using the string array and a default spinner layout
        context?.let {
            ArrayAdapter.createFromResource(
                it,
                R.array.HomeOption,
                android.R.layout.simple_spinner_item
            ).also { adapter ->
                // Specify the layout to use when the list of choices appears
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                // Apply the adapter to the spinner
                spinner.adapter = adapter
            }
        }

        /**
         *  pop up menu management
        */
        H_PopUpMenuButton=view.findViewById<ImageButton>(R.id.HomePopUpMenuButton)
        H_PopMenu= PopupMenu(requireContext(),H_PopUpMenuButton)

        H_PopUpMenuButton.setOnClickListener {
            H_PopMenu.menuInflater.inflate(R.menu.home_profil_menu,H_PopMenu.menu)
            H_PopMenu.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener {
                when(it.itemId){
                    R.id.home_menu_logout -> Toast.makeText(requireContext(),"logout clicked",Toast.LENGTH_SHORT).show()
                    R.id.home_menu_profil -> Toast.makeText(requireContext(),"profil clicked",Toast.LENGTH_SHORT).show()
                }
                Toast.makeText(requireContext(),"all workout deleted",Toast.LENGTH_SHORT).show()
                true
            })
            H_PopMenu.show()
            }
        /***
         * Set date of the day
         * */
        val formatter = SimpleDateFormat("dd MM yyyy")
        val date = Date()
        val current = formatter.format(date)
        val dateOfTheDay:TextView=view.findViewById(R.id.DateOfTheDay)
        dateOfTheDay.text= current.toString()

        /***
         * dialog for adding water
         */
        val builder = AlertDialog.Builder(requireContext())
        val inflater:LayoutInflater=layoutInflater
        val dialogLayout=inflater.inflate(R.layout.water_popup,null)

        dialogLayout.findViewById<Button>(R.id.PopUpOkButton).setOnClickListener {
                Toast.makeText(requireContext(),"a glass was added",Toast.LENGTH_SHORT).show()
            }
        builder.setView(dialogLayout)
        builder.apply {
         /*   setPositiveButton(R.string.OK, DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(requireContext(),"a glass was added",Toast.LENGTH_SHORT).show()
            })
            setNegativeButton(R.string.CANCEL, DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(requireContext(),"canceled",Toast.LENGTH_SHORT).show()
            })*/
        }
        view.findViewById<ImageButton>(R.id.AddMoreWaterGlasses).setOnClickListener {
            // show the pop up
            builder.show()
        }
        /**
         * Navigation component management
         */

    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        TODO("Not yet implemented")
    }

    override fun onNothingSelected(p0: AdapterView<*>?) {
        TODO("Not yet implemented")
    }

    /*Get the day of the day*/
    fun TheDateOfTheDay():String{

        val month = Date().month
        val dayOfTheWeek = Date().day
        val Numday = Date().time
        return ("$dayOfTheWeek $Numday $month")
    }

}

