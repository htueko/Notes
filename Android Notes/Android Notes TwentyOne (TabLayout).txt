// TabLayout
// ViewPager

-> TabLayout is horizontal orientation
-> have fixed and scrollable (fixed means all tab will displayed (not good for more than 3 or 4 tabs))
-> can displayed text, icon or both 

-> Fixed Tabs
1   create a new project
2   create the Fragment(s) for tab (likes Pages)
    -> creat a class, extends Fragment()
    -> override onCreateView()
    -> inflate the layout
    -> eg inflater.inflate(R.layout.fragment_one, container, false)

3   prepare the activity_main.xml
    -> Coordinatorlayout
        -> AppBarLayout 
            android:theme="@style/AppTheme.AppBarOverlay"
            -> Toolbar 
            app:contentInsetStartWithNavigation="0dp"
            app:layout_scrollFlags="scroll|enterAlways"
            app:popupTheme="@style/AppTheme.PopupOverlay"
            -> TabLayout
            style="@style/CustomTabLayout"
            app:tabGravity="fill"
            app:tabMode="fixed"
        -> ViewPager
        app:layout_behavior="@string/appbar_scrolling_view_behavior"

    -> tabIndicatorColor: set the color of the currently selected tab
        setSelectedTabIndicatorColor() on a TabLayout instance
    -> tabIndicatorHeight: set the tab indicator height
        setSelectedTabIndicatorHeight() on a Tablayout instance
    -> tabSelectedTextColor: set the text color for different state
        setTabTextColors()

4   create a PagerAdapter class that extends FragmentPagerAdapter
    -> ovrride getItem() return Fragment
    -> override getCount() return count 
    -> override getPageTitle() return CharSequence

5   initializate the components
    -> instance of TabLayout
    -> instance of ViewPager
    -> instance of Adapter
    -> set the adapter to viewPager // viewPager.adapter = adapter
    -> setup the viewpager to tabLayout // tabLayout.setupWithViewPager(viewPager)
    -> attach addOnTabSelectedListener to tabLayout
        -> onTabSelected()
        -> onTabUnselected()
        -> onTabReselected()
    -> NOTES 
        tabLayout.tabMode = TabLayout.MODE_FIXED
        tabLayout.tabMode = TabLayout.MODE_SCROLLABLE
        
        val tabLayout: TabLayout = findViewById(R.id.tab_layout)
        tabLayout.addTab(tabLayout.newTab().setText("Songs"))
        tabLayout.addTab(tabLayout.newTab().setText("Albums"))
        tabLayout.addTab(tabLayout.newTab().setText("Artists"))
        
        <android.support.design.widget.TabLayout
            android:id="@+id/tabs"
            android:layout_width="match_parent"
            android:layout_height="wrap_content">
    
            <android.support.design.widget.TabItem
                    android:id="@+id/tabItem"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="Songs"/>
        
            <android.support.design.widget.TabItem
                    android:id="@+id/tabItem2"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="Albums"/>
        
            <android.support.design.widget.TabItem
                    android:id="@+id/tabItem3"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="Artists"/>
        
        </android.support.design.widget.TabLayout>


-> Scrollable Tabs
    -> just change the app:tabMode="scrollable" or tabLayout.tabMode = TabLayout.MODE_SCROLLABLE


-> Showing Tab icons
    class MainActivity : AppCompatActivity() {
 
    override fun onCreate(savedInstanceState: Bundle?) {
        // ... 
        tabLayout.setupWithViewPager(viewPager)
        tabLayout.getTabAt(0)!!.setIcon(android.R.drawable.ic_dialog_email)
        tabLayout.getTabAt(1)!!.setIcon(android.R.drawable.ic_dialog_info)
        tabLayout.getTabAt(2)!!.setIcon(android.R.drawable.ic_dialog_alert)
        // ... 
    }
     
    // ... 
}
    -> don't override getPageTitle() if you prefered icon instead of text


-> Android Studio Template to Create TabLayout with ViewPager
1   -> create a project
2   -> select Tabbed Activity
3   -> choose Action Bar Tabs (with ViewPager) at Navigation Style

