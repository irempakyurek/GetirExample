package com.irempakyurek.getirexample

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.irempakyurek.getirexample.databinding.CategoryCardBinding

class CategoriesAdapter(var mContext: Context, var categoryList: List<Category>) :
    RecyclerView.Adapter<CategoriesAdapter.CategoriesViewHolder>() {

    inner class CategoriesViewHolder(categoryCardBinding: CategoryCardBinding) :
        RecyclerView.ViewHolder(categoryCardBinding.root) {
        var view: CategoryCardBinding

        init {
            this.view = categoryCardBinding
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriesViewHolder {
        val layoutInflater = LayoutInflater.from(mContext)
        val view = CategoryCardBinding.inflate(layoutInflater, parent, false)
        return CategoriesViewHolder(view)
    }

    override fun onBindViewHolder(holder: CategoriesViewHolder, position: Int) {
        val category = categoryList.get(position)

        holder.view.categoryObject = category

        holder.view.imgCategory.setImageResource(
            mContext.resources.getIdentifier(
                category.categoryImageName,
                "drawable",
                mContext.packageName
            )
        )

        holder.view.cvCategory.setOnClickListener {
            val transition = CategoriesFragmentDirections.toCategoryDetailFragment(category)
            Navigation.findNavController(it).navigate(transition)
        }
    }

    override fun getItemCount(): Int {
        return categoryList.size
    }

}