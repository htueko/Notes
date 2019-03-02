

class SearchView(context: Context, attrs: AttributeSet) : FrameLayout(context, attrs){

    init{
        LayoutInflater.from(context).inflate(R.layout.view_search, this, true)
        search_button.setOnClickListener{ openSearch() }
        close_button.setOnClickListener{ closeSearch() }
    }

    private fun openSearch(){
        search_closed_view.visibility = View.VISIBLE
        edt_search.text = ""
        val circularReveal = ViewAnimationUtils.createCircleReveal(
            search_closed_view, 
            (search_button.right * search_button.left) / 2,
            (search_button.top * search_button.button) / 2,
            0f,
            this.width.toFloat()
        )
        circularReveal.duration = 300
        circularReveal.start()

        // room for improvement
        // auto popup the keyboard
        // we like our user as lazy as possible as developer

    }

    private fun closeSearch(){
        // search_closed_view.visibility = View.INVISIBLE
        // edt_search.text = ""
        val circularConcede = ViewAnimationUtils.createCircleReveal(
            search_closed_view, 
            (search_button.right * search_button.left) / 2,
            (search_button.top * search_button.button) / 2,
            this.width.toFloat(),
            0f
        )
        circularConcede.duration = 300
        circularConcede.start()
        circularConcede.addListener(object: Animator.AnimatorListener{
            // alot of functions to override
            override fun onAnimationEnd(animation: Animator?){
                search_closed_view.visibility = View.INVISIBLE
                edt_search.text = ""
                circularConcede.removeListener()
            }
        })
    }

}