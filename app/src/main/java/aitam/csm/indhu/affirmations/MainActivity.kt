package aitam.csm.indhu.affirmations

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Affirmations()
            }
        }
    }
}

@Composable
fun Affirmations() {

    val affirmations = listOf(

        Affirmation(R.drawable.pic1, text = "I am krishna."),
        Affirmation(R.drawable.pic2, "I am chutki."),
        Affirmation(R.drawable.pic3, "I am a krish."),
        Affirmation(R.drawable.pic1, "I am sanaa."),
        Affirmation(
            R.drawable.pic2,
            "I am a boy and my name is chutki ."
        )
    )

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(12.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(affirmations) { affirmation ->
            AffirmationCard(affirmation)
        }
    }
}

@Composable
fun AffirmationCard(affirmation: Affirmation) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        elevation = CardDefaults.cardElevation(6.dp)
    ) {
        Column {
            Image(
                painter = painterResource(affirmation.imageRes),
                contentDescription = affirmation.text,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp)
                    .clip(
                        RoundedCornerShape(
                            topStart = 12.dp,
                            topEnd = 12.dp
                        )
                    )
            )

            Text(
                text = affirmation.text,
                modifier = Modifier.padding(16.dp),
                style = MaterialTheme.typography.bodyLarge
            )
        }
    }
}

data class Affirmation(
    val imageRes: Int,
    val text: String
)
@Preview(showBackground = true)
@Composable
fun AffirmationsPreview() {
    MaterialTheme {
        Affirmations()
    }
}