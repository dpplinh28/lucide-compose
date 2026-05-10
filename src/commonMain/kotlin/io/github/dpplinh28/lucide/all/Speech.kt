package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Speech") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.8f, 20f)
                verticalLineToRelative(-4.1f)
                lineToRelative(1.9f, .2f)
                arcToRelative(2.3f, 2.3f, 0f, false, false, 2.164f, -2.1f)
                verticalLineTo(8.3f)
                arcTo(5.37f, 5.37f, 0f, false, false, 2f, 8.25f)
                curveToRelative(0f, 2.8f, .656f, 3.054f, 1f, 4.55f)
                arcToRelative(5.77f, 5.77f, 0f, false, true, .029f, 2.758f)
                lineTo(2f, 20f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.8f, 17.8f)
                arcToRelative(7.5f, 7.5f, 0f, false, false, .003f, -10.603f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 15f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, -.025f, -4.975f)
            }
}

public val LucideIcons.All.SpeechDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Speech: ImageVector
    @Composable get() = SpeechDefinition.asImageVector()
