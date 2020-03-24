package a1824jj.jp.ac.aiit.databindingsampel_ktx

import a1824jj.jp.ac.aiit.databindingsampel_ktx.databinding.ActivityMainBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.button.setOnClickListener { startOrStopProgressBar() }

    }

    private fun startOrStopProgressBar() {
       if( binding.progressBar.visibility == View.GONE){
           binding.progressBar.visibility = View.VISIBLE
           binding.button.text = "Stop"
       }else{
           binding.progressBar.visibility = View.GONE
           binding.button.text = "Start"
       }
    }
}
