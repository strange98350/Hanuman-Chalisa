package com.example.hanumanchalisa.ui.theme.screen


import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.hanumanchalisa.ui.theme.HanumanChalisaTheme

private val hanumanChalisa = listOf(
    "जय हनुमान ज्ञान गुन सागर। जय कपीस तिहुं लोक उजागर।।\n" +
            "राम दूत अतुलित बल धामा। अंजनि-पुत्र पवनसुत नामा।।",
    "महाबीर बिक्रम बजरंगी। कुमति निवार सुमति के संगी।।\n" +
            "कंचन बरन बिराज सुबेसा। कानन कुण्डल कुँचित केसा।।",
    "हाथ बज्र औ ध्वजा बिराजे। कांधे मूंज जनेउ साजे।।\n" +
            "शंकर सुवन केसरी नंदन। तेज प्रताप महा जग वंदन।।",
    "बिद्यावान गुनी अति चातुर। राम काज करिबे को आतुर।।\n" +
            "प्रभु चरित्र सुनिबे को रसिया। राम लखन सीता मन बसिया।।",
    "सूक्ष्म रूप धरि सियहिं दिखावा। बिकट रूप धरि लंक जरावा।।\n" +
            "भीम रूप धरि असुर संहारे। रामचन्द्र के काज संवारे।।",
    "लाय सजीवन लखन जियाये। श्री रघुबीर हरषि उर लाये।।\n" +
            "रघुपति कीन्ही बहुत बड़ाई। तुम मम प्रिय भरतहि सम भाई।।",
    "सहस बदन तुम्हरो जस गावैं। अस कहि श्रीपति कण्ठ लगावैं।।\n" +
            "सनकादिक ब्रह्मादि मुनीसा। नारद सारद सहित अहीसा।।",
    "जम कुबेर दिगपाल जहां ते। कबि कोबिद कहि सके कहां ते।।\n" +
            "तुम उपकार सुग्रीवहिं कीन्हा। राम मिलाय राज पद दीन्हा।।",
    "तुम्हरो मंत्र बिभीषन माना। लंकेश्वर भए सब जग जाना।।\n" +
            "जुग सहस्र जोजन पर भानु। लील्यो ताहि मधुर फल जानू।।",
    "प्रभु मुद्रिका मेलि मुख माहीं। जलधि लांघि गये अचरज नाहीं।।\n" +
            "दुर्गम काज जगत के जेते। सुगम अनुग्रह तुम्हरे तेते।।",
    "राम दुआरे तुम रखवारे। होत न आज्ञा बिनु पैसारे।।\n" +
            "सब सुख लहै तुम्हारी सरना। तुम रच्छक काहू को डर ना।।",
    "आपन तेज सम्हारो आपै। तीनों लोक हांक तें कांपै।।\n" +
            "भूत पिसाच निकट नहिं आवै। महाबीर जब नाम सुनावै।।",
    "नासै रोग हरे सब पीरा। जपत निरन्तर हनुमत बीरा।।\n" +
            "संकट तें हनुमान छुड़ावै। मन क्रम बचन ध्यान जो लावै।।",
    "सब पर राम तपस्वी राजा। तिन के काज सकल तुम साजा।।\n" +
            "और मनोरथ जो कोई लावै। सोई अमित जीवन फल पावै।।",
    "चारों जुग परताप तुम्हारा। है परसिद्ध जगत उजियारा।।\n" +
            "साधु संत के तुम रखवारे। असुर निकन्दन राम दुलारे।।",
    "अष्टसिद्धि नौ निधि के दाता। अस बर दीन जानकी माता।।\n" +
            "राम रसायन तुम्हरे पासा। सदा रहो रघुपति के दासा।।",
    "तुह्मरे भजन राम को पावै। जनम जनम के दुख बिसरावै।।\n" +
            "अंत काल रघुबर पुर जाई। जहां जन्म हरिभक्त कहाई।।",
    "और देवता चित्त न धरई। हनुमत सेइ सर्ब सुख करई।।\n" +
            "सङ्कट कटै मिटै सब पीरा। जो सुमिरै हनुमत बलबीरा।।",
    "जय जय जय हनुमान गोसाईं। कृपा करहु गुरुदेव की नाईं।।\n" +
            "जो सत बार पाठ कर कोई। छूटहि बन्दि महा सुख होई।।",
    "जो यह पढ़ै हनुमान चालीसा। होय सिद्धि साखी गौरीसा।।\n" +
            "तुलसीदास सदा हरि चेरा। कीजै नाथ हृदय महं डेरा।।"
)

