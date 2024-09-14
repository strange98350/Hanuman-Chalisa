package com.example.hanumanchalisa.ui.theme.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.hanumanchalisa.ui.theme.HanumanChalisaTheme
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.hanumanchalisa.R

@Composable
fun GayatriMantraScreen(innerPadding: PaddingValues = PaddingValues(0.dp)) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center // Center vertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.om),
                contentDescription = "Om Symbol",
                modifier = Modifier
                    .size(120.dp)
                    .padding(bottom = 16.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = "ॐ गायत्री मंत्र",
                fontSize = 40.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp)
            )
            Text(
                text = "ॐ भूर्भुवः स्वः \n तत्सवितुर्वरेण्यं \n भर्गो देवस्य धीमहि \n धियो यो नः प्रचोदयात्",
                fontSize = 28.sp,
                textAlign = TextAlign.Center,
                lineHeight = 38.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(1.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GayatriMantraScreenPreview() {
    HanumanChalisaTheme {
        GayatriMantraScreen()
    }
}
