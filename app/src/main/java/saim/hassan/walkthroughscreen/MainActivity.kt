package saim.hassan.walkthroughscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    private lateinit var onboardingItemsAdapter: OnboardingItemsAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setOnBoardingItems()
    }
    private fun setOnBoardingItems(){
        onboardingItemsAdapter = OnboardingItemsAdapter(
                listOf(
                        OnboardingItem(
                               onboardingImage =  R.drawable.task,
                                title = "Manage Your Task",
                                description = "Organize all your to do's and projects. Color tag them to set priorities and categories "
                        ), OnboardingItem(
                        onboardingImage = R.drawable.time,
                        title = "Mark your Time",
                        description = "When you're overwhelmed by the amount of work you have on your plate,stop and rethink"
                        ), OnboardingItem(
                        onboardingImage = R.drawable.reminder,
                        title = "Get Reminder on Time",
                        description = "When you encounter a small task that takes less than 5 minutes to complete"
                        )

                )
        )
        val onboardingViewPager = findViewById<ViewPager2>(R.id.onboardingViewPager)
        onboardingViewPager.adapter = onboardingItemsAdapter
    }
}