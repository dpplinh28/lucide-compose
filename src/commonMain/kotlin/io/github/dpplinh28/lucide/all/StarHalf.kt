package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("StarHalf") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 18.338f)
                arcToRelative(2.1f, 2.1f, 0f, false, false, -.987f, .244f)
                lineTo(6.396f, 21.01f)
                arcToRelative(.53f, .53f, 0f, false, true, -.77f, -.56f)
                lineToRelative(.881f, -5.139f)
                arcToRelative(2.12f, 2.12f, 0f, false, false, -.611f, -1.879f)
                lineTo(2.16f, 9.795f)
                arcToRelative(.53f, .53f, 0f, false, true, .294f, -.906f)
                lineToRelative(5.165f, -.755f)
                arcToRelative(2.12f, 2.12f, 0f, false, false, 1.597f, -1.16f)
                lineToRelative(2.309f, -4.679f)
                arcTo(.53f, .53f, 0f, false, true, 12f, 2f)
            }
}

public val LucideIcons.All.StarHalfDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.StarHalf: ImageVector
    @Composable get() = StarHalfDefinition.asImageVector()