private val hanumanChalisaHindglish = listOf(
    "Jai Hanuman Gyaan Gun Saagar. Jai Kapees Tihun Lok Ujaagar.\nRam Doot Atulit Bal Dhaama. Anjani-Putra Pawansut Naama.",
    "Mahabeer Bikram Bajrangi. Kumati Nivaar Sumati Ke Sangi.\nKanchan Baran Biraaj Subesa. Kaanan Kundal Kunchit Kesa.",
    "Haath Vajra Aur Dhwaja Biraaje. Kaandhe Moonj Janeu Saaje.\nShankar Suvan Kesari Nandan. Tej Prataap Maha Jag Vandan.",
    "Vidyaavaan Guni Ati Chatur. Ram Kaaj Karibe Ko Aatur.\nPrabhu Charitra Sunibe Ko Rasiya. Ram Lakhan Sita Man Basiya.",
    "Sookshma Roop Dhari Siyahin Dikhaava. Vikat Roop Dhari Lank Jaraava.\nBheem Roop Dhari Asur Sanhaare. Ramchandra Ke Kaaj Sawaare.",
    "Laay Sanjeevan Lakhan Jiyaaye. Shri Raghubeer Harashi Ur Laaye.\nRaghupati Keenhi Bahut Badaaee. Tum Mam Priya Bharat Hi Sam Bhaaee.",
    "Sahas Badan Tumharo Jas Gaavein. As Kahi Shripati Kanth Lagaavein.\nSankadik Brahmadi Muneesa. Naarad Saarad Sahit Aheesa.",
    "Yam Kuber Digpaal Jahaan Te. Kavi Kovid Kahi Sake Kahaan Te.\nTum Upkaar Sugreevahin Keenhaa. Ram Milaay Rajpat Deenhaa.",
    "Tumharo Mantra Vibheeshan Maana. Lankeshwar Bhaye Sab Jag Jaana.\nYug Sahasra Yojan Par Bhaanu. Leelyo Taahi Madhur Phal Jaanu.",
    "Prabhu Mudrika Meli Mukh Maahi. Jaladhi Langhi Gaye Acharaj Naahi.\nDurgam Kaaj Jagat Ke Jete. Sugam Anugrah Tumhare Tete.",
    "Ram Duaare Tum Rakhwaare. Hot Na Aagya Binu Paisaare.\nSab Sukh Lahen Tumhari Sharnaa. Tum Rakshak Kaahu Ko Darnaa.",
    "Aapan Tej Samhaaro Aapai. Teenhon Lok Haank Ten Kaapai.\nBhoot Pisaach Nikat Nahin Aavei. Mahabeer Jab Naam Sunaavei.",
    "Naasei Rog Hare Sab Peeraa. Japat Nirantar Hanumat Beeraa.\nSankat Te Hanuman Chhudaavei. Man Kram Vachan Dhyaan Jo Laavei.",
    "Sab Par Ram Tapasvi Raajaa. Tin Ke Kaaj Sakal Tum Saajaa.\nAur Manorath Jo Koi Laavei. Soi Amit Jeevan Phal Paavei.",
    "Chaaro Yug Pratap Tumhaara. Hai Parsiddh Jagat Ujiyaaraa.\nSaadhu Sant Ke Tum Rakhwaare. Asur Nikandan Ram Dulaare.",
    "Ashta Siddhi Nau Nidhi Ke Daataa. As Var Deen Janaki Maataa.\nRam Rasaayan Tumhare Paasaa. Sadaa Raho Raghupati Ke Daasaa.",
    "Tumhare Bhajan Ram Ko Paavei. Janam Janam Ke Dukh Bisraavei.\nAnt Kaal Raghuvar Pur Jaai. Jahan Janm Hari Bhakt Kahai.",
    "Aur Devtaa Chitt Na Dharaee. Hanumat Sei Sarva Sukh Karaee.\nSankat Kate Mite Sab Peeraa. Jo Sumire Hanumat Balbeeraa.",
    "Jai Jai Jai Hanuman Gosaai. Kripa Karahu Gurudev Ki Naai.\nJo Sat Baar Paath Kar Koi. Chhootahin Bandhi Maha Sukh Hoi.",
    "Jo Yah Padhe Hanuman Chaalisaa. Hoye Siddhi Saakhi Gaurisaa.\nTulsi Das Sada Harichera. Keejai Naath Hridaya Mah Dera."
)

