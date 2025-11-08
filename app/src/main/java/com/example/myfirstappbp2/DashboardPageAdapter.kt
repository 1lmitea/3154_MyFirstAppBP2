package com.example.myfirstappbp2

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

// Adapter ini yang memberi tahu ViewPager2 urutan fragment-nya
class DashboardPagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {

    // Kita punya 2 tab
    override fun getItemCount(): Int = 2

    // Logika untuk menentukan fragment mana yang tampil
    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> BeritaFragment()      // Posisi 0 (Tab pertama) adalah BeritaFragment
            1 -> PengumumanFragment()  // Posisi 1 (Tab kedua) adalah PengumumanFragment
            else -> throw IllegalStateException("Posisi tab tidak valid")
        }
    }
}