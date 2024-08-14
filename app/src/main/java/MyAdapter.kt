import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.google.android.material.imageview.ShapeableImageView
import com.squareup.picasso.Picasso

class MyAdapter(val context : Activity, val dataArrayList : List<Data>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var id : TextView
        var firstName : TextView
        var lastName : TextView
        var email : TextView
        var Image : ShapeableImageView
        init {
            id = itemView.findViewById(R.id.UserId)
            firstName = itemView.findViewById(R.id.UserFirstName)
            lastName = itemView.findViewById(R.id.UserLastName)
            Image = itemView.findViewById(R.id.UserImage)
            email = itemView.findViewById(R.id.Useremail)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.eachitem , parent , false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = dataArrayList[position]
        holder.id.text = currentItem.id.toString()
        holder.firstName.text = currentItem.first_name
        holder.lastName.text = currentItem.last_name
        holder.email.text = currentItem.email
        Picasso.get().load(currentItem.avatar).into(holder.Image);

    }

    override fun getItemCount(): Int {
        return dataArrayList.size
    }
}