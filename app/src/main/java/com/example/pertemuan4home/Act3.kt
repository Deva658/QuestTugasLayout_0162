package com.example.pertemuan4home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ActivitasPertama(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(top = 60.dp, bottom = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = stringResource(id = R.string.Prodi),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(id = R.string.UNIV),
            fontSize = 18.sp,
        )
        Spacer(modifier = Modifier.height(20.dp))
        ProfilCardWidget(
            namaResId = R.string.nama_1,
            alamatResId = R.string.alamat_1,
            noTelpResId = null,
            warnaCardResId = R.color.card_blue,
            warnaAlamatResId = R.color.text_yellow,
            fontFamilyNama = FontFamily.Cursive,
            fontWeightNama = FontWeight.Normal
        )
        ProfilCardWidget(
            namaResId = R.string.nama_2,
            alamatResId = R.string.alamat_2,
            noTelpResId = R.string.notelp_2,
            warnaCardResId = R.color.card_pink,
        )
        ProfilCardWidget(
            namaResId = R.string.nama_3,
            alamatResId = R.string.alamat_3,
            noTelpResId = R.string.notelp_3,
            warnaCardResId = R.color.card_red,
        )
        ProfilCardWidget(
            namaResId = R.string.nama_4,
            alamatResId = R.string.alamat_4,
            noTelpResId = R.string.notelp_4,
            warnaCardResId = R.color.card_gray,
        )
        Spacer(modifier = Modifier.weight(1f))
        Text(
            text = stringResource(id = R.string.copy),
            fontSize = 12.sp,
            color = Color.DarkGray
        )
    }
}

@Composable
fun ProfilCardWidget(
    namaResId: Int,
    alamatResId: Int,
    noTelpResId: Int? = null,
    warnaCardResId: Int,
    warnaAlamatResId: Int = R.color.text_white,
    fontFamilyNama: FontFamily = FontFamily.Default,
    fontWeightNama: FontWeight = FontWeight.Bold
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp, vertical = 8.dp),
        colors = CardDefaults.cardColors(containerColor = colorResource(id = warnaCardResId))
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Image(
                painter = painterResource(id = R.drawable.logo_umy),
                contentDescription = null,
                modifier = Modifier.size(50.dp)
            )
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.weight(1f)
            ){
                Text(
                    text = stringResource(id = namaResId),
                    fontSize = 20.sp,
                    fontFamily = fontFamilyNama,
                    fontWeight = fontWeightNama,
                    color = colorResource(id = R.color.text_white)
                )
                if(noTelpResId != null){
                    Text(
                        text = stringResource(id = noTelpResId),
                        fontSize = 14.sp,
                        color = colorResource(id = R.color.text_cyan)
                    )
                }
                Text(
                    text = stringResource(id = alamatResId),
                    fontSize = 14.sp,
                    color = colorResource(id = warnaAlamatResId)
                )
            }
            Image(
                painter = painterResource(id = R.drawable.logo_umy),
                contentDescription = null,
                modifier = Modifier.size(50.dp)
            )
        }
    }
}