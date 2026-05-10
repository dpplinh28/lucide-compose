package io.github.dpplinh28.lucide

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class LucideIconConfig(
    val strokeWidth: Float = 2f,
    val absoluteStrokeWidth: Boolean = false,
    val color: Color = Color.Unspecified,
    val size: Dp = 24.dp
)

val LocalLucideIconConfig = staticCompositionLocalOf { LucideIconConfig() }

data class LucideIconDefinition(
    val name: String,
    val paths: ImageVector.Builder.(strokeWidth: Float) -> Unit
)

@Composable
fun LucideIconDefinition.asImageVector(
    size: Dp = Dp.Unspecified,
    strokeWidth: Float? = null,
    absoluteStrokeWidth: Boolean? = null
): ImageVector {
    val config = LocalLucideIconConfig.current
    val finalSize = if (size != Dp.Unspecified) size else config.size
    val finalStrokeWidth = strokeWidth ?: config.strokeWidth
    val finalAbsolute = absoluteStrokeWidth ?: config.absoluteStrokeWidth

    val actualStroke = if (finalAbsolute) {
        (24f / finalSize.value) * finalStrokeWidth
    } else {
        finalStrokeWidth
    }

    return remember(this, actualStroke, finalSize) {
        ImageVector.Builder(
            name = name,
            defaultWidth = finalSize,
            defaultHeight = finalSize,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            paths(this, actualStroke)
        }.build()
    }
}

public fun ImageVector.Builder.lucidePath(
    strokeWidth: Float,
    pathBuilder: PathBuilder.() -> Unit
) = path(
    stroke = SolidColor(Color.Black),
    strokeLineWidth = strokeWidth,
    strokeLineCap = StrokeCap.Round,
    strokeLineJoin = StrokeJoin.Round,
    pathBuilder = pathBuilder,
)
