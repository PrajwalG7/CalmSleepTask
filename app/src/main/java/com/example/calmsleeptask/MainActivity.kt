package com.example.calmsleeptask

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //get the view i.e sheet
        val sheet=findViewById<View>(R.id.sheet)
        BottomSheetBehavior.from(sheet).apply{
        peekHeight=200
            this.state=BottomSheetBehavior.STATE_COLLAPSED

        }
    }


    @SuppressLint("InflateParams")
    fun onClick( view: View) {
        val textView: TextView = findViewById(R.id.emimoney) as TextView
        textView.text="Credit Amount $20,000"

        val dialog=BottomSheetDialog(this)
        val sheetView=layoutInflater.inflate(R.layout.bottomsheet_dailog2,null)
        dialog.setContentView(sheetView)
        dialog.show()




    }

    @SuppressLint("InflateParams")
    fun onClick2( view: View) {
        val dialog=BottomSheetDialog(this)
        val sheetView=layoutInflater.inflate(R.layout.bottomsheet_dailog3,null)
        dialog.setContentView(sheetView)
        dialog.show()


    }

    @SuppressLint("InflateParams")
    fun onClick3( view: View) {
        val dialog=BottomSheetDialog(this)
        val sheetView=layoutInflater.inflate(R.layout.bottomsheet_dailog4,null)
        dialog.setContentView(sheetView)
        dialog.show()

    }
}