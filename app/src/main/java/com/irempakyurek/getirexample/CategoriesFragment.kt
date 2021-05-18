package com.irempakyurek.getirexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.irempakyurek.getirexample.databinding.FragmentCategoriesBinding

class CategoriesFragment : Fragment() {

    private lateinit var view: FragmentCategoriesBinding
    private lateinit var categoryList: ArrayList<Category>
    private lateinit var adapter: CategoriesAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        view = DataBindingUtil.inflate(inflater, R.layout.fragment_categories, container, false)
        view.categoriesFragment = this
        view.categoriesToolbarTitle = getString(R.string.toolbar_title)
        (activity as AppCompatActivity).setSupportActionBar(view.toolbarMainPage)


        view.rvCategories.layoutManager = StaggeredGridLayoutManager(4, StaggeredGridLayoutManager.VERTICAL)

        val f1 = Category(1, "Meyve&Sebze", "meyve_sebze", 1.09,19.99, "Bu kategoride meyve ve sebze ürünleri yer almaktadır.")
        val f2 = Category(2, "Fırından", "firindan", 1.49, 15.99, "Bu kategoride fırın ürünleri yer almaktadır.")
        val f3 = Category(3, "Atıştırmalık", "atistirmalik", 0.49, 9.99, "Bu kategoride atıştırmalık ürünler yer almaktadır.")
        val f4 = Category(4, "Dondurma", "dondurma", 3.99, 28.99, "Bu kategoride dondurma çeşitleri yer almaktadır.")
        val f5 = Category(5, "Yiyecek", "yiyecek", 15.99, 45.99, "Bu kategoride yiyecek ürünleri yer almaktadır.")
        val f6 = Category(6, "İçecek", "su_icecek", 1.59, 14.99, "Bu üründe içecek çeşitleri yer almaktadır.")
        val f7 = Category(7, "Fit&Form", "fit_form", 16.99, 35.59, "Bu kategoride Fit&Form yiyecekler yer almaktadır.")
        val f8 = Category(8, "Süt&Kahvaltı", "sut_kahvalti", 5.99, 26.99, "Bu kategoride Süt&Kahvaltı çeşitleri yer almaktadır.")
        val f9 = Category(9, "Temel Gıda", "temel_gida", 3.99, 30.99,"Bu kategoride temel gıda ürünleri yer almaktadır.")
        val f10 = Category(10, "Kişisel Bakım", "kisisel_bakim", 10.99, 40.99,"Bu kategoride kişisel bakım ürünleri yer almaktadır.")
        val f11 = Category(11, "Ev Bakım", "ev_bakim", 24.99,56.99, "Bu kategoride ev bakım ürünleri yer almaktadır.")
        val f12 = Category(12, "Ev Yaşam", "ev_yasam", 15.99, 45.99, "Bu kategoride ev yaşam ürünleri yer almaktadır.")
        val f13 = Category(13, "Teknoloji", "teknoloji", 21.99,70.99, "Bu kategoride teknoloji ürünleri yer almaktadır.")
        val f14 = Category(14, "Evcil Hayvan", "evcil_hayvan", 32.99, 70.99, "Bu kategoride evcil hayvan ürünleri yer almaktadır.")
        val f15 = Category(15, "Bebek", "bebek", 12.99, 54.99, "Bu kategoride bebek ürünleri yer almaktadır.")
        val f16 = Category(16, "Cinsel Sağlık", "cinsel_saglik", 20.99, 39.99, "Bu kategoride cinsel sağlık ürünleri yer almaktadır.")
        val f17 = Category(17, "Giyim", "giyim", 30.09, 80.99, "Bu kategoride giyim ürünleri yer almaktadır.")

        categoryList = ArrayList()
        categoryList.add(f1)
        categoryList.add(f2)
        categoryList.add(f3)
        categoryList.add(f4)
        categoryList.add(f5)
        categoryList.add(f6)
        categoryList.add(f7)
        categoryList.add(f8)
        categoryList.add(f9)
        categoryList.add(f10)
        categoryList.add(f11)
        categoryList.add(f12)
        categoryList.add(f13)
        categoryList.add(f14)
        categoryList.add(f15)
        categoryList.add(f16)
        categoryList.add(f17)

        adapter = CategoriesAdapter(requireContext(), categoryList)
        view.adapter = adapter

        return view.root
    }
}