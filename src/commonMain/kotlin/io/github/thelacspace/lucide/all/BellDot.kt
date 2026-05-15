package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BellDot") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.268f, 21f)
                arcToRelative(2f, 2f, 0f, false, false, 3.464f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.68f, 2.009f)
                arcTo(6f, 6f, 0f, false, false, 6f, 8f)
                curveToRelative(0f, 4.499f, -1.411f, 5.956f, -2.738f, 7.326f)
                arcTo(1f, 1f, 0f, false, false, 4f, 17f)
                horizontalLineToRelative(16f)
                arcToRelative(1f, 1f, 0f, false, false, .74f, -1.673f)
                curveToRelative(-.824f, -.85f, -1.678f, -1.731f, -2.21f, -3.348f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f, 5.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
}

public val LucideIcons.All.BellDotDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BellDot: ImageVector
    @Composable get() = BellDotDefinition.asImageVector()
