package com.example.travelapplication.Fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.travelapplication.Activites.PromotionsActivity
import com.example.travelapplication.Activites.UttrakhandActivity
import com.example.travelapplication.Adapters.PromotionRecViewAdapter
import com.example.travelapplication.Adapters.RecViewAdapter
import com.example.travelapplication.Models.DestinationModel
import com.example.travelapplication.Models.PromotionModel
import com.example.travelapplication.R


class HomeFragment : Fragment() {

    lateinit var recViewDestination : RecyclerView
    lateinit var recViewPromotions : RecyclerView

    var arrDestinationList : ArrayList<DestinationModel> = ArrayList<DestinationModel>()
    lateinit var arrImg : Array<Int>
    lateinit var arrLike : Array<Int>
    lateinit var arrDestination : Array<String>
    lateinit var arrDestinationContent : Array<String>
    lateinit var arrDestinationItenary : Array<String>
    lateinit var arrDestinationItenaryContent : Array<String>

    var arrPromotionsList : ArrayList<PromotionModel> = ArrayList<PromotionModel>()
    lateinit var arrImgPromotions : Array<Int>
    lateinit var arrPromotionsContent : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arrImgPromotions = arrayOf(
            R.drawable.promo_one,
            R.drawable.promo_two,
            R.drawable.promo_three,
            R.drawable.promo_four,
            R.drawable.promo_five
        )

        arrPromotionsContent = arrayOf(
            "Coming Soon.",
            "Coming Soon.",
            "Coming Soon.",
            "Coming Soon.",
            "Coming Soon."
        )

        arrImg= arrayOf(
            R.drawable.uttrakhand,
            R.drawable.jaipur,
            R.drawable.manali,
            R.drawable.goa
        )

        arrLike = arrayOf(
            R.drawable.heart,
            R.drawable.heart,
            R.drawable.heart,
            R.drawable.heart
        )

        arrDestination = arrayOf(
            "Uttrakhand",
            "Jaipur",
            "Manali",
            "Goa"
        )

        arrDestinationContent = arrayOf(
            "Uttarakhand, a state in northern India crossed by the Himalayas, is known for its Hindu pilgrimage sites. Rishikesh, a major centre for yoga study, was made famous by the Beatles’ 1968 visit. The city hosts the evening Ganga Aarti, a spiritual gathering on the sacred Ganges River. The state's forested Jim Corbett National Park shelters Bengal tigers and other native wildlife.\n",
            "Jaipur is the capital of India’s Rajasthan state. It evokes the royal family that once ruled the region and that, in 1727, founded what is now called the Old City, or “Pink City” for its trademark building color. At the center of its stately street grid (notable in India) stands the opulent, colonnaded City Palace complex. With gardens, courtyards and museums, part of it is still a royal residence.",
            "Manali is a high-altitude Himalayan resort town in India’s northern Himachal Pradesh state. It has a reputation as a backpacking center and honeymoon destination. Set on the Beas River, it’s a gateway for skiing in the Solang Valley and trekking in Parvati Valley. It's also a jumping-off point for paragliding, rafting and mountaineering in the Pir Panjal mountains, home to 4,000m-high Rohtang Pass. ",
            "Goa is a state in western India with coastlines stretching along the Arabian Sea. Its long history as a Portuguese colony prior to 1961 is evident in its preserved 17th-century churches and the area’s tropical spice plantations. Goa is also known for its beaches, ranging from popular stretches at Baga and Palolem to those in laid-back fishing villages such as Agonda."
        )

        arrDestinationItenary = arrayOf(
            "UTTARAKHAND ITINERARY FOR 7 DAYS",
            "JAIPUR ITINERARY FOR 7 DAYS",
            "MANALI ITINERARY FOR 7 DAYS",
            "GOA ITINERARY FOR 7 DAYS"
        )

