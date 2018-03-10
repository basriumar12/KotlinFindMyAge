package info.blogbasbas.findmyage

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.telecom.Call
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnCountAge.setOnClickListener {
            if(edtAge.text.toString().isEmpty()){
                Toast.makeText(this,"cant empty field",Toast.LENGTH_LONG).show()
            }else {

                var age = edtAge.text.toString().toInt()
                var currentYear = Calendar.getInstance().get(Calendar.YEAR)

                var hasil = currentYear - age

                tvShowAge.text = "${hasil.toString()} years old"

            }




        }

    }
}
