package com.fahime.newsapplication.ui.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.fahime.newsapplication.data.entity.Article
import com.fahime.newsapplication.data.entity.NewsResponse

@Composable
fun Loader() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        CircularProgressIndicator(
            modifier = Modifier
                .size(50.dp)
                .padding(10.dp),
            color = Color.Black
        )
    }
}

@Composable
fun NewsList(response: NewsResponse) {
    LazyColumn {
        items(response.articles) { article ->
            NormalTextComponent(value = article.title ?: "NA")
        }
    }
}

@Composable
fun NormalTextComponent(value: String) {
    Text(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(8.dp),
        text = value,
        style = TextStyle(
            fontSize = 18.sp,
            fontWeight = FontWeight.Normal,
            fontFamily = FontFamily.Monospace,
            color = Color.Blue
        )
    )
}


@Composable
fun HeadingTextComponent(value: String) {
    Text(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(8.dp),
        text = value,
        style = TextStyle(
            fontSize = 24.sp,
            fontWeight = FontWeight.Medium
        )
    )
}
@Composable
fun NewsRowComponent( article: Article) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
    ) {
        AsyncImage(
            modifier = Modifier
                .fillMaxWidth()
                .height(240.dp),
            model = article.urlToImage,
            contentDescription = "",
            contentScale = ContentScale.Fit
        )

        Spacer(modifier = Modifier.size(20.dp))

        HeadingTextComponent(value = article.title ?: "")

        Spacer(modifier = Modifier.size(10.dp))

        AuthorDetailsComponent( article.description ,article.source?.name)



    }
}

@Preview
@Composable
fun NewRowComponentPreview() {
//    val article = Article(
//        author = "dd",
//        title = "ddddds",
//        null,
//        null,
//        null,
//        null,
//        null,
//        null
//    )
//
//    NewsRowComponent(page = 0, article = article)
}

@Composable
fun AuthorDetailsComponent(authorName:String?, sourceName:String?){
    Row (modifier = Modifier.fillMaxHeight()){
       authorName?.let { NormalTextComponent(value =it )}
        sourceName?.let { NormalTextComponent(value =it )}

    }


}