@Composable
fun HomeScreen(innerPadding: PaddingValues = PaddingValues(0.dp)) {
    var count by remember { mutableStateOf(0) }
    var isHindglish by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.weight(1f))
        HanumanImage()
        Spacer(modifier = Modifier.height(16.dp)) // Space between the image and button
        ToggleHindglishButton(isHindglish) { isHindglish = !isHindglish }
        Spacer(modifier = Modifier.height(16.dp)) // Space between the button and text
        ChaupaiText(count, isHindglish)
        Spacer(modifier = Modifier.weight(1f))
        NavigationRow(count, hanumanChalisa.size, onPrev = {
            if (count > 0) count--
        }, onNext = {
            if (hanumanChalisa.size - 1 > count) count++
        })
    }
}

@Composable
fun ToggleHindglishButton(isHindglish: Boolean, onClick: () -> Unit) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .padding(horizontal = 95.dp)
            .fillMaxWidth()
    ) {
        Text(text = if (isHindglish) "Switch to Hindi" else "Switch to Hindglish")
    }
}

@Composable
private fun HanumanImage() {
    AsyncImage(
        model = "https://scontent.frdp5-1.fna.fbcdn.net/v/t39.30808-6/366352711_855892225895406_8690056832090688564_n.jpg?_nc_cat=102&ccb=1-7&_nc_sid=6ee11a&_nc_ohc=XnHjITGqFcsQ7kNvgEsrTCI&_nc_ht=scontent.frdp5-1.fna&_nc_gid=AZdTRCZmHZw3IdHdWS_zBXq&oh=00_AYDUTz5mnTQSq_vTa9fMtv2OGmBow_ZDJ0FRt95qyXbsOQ&oe=66E724F1",
        contentDescription = "Hanuman Image",
        modifier = Modifier
            .size(180.dp) // Adjust the size as needed
            .padding(10.dp),
        contentScale = ContentScale.Crop
    )
}

@Composable
private fun ChaupaiText(count: Int, isHindglish: Boolean) {
    val text = if (isHindglish) hanumanChalisaHindglish[count] else hanumanChalisa[count]

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Chaupai ${count + 1} of ${hanumanChalisa.size}",
            style = MaterialTheme.typography.labelMedium,
            modifier = Modifier.padding(9.dp)
        )
        Text(
            text = text,
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.bodyLarge.copy(fontSize = 24.sp),
            color = MaterialTheme.colorScheme.onBackground,
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Composable
private fun NavigationRow(
    currentIndex: Int,
    maxIndex: Int,
    onPrev: () -> Unit,
    onNext: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 55.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Button(
            onClick = onPrev,
            enabled = currentIndex > 0
        ) {
            Text(text = "Prev")
        }
        Button(
            onClick = onNext,
            enabled = currentIndex < maxIndex - 1
        ) {
            Text(text = "Next")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultHomeScreenPreview() {
    HanumanChalisaTheme {
        HomeScreen()
    }
}

