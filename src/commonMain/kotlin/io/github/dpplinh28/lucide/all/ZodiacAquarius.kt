package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ZodiacAquarius") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(2f, 10f)
                lineToRelative(2.456f, -3.684f)
                arcToRelative(.7f, .7f, 0f, false, true, 1.106f, -.013f)
                lineToRelative(2.39f, 3.413f)
                arcToRelative(.7f, .7f, 0f, false, false, 1.096f, -.001f)
                lineToRelative(2.402f, -3.432f)
                arcToRelative(.7f, .7f, 0f, false, true, 1.098f, 0f)
                lineToRelative(2.402f, 3.432f)
                arcToRelative(.7f, .7f, 0f, false, false, 1.098f, 0f)
                lineToRelative(2.389f, -3.413f)
                arcToRelative(.7f, .7f, 0f, false, true, 1.106f, .013f)
                lineTo(22f, 10f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 18.002f)
                lineToRelative(2.456f, -3.684f)
                arcToRelative(.7f, .7f, 0f, false, true, 1.106f, -.013f)
                lineToRelative(2.39f, 3.413f)
                arcToRelative(.7f, .7f, 0f, false, false, 1.097f, 0f)
                lineToRelative(2.402f, -3.432f)
                arcToRelative(.7f, .7f, 0f, false, true, 1.098f, 0f)
                lineToRelative(2.402f, 3.432f)
                arcToRelative(.7f, .7f, 0f, false, false, 1.098f, 0f)
                lineToRelative(2.389f, -3.413f)
                arcToRelative(.7f, .7f, 0f, false, true, 1.106f, .013f)
                lineTo(22f, 18.002f)
            }
}

public val LucideIcons.All.ZodiacAquariusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ZodiacAquarius: ImageVector
    @Composable get() = ZodiacAquariusDefinition.asImageVector()