        arrDestinationItenaryContent = arrayOf(
            "\"DAY 1: HARIDWAR + RISHIKESH (STAY AT GLASSHOUSE, RISHIKESH)\\n\\n\n" +
                    "It takes about 45 minutes to go 20 kilometres, from Haridwar to Rishikesh\n" +
                    "Arrive in Haridwar, a city renowned for its spiritual significance and the holy River Ganges, to start your tour.\n" +
                    "Explore the well-known Har Ki Pauri ghat and spend the evening taking in the mesmerising Ganga Aarti ceremony.\n" +
                    "Travel to Rishikesh, the home of yoga, to partake in yoga and meditation practices.\n" +
                    "Visit Ram Jhula and Lakshman Jhula, two famous suspension bridges that provide sweeping vistas of the Ganges.\n" +
                    "Take in the calm ambience of Glasshouse, a peaceful establishment in Rishikesh renowned for its cosy lodgings and restorative ambience.\"\n" +
                    "\n",
            "Day 1:\n" +
                    "Morning:\n" +
                    "Start your day with a visit to the majestic Amber Fort. Explore the fort's stunning architecture, take an elephant ride, and enjoy panoramic views of the surrounding landscape.\n" +
                    "Afternoon:\n" +
                    "Head to the Hawa Mahal, the Palace of Winds. Admire its unique façade and intricate windows. Take a stroll through the local markets nearby and indulge in some shopping.\n\nEvening:\n" +
                    "Visit Johri Bazaar, a bustling market known for its exquisite jewelry, textiles, and handicrafts. Immerse yourself in the vibrant atmosphere, try some local street food, and shop for souvenirs.\n" +
                    "Day 2:\n" +
                    "Morning:\n" +
                    "Explore the grandeur of the City Palace, the royal residence of Jaipur's erstwhile rulers. Marvel at the intricate artwork, visit the museums, and enjoy the beautiful gardens within the palace complex.\n" +
                    "Afternoon:\n" +
                    "Discover the Jantar Mantar, an astronomical observatory with impressive instruments used for astronomical calculations. Learn about the ancient scientific advancements of India and witness the unique celestial devices.\n" +
                    "Evening:\n" +
                    "Take a serene boat ride at Jal Mahal, a picturesque palace situated in the middle of Man Sagar Lake. Enjoy the tranquil surroundings and capture stunning views of the palace reflecting in the water.\n" +
                    "Day 3:\n" +
                    "Morning:\n" +
                    "Visit Nahargarh Fort, located on the Aravalli hills. Explore the fort, take in the panoramic views of Jaipur, and enjoy a leisurely walk through its beautiful surroundings.",
            "Spend your morning by renting and cycling around on a mountain bike through villages in Manali. Vashisht in Manali is named after the sage Vashisht and is home to hot springs, ancient temples and the Beas river.\n" +
                    "\n" +
                    "Alternatively you may even hike up to the Bijli Mahadev temple in Kullu. Nestled among pine trees, orchards and cliffs the centuries old river is also situated where the Beas river meets the Parvati river. \n" +
                    "\n" +
                    "Later in the evening explore the vibrant market of Old Manali. Seeing the bustling market serves as a stepping stone for you to explore the culture. Buy handcrafted souvenirs and drink a cup of steaming hot chai, perhaps even a plate of the pahadi Maggi or a hot bowl of thukpa that you have been craving. When you are in the area you might be lucky to come across impromptu musical performances by the locals. \n" +
                    "\n" +
                    "After a blissful and tiresome day rest at The Orchid Hotel. There are several luxurious rooms for you to choose from during your stay. Whether you fancy a room with an adjoining balcony or a room with the view of lush green Manali be assured that you will find a comfortable stay to end your day. \n\nYour second day in Manali should begin with a scrumptious breakfast The Orchid Hotel, Manali. Breakfast is after all the most important day and you will need the fuel for the adventurous day ahead, since Solang Valley is where you should be headed as your first stop. Go on an ATV ride for an adventure on land but do not leave Manali without paragliding across the panoramic views of the valley. The crisp air hitting against your face you glide across the valley suspended in air will often visit you in your dreams for days to come. \n" +
                    "\n" +
                    "If weather conditions permit, move towards the Rohtang Pass and glance upon snow capped mountains and the peaks of glaciers. Ensure that you have your camera charged for you will be clicking away several pictures over here, trying to capture the Himalayas in its raw beauty. \n" +
                    "\n" +
                    "If you are into mythology do not miss out on the Hadimba temple. The temple is dedicated to Hadimba Devi who is Bhima's wife in the Mahabharata. Bask in the tranquil atmosphere after your adventurous morning and observe the intricate architecture. \n" +
                    "\n" +
                    "In the evening you may explore the Old Manali Market further or cosy up in your room at The Orchid Hotel with our Manali 3 days package. If you are on a honeymoon to this paradise do not forget to check out our offers. ",
            "1. Beaches:\n" +
                    "\n" +
                    "North Goa – Anjuna, Baga, Calangute, Vagator, Arambol\n" +
                    "South Goa – Colva, Majorda, Palolem, Cavelossim(if you have time)\n" +
                    "2. Forts & churches:\n" +
                    "\n" +
                    "Chapora fort: This is the fort featured in Dil Chahta Hai\n" +
                    "Basilica of Bom Jesus: Built in 1605, contains the tomb and the remains of St. Francis Xavier\n" +
                    "Church of our Lady of the Immaculate Conception: This has been shown in many movies that are shot in Goa\n" +
                    "3. Casino:\n" +
                    "\n" +
                    "Deltin Royale( Fri -Sun:2500 rupees ) - Unlimited food, alcoholic drinks, entertainment, and an allotment of playing chips included\n" +
                    "Deltin Jaqk( Mon - Thur:2000 rupees: one time Play Coupon worth 1,500 rupees )\n" +
                    "4. Scuba diving:\n" +
                    "\n" +
                    "Bogmalo Beach - 10 to 15 minutes from the coast of Bogmalo beach is St. Georges Island, divers dive from here to a depth of 2-15 meters depending on weather and sea conditions. This is a good place for beginners to try scuba diving in safe hands.\n" +
                    "The Jetty - Located at the north western tip of Grand Island, this is a very shallow site with a maximum depth of 8 meters and an average depth of 5 to 6 meters. Lots of species of small fish such as the Lionfish and schooling baby mullets are frequently seen here\n" +
                    "Bounty Bay - Several species of small fish as well as hard coral are found here. Cuttlefish and nurse shark have also been seen here. It is ideal for beginners and trainees as the maximum depth is only 6 meters.\n" +
                    "Price: 3,000 - 4,500 per person\n" +
                    "Timings: 6:00 AM to 11:00 AM (All days of week)\n" +
                    "\n" +
                    "5. Clubs:\n" +
                    "\n" +
                    "Curlies (Recommended for its ambiance not for it's DJ)\n" +
                    "Tito's club\n" +
                    "Mambos club\n" +
                    "6. Dudhsagar falls trek - It needs an entire day, so if you can afford that much time, its worth going.\n" +
                    "\n" +
                    "Expected Expenses for this trip per person (prices may vary):\n" +
                    "\n" +
                    "Accommodation near Baga - 1600 (would cost much more near Dec.)\n" +
                    "Bike Rent - 800\n" +
                    "Food - 4000 (Non-Veg) 2000 (Veg)\n" +
                    "Casino - 2000\n" +
                    "Club - 2000\n" +
                    "Water Sports - 500\n" +
                    "Drinks - 1000 (Applicable If you drink)\n" +
                    "Total Cost – 12k approx.\n" +
                    "\n" +
                    "Restaurants one should try:-\n" +
                    "\n" +
                    "Anoushka at Velsao beach\n" +
                    "Delhi darbaar in Panjim\n" +
                    "Royal only chicken in Panaji\n" +
                    "Quatro on way to verna\n" +
                    "Relish near Baga deck hotel –Fish ambotik must try\n" +
                    "Adventures & Miscellaneous activities (prices may vary):-\n" +
                    "\n" +
                    "Casino - 2500\n" +
                    "Clubbing - 1500\n" +
                    "Tattoo - 1000 for 2 sq inches\n" +
                    "Scuba Diving - 3000\n" +
                    "Water Skiing - 800\n" +
                    "Go karting - 300\n" +
                    "Water sports package - 1000\n" +
                    "First Day:-\n" +
                    "Day - Hire bike, Roam around, Resting\n" +
                    "\n" +
                    "Second Day:-\n" +
                    "Day - Full day road trip from North to South Goa\n" +
                    "Night - Flea market or Roam on Beaches\n" +
                    "\n" +
                    "Third Day:-\n" +
                    "Day - Water sports\n" +
                    "Night - Clubbing\n" +
                    "\n" +
                    "Fourth Day:-\n" +
                    "Night - Roam around in Tito's lane or have fun with your friends at room\n" +
                    "\n" +
                    "Fifth Day:-\n" +
                    "Tattoo + Beach Chill out + Resting\n" +
                    "\n" +
                    "There is a lot more that can be added to the plan but you should always leave some things for run-time because you don't need to plan for fun..you just have it!\n" +
                    "\n" +
                    "Have fun..Cheers!!"
        )

