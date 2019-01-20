import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
 
class MainActivity : AppCompatActivity() {
 
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
 
        initToolbar()
 
        val tabLayout: TabLayout = findViewById(R.id.tab_layout)
 
        val viewPager: ViewPager = findViewById(R.id.view_pager)
 
        val adapter = SampleAdapter(supportFragmentManager)
 
        viewPager.adapter = adapter
        tabLayout.setupWithViewPager(viewPager)
         
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
 
            }
 
            override fun onTabUnselected(tab: TabLayout.Tab) {
 
            }
 
            override fun onTabReselected(tab: TabLayout.Tab) {
 
            }
        })
    }
 
    private fun initToolbar() {
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar!!.title = "TabLayout Demo"
    }
}