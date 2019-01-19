public class MyRecyclerViewAdapter : RecyclerView.Adapter<MyRecyclerViewAdapter.ViewHolder>{

    private val TAG = "RecylerViewAdapter"
    private Context mContext

    private val mImageNames = ArrayList<>()
    private val mImages = ArrayList<>()

    private class MyViewHolder : RecyclerView.ViewHolder{
        public MyViewHolder(view: View){
            super(view)
            val image: CircleImageView = view.findViewById(R.id.image)
            val imageName: TextView = view.findViewById(R.id.image_name)
            val parentLayout: RelativeLayout = view.findViewById(R.id.parent_layout)
        }
    }

}