        setData()

//        arrDestinationList = arrayListOf<DestinationModel>()

        recViewDestination=view.findViewById(R.id.recViewHome)
        recViewPromotions=view.findViewById(R.id.recViewPromotions)

        recViewDestination.layoutManager = LinearLayoutManager(context,
            LinearLayoutManager.HORIZONTAL,false)
        var RecViewAdapter = RecViewAdapter(requireContext(),arrDestinationList)
        recViewDestination.adapter=RecViewAdapter

        RecViewAdapter.onItemClickListener(object : RecViewAdapter.onItemClickListener {
            override fun onItemClick(position: Int) {
                var intent = Intent(context, UttrakhandActivity::class.java)
                intent.putExtra("name",arrDestinationList[position].strDestination)
                intent.putExtra("image",arrDestinationList[position].img)
                intent.putExtra("content",arrDestinationList[position].content)
                intent.putExtra("headingItenary",arrDestinationList[position].headingItenary)
                intent.putExtra("contentItenary",arrDestinationList[position].contentItenaty)
                startActivity(intent)
            }
        })

        recViewPromotions.layoutManager = LinearLayoutManager(context,
            LinearLayoutManager.HORIZONTAL,false)
        var PromotionsRecViewAdapter = PromotionRecViewAdapter(requireContext(),arrPromotionsList)
        recViewPromotions.adapter=PromotionsRecViewAdapter

        PromotionsRecViewAdapter.onItemClickListener(object :
            PromotionRecViewAdapter.onItemClickListener {
            override fun onItemClick(position: Int) {
                var intent = Intent(context, PromotionsActivity::class.java)
//                intent.putExtra("name",arrDestinationList[position].strDestination)
//                intent.putExtra("image",arrDestinationList[position].img)
//                intent.putExtra("content",arrDestinationList[position].content)
//                intent.putExtra("headingItenary",arrDestinationList[position].headingItenary)
//                intent.putExtra("contentItenary",arrDestinationList[position].contentItenaty)
                startActivity(intent)
            }
        })
        
    }

    private fun setData()
    {
        for (i in arrImg.indices)
        {
            val dest = DestinationModel(arrDestination[i],arrImg[i],arrLike[i],arrDestinationContent[i],arrDestinationItenary[i],arrDestinationItenaryContent[i])
            arrDestinationList.add(dest)

            val destPromotions = PromotionModel(arrImgPromotions[i],arrPromotionsContent[i])
            arrPromotionsList.add(destPromotions)
        }
    }
    
}