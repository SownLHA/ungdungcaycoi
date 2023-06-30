package com.example.tudiencaycoi

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.articles.Image
import com.example.tudiencaycoi.databinding.ActivityArticlesBinding

class ArticlesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityArticlesBinding

    companion object {
        const val ARTICLES = "OBJECT_ARTICLES"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityArticlesBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val recyclerView = binding.articles  // Initialize recyclerView variable

        val imageList = listOf<Image>(
            Image(
                R.drawable.img1,
                "Information about tomato plants",
                "Tomato (two part nomenclature: Solanum lycopersicum), belonging to the Solanaceae family, is a vegetable for food. The fruit is initially green, turning yellow to red when ripe. Tomatoes have a slightly sour taste and are a nutritious food, good for the body, rich in vitamins C and A, especially rich in healthy lycopene."
            ),
            Image(
                R.drawable.img2,
                "Information about lychee tree",
                "Litchi is an evergreen tree of medium size, growing to 15–20 m tall, with alternately pinnate leaves, each 15–25 cm long, with 2-8 lateral leaflets 5–10 cm long. and no leaflets at the apex. The newly sprouted young leaves are bright copper-red, then gradually turn green when reaching their maximum size."
            ),
            Image(
                R.drawable.img3,
                "Information about the Cactus Family",
                "The cactus family is usually dicotyledonous and flowering succulents. The family Cactaceae has between 25 and 220 genera, depending on the source, of which there are between 1,500 and 1,800 species. The cactus is known to be native to the Americas, especially in desert regions. Wikipedia"
            ),
            Image(
                R.drawable.img4,
                "Information about roses",
                "Persimmon or rosemary is the common name for perennial shrub or climbing flowering plants of the genus Rosa, family Rosaceae, with more than 100 species with diverse flower colors, distributed from temperate to tropical regions. These species are famous for their beautiful flowers, so they are often called roses."
            ),
            Image(
                R.drawable.img5,
                "Information about coffee trees",
                "Coffee is a genus of plants in the family Herbs. The coffee genus includes many different species of perennials. However, not all species contain caffeine in the seeds, some species are far from the coffee plants we often see. Only two species of coffee have economic significance"
            )
        )
        recyclerView.layoutManager = LinearLayoutManager(this)  // Set layout manager
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ImageAdapter(this, imageList) { image:Image ->
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(ARTICLES, image)
            startActivity(intent)
        }
    }
}






