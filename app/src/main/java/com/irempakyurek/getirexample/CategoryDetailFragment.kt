package com.irempakyurek.getirexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import com.irempakyurek.getirexample.databinding.FragmentCategoryDetailBinding

class CategoryDetailFragment : Fragment() {

    private lateinit var view: FragmentCategoryDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        view = DataBindingUtil.inflate(inflater, R.layout.fragment_category_detail, container, false)

        val bundle: CategoryDetailFragmentArgs by navArgs()
        val category = bundle.categoryObject

        view.categoryObject = category

        view.imgCategoryDetail.setImageResource(resources.getIdentifier(category.categoryImageName, "drawable", requireContext().packageName))
        return view.root
    }

}