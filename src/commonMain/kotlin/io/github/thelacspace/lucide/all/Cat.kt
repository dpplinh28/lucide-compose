package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Cat") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 5f)
                curveToRelative(.67f, 0f, 1.35f, .09f, 2f, .26f)
                curveToRelative(1.78f, -2f, 5.03f, -2.84f, 6.42f, -2.26f)
                curveToRelative(1.4f, .58f, -.42f, 7f, -.42f, 7f)
                curveToRelative(.57f, 1.07f, 1f, 2.24f, 1f, 3.44f)
                curveTo(21f, 17.9f, 16.97f, 21f, 12f, 21f)
                reflectiveCurveToRelative(-9f, -3f, -9f, -7.56f)
                curveToRelative(0f, -1.25f, .5f, -2.4f, 1f, -3.44f)
                curveToRelative(0f, 0f, -1.89f, -6.42f, -.5f, -7f)
                curveToRelative(1.39f, -.58f, 4.72f, .23f, 6.5f, 2.23f)
                arcTo(9.04f, 9.04f, 0f, false, true, 12f, 5f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 14f)
                verticalLineToRelative(.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 14f)
                verticalLineToRelative(.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.25f, 16.25f)
                horizontalLineToRelative(1.5f)
                lineTo(12f, 17f)
                lineToRelative(-.75f, -.75f)
                close()
            }
}

public val LucideIcons.All.CatDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Cat: ImageVector
    @Composable get() = CatDefinition.asImageVector()
