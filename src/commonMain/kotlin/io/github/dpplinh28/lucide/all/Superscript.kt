package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Superscript") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(4f, 19f)
                lineToRelative(8f, -8f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(12f, 19f)
                lineToRelative(-8f, -8f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 12f)
                horizontalLineToRelative(-4f)
                curveToRelative(0f, -1.5f, .442f, -2f, 1.5f, -2.5f)
                reflectiveCurveTo(20f, 8.334f, 20f, 7.002f)
                curveToRelative(0f, -.472f, -.17f, -.93f, -.484f, -1.29f)
                arcToRelative(2.105f, 2.105f, 0f, false, false, -2.617f, -.436f)
                curveToRelative(-.42f, .239f, -.738f, .614f, -.899f, 1.06f)
            }
}

public val LucideIcons.All.SuperscriptDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Superscript: ImageVector
    @Composable get() = SuperscriptDefinition.asImageVector()
