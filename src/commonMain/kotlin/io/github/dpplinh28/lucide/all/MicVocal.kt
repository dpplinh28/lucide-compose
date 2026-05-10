package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MicVocal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(11f, 7.601f)
                lineToRelative(-5.994f, 8.19f)
                arcToRelative(1f, 1f, 0f, false, false, .1f, 1.298f)
                lineToRelative(.817f, .818f)
                arcToRelative(1f, 1f, 0f, false, false, 1.314f, .087f)
                lineTo(15.09f, 12f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.5f, 21.174f)
                curveTo(15.5f, 20.5f, 14.372f, 20f, 13f, 20f)
                curveToRelative(-2.058f, 0f, -3.928f, 2.356f, -6f, 2f)
                curveToRelative(-2.072f, -.356f, -2.775f, -3.369f, -1.5f, -4.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f, 7.0f)
                arcToRelative(5.0f, 5.0f, 0f, true, false, 10.0f, 0f)
                arcToRelative(5.0f, 5.0f, 0f, true, false, -10.0f, 0f)
            }
}

public val LucideIcons.All.MicVocalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MicVocal: ImageVector
    @Composable get() = MicVocalDefinition.asImageVector()
