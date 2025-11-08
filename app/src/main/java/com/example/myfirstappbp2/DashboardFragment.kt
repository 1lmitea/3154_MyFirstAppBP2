// File: app/src/main/java/com/example/myfirstappbp2/DashboardFragment.kt
package com.example.myfirstappbp2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class DashboardFragment : Fragment() {

    private lateinit var viewPager: ViewPager2
    private lateinit var tabLayout: TabLayout
    private lateinit var adapter: DashboardPagerAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Baris ini sama seperti yang Anda punya, mengambil layout dari Langkah 1
        return inflater.inflate(R.layout.fragment_dashboard, container, false)
    }

    // Method ini akan dipanggil SETELAH layout-nya dibuat
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Inisialisasi adapter dari Langkah 3
        adapter = DashboardPagerAdapter(this)

        // Hubungkan variabel dengan view di layout XML (dari Langkah 1)
        viewPager = view.findViewById(R.id.view_pager)
        tabLayout = view.findViewById(R.id.tab_layout)

        // Set adapter ke ViewPager
        viewPager.adapter = adapter

        // Tentukan judul untuk setiap tab
        val tabTitles = arrayOf("Berita", "Pengumuman")

        // Hubungkan TabLayout dengan ViewPager
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = tabTitles[position]
        }.attach()
    }
}