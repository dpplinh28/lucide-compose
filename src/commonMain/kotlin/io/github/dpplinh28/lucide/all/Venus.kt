package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Venus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 15f)
                verticalLineToRelative(7f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 19f)
                horizontalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f, 9.0f)
                arcToRelative(6.0f, 6.0f, 0f, true, false, 12.0f, 0f)
                arcToRelative(6.0f, 6.0f, 0f, true, false, -12.0f, 0f)
            }
}

public val LucideIcons.All.VenusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Venus: ImageVector
    @Composable get() = VenusDefinition.asImageVector()
