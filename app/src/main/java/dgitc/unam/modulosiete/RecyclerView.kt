package dgitc.unam.modulosiete

import AdapterViewHolder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dgitc.unam.modulosiete.databinding.ActivityRecyclerViewBinding

class RecyclerView :  AppCompatActivity() {
    private lateinit var binding:ActivityRecyclerViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityRecyclerViewBinding.inflate(layoutInflater)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)
        setContentView(binding.root)
        initItemp()
    }
    private fun initItemp(){
        val recyclerView=binding.data
        recyclerView.layoutManager= LinearLayoutManager(this)
        val adapter=AdapterViewHolder(this,Source.dataList)
        recyclerView.adapter=adapter
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
